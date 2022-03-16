package com.alibaba.fastjson;

import org.junit.Test;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import java.util.Locale;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.Feature;
import java.util.TimeZone;
import sun.util.calendar.ZoneInfo;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Map;
import java.lang.reflect.Type;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.io.Reader;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public class JSONReaderTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.close();
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "sbuf", null);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 14);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 9);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 7);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        String expected = new String("false");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1005, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 26);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        String expected = new String("[B@36da3930");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1005, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParserParserLexer, "ch");
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 6);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        String expected = new String("true");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1005, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1003, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadString22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        String actual = jSONReader.readString();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1005, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "locale", null);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Long actual = jSONReader.readLong();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 7);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 26);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Long actual = jSONReader.readLong();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "token", 6);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 14);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadLong16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Long actual = jSONReader.readLong();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "sbuf", null);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", -1);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(0, finalJSONReaderParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong23() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 9);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong24() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParserParserLexer, "ch");
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong25() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "features", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        Feature feature = Feature.AutoCloseSource;
        
        jSONReader.config(feature, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testConfig2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "features", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        Feature feature = Feature.AutoCloseSource;
        
        jSONReader.config(feature, true);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerFeatures = getFieldValue(jSONReaderParserParserLexer, "features");
        
        assertEquals(1, finalJSONReaderParserLexerFeatures);
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
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "locale", null);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        Locale actual = jSONReader.getLocal();
        
        assertNull(actual);
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.startArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'S');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser3ParserLexer, "ch");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals(14170, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(25, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '<');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(2, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(1, finalJSONReaderParserLexerPos);
        
        assertEquals(1, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(10, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(11, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerNp);
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(24, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '<');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(jSONReaderScanner, "buf", null);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[0];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerBuf = getFieldValue(jSONReaderParser3ParserLexer, "buf");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(0, finalJSONReaderParserLexerBp);
        
        assertEquals(1, finalJSONReaderParserLexerPos);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", ')');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '<');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14170, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ' ');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '<');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(2, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(1, finalJSONReaderParserLexerPos);
        
        assertEquals(1, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '[');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser3ParserLexer, "pos");
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser3ParserLexer, "pos");
        
        assertEquals(2147483646, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(15, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'u');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "timeZone", null);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '\t');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser3ParserLexer, "ch");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.startObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "timeZone", null);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        ZoneInfo zoneInfo = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object initialJSONReaderParserLexerTimeZone = getFieldValue(jSONReaderParserParserLexer, "timeZone");
        
        jSONReader.setTimzeZone(zoneInfo);
        
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerTimeZone = getFieldValue(jSONReaderParser1ParserLexer, "timeZone");
        
        assertFalse(initialJSONReaderParserLexerTimeZone == finalJSONReaderParserLexerTimeZone);
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '<');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(jSONReaderScanner, "bufLength", -1);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 1);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(jSONReaderScanner, "bufLength", -2147483645);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        InputStreamReader inputStreamReader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(jSONReaderScanner, "reader", inputStreamReader);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(0, finalJSONReaderParserLexerBp);
        
        assertEquals(1, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser3ParserLexer, "pos");
        
        assertEquals(2147483646, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14170, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'S');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser3ParserLexer, "ch");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '[');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 2147483646);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser3ParserLexer, "pos");
        
        assertEquals(2147483646, finalJSONReaderParserLexerNp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2147483646, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", ')');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 7);
        setField(jSONReaderScanner, "ch", '\r');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(jSONReaderScanner, "bufLength", 9);
        char[] charArray = new char[9];
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(0, finalJSONReaderParserLexerBp);
        
        assertEquals('\u0000', finalJSONReaderParserLexerCh);
        
        assertEquals(8, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '<');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(2, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(1, finalJSONReaderParserLexerPos);
        
        assertEquals(1, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray23() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "hasSpecial", false);
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'u');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray24() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(10, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray25() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endArray();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
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
    public void testStartStructure5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(25, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\b');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(17, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser3ParserLexer, "ch");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 1);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser1ParserLexer, "pos");
        
        assertEquals(Integer.MIN_VALUE, finalJSONReaderParserLexerBp);
        
        assertEquals(Integer.MAX_VALUE, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "np", 0);
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", ' ');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 16);
        setField(jSONReaderScanner, "bufLength", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method startStructureMethod = jSONReaderClazz.getDeclaredMethod("startStructure");
        startStructureMethod.setAccessible(true);
        java.lang.Object[] startStructureMethodArguments = new java.lang.Object[0];
        try {
            startStructureMethod.invoke(jSONReader, startStructureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONStreamContext, "parent", jSONStreamContext);
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONStreamContext, "parent", jSONStreamContext);
        setField(jSONReader, "context", jSONStreamContext);
        
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
    public void testEndStructure5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONStreamContext, "parent", jSONStreamContext);
        setField(jSONReader, "context", jSONStreamContext);
        
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
    public void testReadInteger1() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        charArray[0] = ' ';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Integer actual = jSONReader.readInteger();
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "token", 9);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 7);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Integer actual = jSONReader.readInteger();
        
        Integer expected = 0;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 4);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", -1);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(0, finalJSONReaderParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 6);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Integer actual = jSONReader.readInteger();
        
        Integer expected = 1;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\n');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParserParserLexer, "ch");
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 22);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 3);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        charArray[0] = '\u001A';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Integer actual = jSONReader.readInteger();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        
        assertEquals(1002, finalJSONReaderContextState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 12);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger23() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", true);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "sbuf", null);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger24() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 23);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Integer actual = jSONReader.readInteger();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
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
    public void testReadBefore6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
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
    public void testReadBefore7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(25, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(17, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(15, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ' ');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(24, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(13, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadBefore17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'N');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        try {
            readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParser1ParserLexer, "sp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser2ParserLexer, "bp");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser3ParserLexer, "ch");
        
        assertEquals(-1, finalJSONReaderParserLexerNp);
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        
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
    
    @Test(timeout = 10000)
    public void testHasNext3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        boolean actual = jSONReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasNext4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.hasNext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1004;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        boolean actual = jSONReader.hasNext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        boolean actual = jSONReader.hasNext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasNext7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        boolean actual = jSONReader.hasNext();
        
        assertFalse(actual);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(null);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 15);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1003, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 18);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        charArray[0] = '\n';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 21);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject13() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject14() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "token", 9);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject15() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\b');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(14169, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject16() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject17() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject18() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0001');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
        
        Object jSONReaderContext = getFieldValue(jSONReader, "context");
        Object finalJSONReaderContextState = getFieldValue(jSONReaderContext, "state");
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(1002, finalJSONReaderContextState);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject19() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 7);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object actual = jSONReader.readObject();
        
        Boolean expected = false;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject20() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", -1);
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerNp = getFieldValue(jSONReaderParserParserLexer, "np");
        
        assertEquals(0, finalJSONReaderParserLexerNp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject21() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject();
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(11, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject22() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 20);
        char[] charArray = new char[9];
        charArray[0] = '\u001A';
        setField(jSONReaderScanner, "buf", charArray);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object actual = jSONReader.readObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject23() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject24() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1006;
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject25() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject26() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject27() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject28() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(11, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject29() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject30() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject31() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject32() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject33() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject34() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject35() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject36() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject37() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject38() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject39() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '(');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(10, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject40() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject41() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Object actual = jSONReader.readObject(typeVariableImpl);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject42() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 't');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject43() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ';');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(24, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject44() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject45() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject46() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        jSONReader.readObject(typeVariableImpl);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject47() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ' ');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject48() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object actual = jSONReader.readObject(((Type) null));
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject49() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '}');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(13, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject50() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Object actual = jSONReader.readObject(typeVariableImpl);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(11, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject51() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '+');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject52() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        
        Object actual = jSONReader.readObject(typeVariableImpl);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject53() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject54() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(15, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject55() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\u8008');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Type) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject56() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((TypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject57() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        ParserConfig parserConfig = ((ParserConfig) createInstance("com.alibaba.fastjson.parser.ParserConfig"));
        IdentityHashMap identityHashMap = ((IdentityHashMap) createInstance("com.alibaba.fastjson.util.IdentityHashMap"));
        setField(identityHashMap, "indexMask", 38);
        java.lang.Object[] entryArray = createArray("com.alibaba.fastjson.util.IdentityHashMap$Entry", 39);
        setField(identityHashMap, "buckets", entryArray);
        setField(parserConfig, "deserializers", identityHashMap);
        setField(defaultExtJSONParser, "config", parserConfig);
        setField(jSONReader, "parser", defaultExtJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserConfig = getFieldValue(jSONReaderParser, "config");
        Object jSONReaderParserParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParserParserConfig, "deserializers");
        Object jSONReaderParserParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParserParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets0 = get(jSONReaderParserParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 0);
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserConfig = getFieldValue(jSONReaderParser1, "config");
        Object jSONReaderParser1ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser1ParserConfig, "deserializers");
        Object jSONReaderParser1ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser1ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets1 = get(jSONReaderParser1ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 1);
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserConfig = getFieldValue(jSONReaderParser2, "config");
        Object jSONReaderParser2ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser2ParserConfig, "deserializers");
        Object jSONReaderParser2ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser2ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets2 = get(jSONReaderParser2ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 2);
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserConfig = getFieldValue(jSONReaderParser3, "config");
        Object jSONReaderParser3ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser3ParserConfig, "deserializers");
        Object jSONReaderParser3ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser3ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets3 = get(jSONReaderParser3ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 3);
        Object jSONReaderParser4 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser4ParserConfig = getFieldValue(jSONReaderParser4, "config");
        Object jSONReaderParser4ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser4ParserConfig, "deserializers");
        Object jSONReaderParser4ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser4ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets4 = get(jSONReaderParser4ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 4);
        Object jSONReaderParser5 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser5ParserConfig = getFieldValue(jSONReaderParser5, "config");
        Object jSONReaderParser5ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser5ParserConfig, "deserializers");
        Object jSONReaderParser5ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser5ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets5 = get(jSONReaderParser5ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 5);
        Object jSONReaderParser6 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser6ParserConfig = getFieldValue(jSONReaderParser6, "config");
        Object jSONReaderParser6ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser6ParserConfig, "deserializers");
        Object jSONReaderParser6ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser6ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets6 = get(jSONReaderParser6ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 6);
        Object jSONReaderParser7 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser7ParserConfig = getFieldValue(jSONReaderParser7, "config");
        Object jSONReaderParser7ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser7ParserConfig, "deserializers");
        Object jSONReaderParser7ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser7ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets7 = get(jSONReaderParser7ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 7);
        Object jSONReaderParser8 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser8ParserConfig = getFieldValue(jSONReaderParser8, "config");
        Object jSONReaderParser8ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser8ParserConfig, "deserializers");
        Object jSONReaderParser8ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser8ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets8 = get(jSONReaderParser8ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 8);
        Object jSONReaderParser9 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser9ParserConfig = getFieldValue(jSONReaderParser9, "config");
        Object jSONReaderParser9ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser9ParserConfig, "deserializers");
        Object jSONReaderParser9ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser9ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets9 = get(jSONReaderParser9ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 9);
        Object jSONReaderParser10 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser10ParserConfig = getFieldValue(jSONReaderParser10, "config");
        Object jSONReaderParser10ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser10ParserConfig, "deserializers");
        Object jSONReaderParser10ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser10ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets10 = get(jSONReaderParser10ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 10);
        Object jSONReaderParser11 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser11ParserConfig = getFieldValue(jSONReaderParser11, "config");
        Object jSONReaderParser11ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser11ParserConfig, "deserializers");
        Object jSONReaderParser11ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser11ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets11 = get(jSONReaderParser11ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 11);
        Object jSONReaderParser12 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser12ParserConfig = getFieldValue(jSONReaderParser12, "config");
        Object jSONReaderParser12ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser12ParserConfig, "deserializers");
        Object jSONReaderParser12ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser12ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets12 = get(jSONReaderParser12ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 12);
        Object jSONReaderParser13 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser13ParserConfig = getFieldValue(jSONReaderParser13, "config");
        Object jSONReaderParser13ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser13ParserConfig, "deserializers");
        Object jSONReaderParser13ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser13ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets13 = get(jSONReaderParser13ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 13);
        Object jSONReaderParser14 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser14ParserConfig = getFieldValue(jSONReaderParser14, "config");
        Object jSONReaderParser14ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser14ParserConfig, "deserializers");
        Object jSONReaderParser14ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser14ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets14 = get(jSONReaderParser14ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 14);
        Object jSONReaderParser15 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser15ParserConfig = getFieldValue(jSONReaderParser15, "config");
        Object jSONReaderParser15ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser15ParserConfig, "deserializers");
        Object jSONReaderParser15ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser15ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets15 = get(jSONReaderParser15ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 15);
        Object jSONReaderParser16 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser16ParserConfig = getFieldValue(jSONReaderParser16, "config");
        Object jSONReaderParser16ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser16ParserConfig, "deserializers");
        Object jSONReaderParser16ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser16ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets16 = get(jSONReaderParser16ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 16);
        Object jSONReaderParser17 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser17ParserConfig = getFieldValue(jSONReaderParser17, "config");
        Object jSONReaderParser17ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser17ParserConfig, "deserializers");
        Object jSONReaderParser17ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser17ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets17 = get(jSONReaderParser17ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 17);
        Object jSONReaderParser18 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser18ParserConfig = getFieldValue(jSONReaderParser18, "config");
        Object jSONReaderParser18ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser18ParserConfig, "deserializers");
        Object jSONReaderParser18ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser18ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets18 = get(jSONReaderParser18ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 18);
        Object jSONReaderParser19 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser19ParserConfig = getFieldValue(jSONReaderParser19, "config");
        Object jSONReaderParser19ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser19ParserConfig, "deserializers");
        Object jSONReaderParser19ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser19ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets19 = get(jSONReaderParser19ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 19);
        Object jSONReaderParser20 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser20ParserConfig = getFieldValue(jSONReaderParser20, "config");
        Object jSONReaderParser20ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser20ParserConfig, "deserializers");
        Object jSONReaderParser20ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser20ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets20 = get(jSONReaderParser20ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 20);
        Object jSONReaderParser21 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser21ParserConfig = getFieldValue(jSONReaderParser21, "config");
        Object jSONReaderParser21ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser21ParserConfig, "deserializers");
        Object jSONReaderParser21ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser21ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets21 = get(jSONReaderParser21ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 21);
        Object jSONReaderParser22 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser22ParserConfig = getFieldValue(jSONReaderParser22, "config");
        Object jSONReaderParser22ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser22ParserConfig, "deserializers");
        Object jSONReaderParser22ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser22ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets22 = get(jSONReaderParser22ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 22);
        Object jSONReaderParser23 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser23ParserConfig = getFieldValue(jSONReaderParser23, "config");
        Object jSONReaderParser23ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser23ParserConfig, "deserializers");
        Object jSONReaderParser23ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser23ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets23 = get(jSONReaderParser23ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 23);
        Object jSONReaderParser24 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser24ParserConfig = getFieldValue(jSONReaderParser24, "config");
        Object jSONReaderParser24ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser24ParserConfig, "deserializers");
        Object jSONReaderParser24ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser24ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets24 = get(jSONReaderParser24ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 24);
        Object jSONReaderParser25 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser25ParserConfig = getFieldValue(jSONReaderParser25, "config");
        Object jSONReaderParser25ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser25ParserConfig, "deserializers");
        Object jSONReaderParser25ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser25ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets25 = get(jSONReaderParser25ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 25);
        Object jSONReaderParser26 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser26ParserConfig = getFieldValue(jSONReaderParser26, "config");
        Object jSONReaderParser26ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser26ParserConfig, "deserializers");
        Object jSONReaderParser26ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser26ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets26 = get(jSONReaderParser26ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 26);
        Object jSONReaderParser27 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser27ParserConfig = getFieldValue(jSONReaderParser27, "config");
        Object jSONReaderParser27ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser27ParserConfig, "deserializers");
        Object jSONReaderParser27ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser27ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets27 = get(jSONReaderParser27ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 27);
        Object jSONReaderParser28 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser28ParserConfig = getFieldValue(jSONReaderParser28, "config");
        Object jSONReaderParser28ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser28ParserConfig, "deserializers");
        Object jSONReaderParser28ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser28ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets28 = get(jSONReaderParser28ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 28);
        Object jSONReaderParser29 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser29ParserConfig = getFieldValue(jSONReaderParser29, "config");
        Object jSONReaderParser29ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser29ParserConfig, "deserializers");
        Object jSONReaderParser29ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser29ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets29 = get(jSONReaderParser29ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 29);
        Object jSONReaderParser30 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser30ParserConfig = getFieldValue(jSONReaderParser30, "config");
        Object jSONReaderParser30ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser30ParserConfig, "deserializers");
        Object jSONReaderParser30ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser30ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets30 = get(jSONReaderParser30ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 30);
        Object jSONReaderParser31 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser31ParserConfig = getFieldValue(jSONReaderParser31, "config");
        Object jSONReaderParser31ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser31ParserConfig, "deserializers");
        Object jSONReaderParser31ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser31ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets31 = get(jSONReaderParser31ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 31);
        Object jSONReaderParser32 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser32ParserConfig = getFieldValue(jSONReaderParser32, "config");
        Object jSONReaderParser32ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser32ParserConfig, "deserializers");
        Object jSONReaderParser32ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser32ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets32 = get(jSONReaderParser32ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 32);
        Object jSONReaderParser33 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser33ParserConfig = getFieldValue(jSONReaderParser33, "config");
        Object jSONReaderParser33ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser33ParserConfig, "deserializers");
        Object jSONReaderParser33ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser33ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets33 = get(jSONReaderParser33ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 33);
        Object jSONReaderParser34 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser34ParserConfig = getFieldValue(jSONReaderParser34, "config");
        Object jSONReaderParser34ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser34ParserConfig, "deserializers");
        Object jSONReaderParser34ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser34ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets34 = get(jSONReaderParser34ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 34);
        Object jSONReaderParser35 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser35ParserConfig = getFieldValue(jSONReaderParser35, "config");
        Object jSONReaderParser35ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser35ParserConfig, "deserializers");
        Object jSONReaderParser35ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser35ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets35 = get(jSONReaderParser35ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 35);
        Object jSONReaderParser36 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser36ParserConfig = getFieldValue(jSONReaderParser36, "config");
        Object jSONReaderParser36ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser36ParserConfig, "deserializers");
        Object jSONReaderParser36ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser36ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets36 = get(jSONReaderParser36ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 36);
        Object jSONReaderParser37 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser37ParserConfig = getFieldValue(jSONReaderParser37, "config");
        Object jSONReaderParser37ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser37ParserConfig, "deserializers");
        Object jSONReaderParser37ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser37ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets37 = get(jSONReaderParser37ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 37);
        Object jSONReaderParser38 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser38ParserConfig = getFieldValue(jSONReaderParser38, "config");
        Object jSONReaderParser38ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser38ParserConfig, "deserializers");
        Object jSONReaderParser38ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser38ParserConfigParserConfigDeserializers, "buckets");
        Object initialJSONReaderParserConfigDeserializersBuckets38 = get(jSONReaderParser38ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 38);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser39 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser39ParserConfig = getFieldValue(jSONReaderParser39, "config");
        Object jSONReaderParser39ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser39ParserConfig, "deserializers");
        Object jSONReaderParser39ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser39ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets0 = get(jSONReaderParser39ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 0);
        Object jSONReaderParser40 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser40ParserConfig = getFieldValue(jSONReaderParser40, "config");
        Object jSONReaderParser40ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser40ParserConfig, "deserializers");
        Object jSONReaderParser40ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser40ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets1 = get(jSONReaderParser40ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 1);
        Object jSONReaderParser41 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser41ParserConfig = getFieldValue(jSONReaderParser41, "config");
        Object jSONReaderParser41ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser41ParserConfig, "deserializers");
        Object jSONReaderParser41ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser41ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets2 = get(jSONReaderParser41ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 2);
        Object jSONReaderParser42 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser42ParserConfig = getFieldValue(jSONReaderParser42, "config");
        Object jSONReaderParser42ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser42ParserConfig, "deserializers");
        Object jSONReaderParser42ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser42ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets3 = get(jSONReaderParser42ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 3);
        Object jSONReaderParser43 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser43ParserConfig = getFieldValue(jSONReaderParser43, "config");
        Object jSONReaderParser43ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser43ParserConfig, "deserializers");
        Object jSONReaderParser43ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser43ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets4 = get(jSONReaderParser43ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 4);
        Object jSONReaderParser44 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser44ParserConfig = getFieldValue(jSONReaderParser44, "config");
        Object jSONReaderParser44ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser44ParserConfig, "deserializers");
        Object jSONReaderParser44ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser44ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets5 = get(jSONReaderParser44ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 5);
        Object jSONReaderParser45 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser45ParserConfig = getFieldValue(jSONReaderParser45, "config");
        Object jSONReaderParser45ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser45ParserConfig, "deserializers");
        Object jSONReaderParser45ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser45ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets6 = get(jSONReaderParser45ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 6);
        Object jSONReaderParser46 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser46ParserConfig = getFieldValue(jSONReaderParser46, "config");
        Object jSONReaderParser46ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser46ParserConfig, "deserializers");
        Object jSONReaderParser46ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser46ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets7 = get(jSONReaderParser46ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 7);
        Object jSONReaderParser47 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser47ParserConfig = getFieldValue(jSONReaderParser47, "config");
        Object jSONReaderParser47ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser47ParserConfig, "deserializers");
        Object jSONReaderParser47ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser47ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets8 = get(jSONReaderParser47ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 8);
        Object jSONReaderParser48 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser48ParserConfig = getFieldValue(jSONReaderParser48, "config");
        Object jSONReaderParser48ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser48ParserConfig, "deserializers");
        Object jSONReaderParser48ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser48ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets9 = get(jSONReaderParser48ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 9);
        Object jSONReaderParser49 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser49ParserConfig = getFieldValue(jSONReaderParser49, "config");
        Object jSONReaderParser49ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser49ParserConfig, "deserializers");
        Object jSONReaderParser49ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser49ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets10 = get(jSONReaderParser49ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 10);
        Object jSONReaderParser50 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser50ParserConfig = getFieldValue(jSONReaderParser50, "config");
        Object jSONReaderParser50ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser50ParserConfig, "deserializers");
        Object jSONReaderParser50ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser50ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets11 = get(jSONReaderParser50ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 11);
        Object jSONReaderParser51 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser51ParserConfig = getFieldValue(jSONReaderParser51, "config");
        Object jSONReaderParser51ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser51ParserConfig, "deserializers");
        Object jSONReaderParser51ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser51ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets12 = get(jSONReaderParser51ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 12);
        Object jSONReaderParser52 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser52ParserConfig = getFieldValue(jSONReaderParser52, "config");
        Object jSONReaderParser52ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser52ParserConfig, "deserializers");
        Object jSONReaderParser52ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser52ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets13 = get(jSONReaderParser52ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 13);
        Object jSONReaderParser53 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser53ParserConfig = getFieldValue(jSONReaderParser53, "config");
        Object jSONReaderParser53ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser53ParserConfig, "deserializers");
        Object jSONReaderParser53ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser53ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets14 = get(jSONReaderParser53ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 14);
        Object jSONReaderParser54 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser54ParserConfig = getFieldValue(jSONReaderParser54, "config");
        Object jSONReaderParser54ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser54ParserConfig, "deserializers");
        Object jSONReaderParser54ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser54ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets15 = get(jSONReaderParser54ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 15);
        Object jSONReaderParser55 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser55ParserConfig = getFieldValue(jSONReaderParser55, "config");
        Object jSONReaderParser55ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser55ParserConfig, "deserializers");
        Object jSONReaderParser55ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser55ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets16 = get(jSONReaderParser55ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 16);
        Object jSONReaderParser56 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser56ParserConfig = getFieldValue(jSONReaderParser56, "config");
        Object jSONReaderParser56ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser56ParserConfig, "deserializers");
        Object jSONReaderParser56ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser56ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets17 = get(jSONReaderParser56ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 17);
        Object jSONReaderParser57 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser57ParserConfig = getFieldValue(jSONReaderParser57, "config");
        Object jSONReaderParser57ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser57ParserConfig, "deserializers");
        Object jSONReaderParser57ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser57ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets18 = get(jSONReaderParser57ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 18);
        Object jSONReaderParser58 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser58ParserConfig = getFieldValue(jSONReaderParser58, "config");
        Object jSONReaderParser58ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser58ParserConfig, "deserializers");
        Object jSONReaderParser58ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser58ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets19 = get(jSONReaderParser58ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 19);
        Object jSONReaderParser59 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser59ParserConfig = getFieldValue(jSONReaderParser59, "config");
        Object jSONReaderParser59ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser59ParserConfig, "deserializers");
        Object jSONReaderParser59ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser59ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets20 = get(jSONReaderParser59ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 20);
        Object jSONReaderParser60 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser60ParserConfig = getFieldValue(jSONReaderParser60, "config");
        Object jSONReaderParser60ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser60ParserConfig, "deserializers");
        Object jSONReaderParser60ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser60ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets21 = get(jSONReaderParser60ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 21);
        Object jSONReaderParser61 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser61ParserConfig = getFieldValue(jSONReaderParser61, "config");
        Object jSONReaderParser61ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser61ParserConfig, "deserializers");
        Object jSONReaderParser61ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser61ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets22 = get(jSONReaderParser61ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 22);
        Object jSONReaderParser62 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser62ParserConfig = getFieldValue(jSONReaderParser62, "config");
        Object jSONReaderParser62ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser62ParserConfig, "deserializers");
        Object jSONReaderParser62ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser62ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets23 = get(jSONReaderParser62ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 23);
        Object jSONReaderParser63 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser63ParserConfig = getFieldValue(jSONReaderParser63, "config");
        Object jSONReaderParser63ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser63ParserConfig, "deserializers");
        Object jSONReaderParser63ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser63ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets24 = get(jSONReaderParser63ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 24);
        Object jSONReaderParser64 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser64ParserConfig = getFieldValue(jSONReaderParser64, "config");
        Object jSONReaderParser64ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser64ParserConfig, "deserializers");
        Object jSONReaderParser64ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser64ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets25 = get(jSONReaderParser64ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 25);
        Object jSONReaderParser65 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser65ParserConfig = getFieldValue(jSONReaderParser65, "config");
        Object jSONReaderParser65ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser65ParserConfig, "deserializers");
        Object jSONReaderParser65ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser65ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets26 = get(jSONReaderParser65ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 26);
        Object jSONReaderParser66 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser66ParserConfig = getFieldValue(jSONReaderParser66, "config");
        Object jSONReaderParser66ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser66ParserConfig, "deserializers");
        Object jSONReaderParser66ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser66ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets27 = get(jSONReaderParser66ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 27);
        Object jSONReaderParser67 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser67ParserConfig = getFieldValue(jSONReaderParser67, "config");
        Object jSONReaderParser67ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser67ParserConfig, "deserializers");
        Object jSONReaderParser67ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser67ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets28 = get(jSONReaderParser67ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 28);
        Object jSONReaderParser68 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser68ParserConfig = getFieldValue(jSONReaderParser68, "config");
        Object jSONReaderParser68ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser68ParserConfig, "deserializers");
        Object jSONReaderParser68ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser68ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets29 = get(jSONReaderParser68ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 29);
        Object jSONReaderParser69 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser69ParserConfig = getFieldValue(jSONReaderParser69, "config");
        Object jSONReaderParser69ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser69ParserConfig, "deserializers");
        Object jSONReaderParser69ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser69ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets30 = get(jSONReaderParser69ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 30);
        Object jSONReaderParser70 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser70ParserConfig = getFieldValue(jSONReaderParser70, "config");
        Object jSONReaderParser70ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser70ParserConfig, "deserializers");
        Object jSONReaderParser70ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser70ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets31 = get(jSONReaderParser70ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 31);
        Object jSONReaderParser71 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser71ParserConfig = getFieldValue(jSONReaderParser71, "config");
        Object jSONReaderParser71ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser71ParserConfig, "deserializers");
        Object jSONReaderParser71ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser71ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets32 = get(jSONReaderParser71ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 32);
        Object jSONReaderParser72 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser72ParserConfig = getFieldValue(jSONReaderParser72, "config");
        Object jSONReaderParser72ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser72ParserConfig, "deserializers");
        Object jSONReaderParser72ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser72ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets33 = get(jSONReaderParser72ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 33);
        Object jSONReaderParser73 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser73ParserConfig = getFieldValue(jSONReaderParser73, "config");
        Object jSONReaderParser73ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser73ParserConfig, "deserializers");
        Object jSONReaderParser73ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser73ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets34 = get(jSONReaderParser73ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 34);
        Object jSONReaderParser74 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser74ParserConfig = getFieldValue(jSONReaderParser74, "config");
        Object jSONReaderParser74ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser74ParserConfig, "deserializers");
        Object jSONReaderParser74ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser74ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets35 = get(jSONReaderParser74ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 35);
        Object jSONReaderParser75 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser75ParserConfig = getFieldValue(jSONReaderParser75, "config");
        Object jSONReaderParser75ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser75ParserConfig, "deserializers");
        Object jSONReaderParser75ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser75ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets36 = get(jSONReaderParser75ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 36);
        Object jSONReaderParser76 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser76ParserConfig = getFieldValue(jSONReaderParser76, "config");
        Object jSONReaderParser76ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser76ParserConfig, "deserializers");
        Object jSONReaderParser76ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser76ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets37 = get(jSONReaderParser76ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 37);
        Object jSONReaderParser77 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser77ParserConfig = getFieldValue(jSONReaderParser77, "config");
        Object jSONReaderParser77ParserConfigParserConfigDeserializers = getFieldValue(jSONReaderParser77ParserConfig, "deserializers");
        Object jSONReaderParser77ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets = getFieldValue(jSONReaderParser77ParserConfigParserConfigDeserializers, "buckets");
        Object finalJSONReaderParserConfigDeserializersBuckets38 = get(jSONReaderParser77ParserConfigParserConfigDeserializersParserConfigDeserializersBuckets, 38);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets0);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets1);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets2);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets3);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets4);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets5);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets6);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets7);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets8);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets9);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets10);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets11);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets12);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets13);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets14);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets15);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets16);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets17);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets18);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets19);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets20);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets21);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets22);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets23);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets24);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets25);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets26);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets27);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets28);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets29);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets30);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets31);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets32);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets33);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets34);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets35);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets36);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets37);
        
        assertNull(finalJSONReaderParserConfigDeserializersBuckets38);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject58() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", 'T');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject59() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        Object actual = jSONReader.readObject(typeReference);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject60() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(15, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject61() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject62() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '.');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(25, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject63() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "sp", 0);
        setField(jSONReaderScanner, "bp", 0);
        setField(jSONReaderScanner, "ch", '-');
        setField(jSONReaderScanner, "pos", 0);
        setField(jSONReaderScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject64() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 65536);
        setField(jSONScanner, "token", 4);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        Class class1 = Object.class;
        setField(typeReference, "type", class1);
        
        jSONReader.readObject(typeReference);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject65() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\r');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14169, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14169, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject66() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject67() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject68() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject69() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject70() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject71() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 4);
        String string = new String("");
        setField(jSONScanner, "text", string);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        Class class1 = Object.class;
        
        jSONReader.readObject(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject72() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 1);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerPos = getFieldValue(jSONReaderParser2ParserLexer, "pos");
        
        assertEquals(14170, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14170, finalJSONReaderParserLexerPos);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject73() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "ch", '\f');
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParserParserLexer, "ch");
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject74() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        Object jSONReaderParser3 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser3ParserLexer = getFieldValue(jSONReaderParser3, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser3ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(2, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject75() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", Integer.MAX_VALUE);
        setField(jSONScanner, "ch", '\u001A');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", Integer.MIN_VALUE);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser1ParserLexer, "token");
        
        assertEquals(0, finalJSONReaderParserLexerBp);
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject76() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'n');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject77() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '[');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(14, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject78() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\'');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject79() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        Class class1 = Object.class;
        
        Object actual = jSONReader.readObject(class1);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject80() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ')');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(11, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject81() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'u');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerSp = getFieldValue(jSONReaderParserParserLexer, "sp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParser1ParserLexer, "bp");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser2ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject82() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(15, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject83() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(12, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadObject84() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 8);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        Class class1 = Object.class;
        
        Object actual = jSONReader.readObject(class1);
        
        assertNull(actual);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        Object jSONReaderParser2 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser2ParserLexer = getFieldValue(jSONReaderParser2, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParser2ParserLexer, "token");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject85() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'f');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject86() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(jSONScanner, "len", 0);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerBp = getFieldValue(jSONReaderParserParserLexer, "bp");
        Object jSONReaderParser1 = getFieldValue(jSONReader, "parser");
        Object jSONReaderParser1ParserLexer = getFieldValue(jSONReaderParser1, "lexer");
        Object finalJSONReaderParserLexerCh = getFieldValue(jSONReaderParser1ParserLexer, "ch");
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
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
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
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
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReader actual = new JSONReader(defaultJSONParser);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJSONReader4() {
        new JSONReader(((JSONLexer) null));
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testJSONReader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testJSONReader_errors1()
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
    public void testJSONReader7() {
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
