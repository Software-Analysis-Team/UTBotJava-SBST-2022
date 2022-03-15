package com.alibaba.fastjson;

import org.junit.Test;
import java.util.Locale;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.DefaultExtJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.Feature;
import java.util.TimeZone;
import java.lang.reflect.Method;
import sun.util.calendar.ZoneInfo;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import java.util.Map;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong4() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        setField(jSONReader, "context", null);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.readLong();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadLong7() throws Throwable  {
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
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadString6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readString();
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
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "locale", null);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        Locale actual = jSONReader.getLocal();
        
        assertNull(actual);
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
        setField(jSONScanner, "hasSpecial", false);
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
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
    public void testEndObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
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
    public void testEndObject9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
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
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "np", 0);
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '2');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.endObject();
        
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
    public void testEndObject11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ':');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
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
        
        assertEquals(17, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndObject12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '{');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 13);
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
        
        assertEquals(12, finalJSONReaderParserLexerToken);
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
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
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
    public void testStartObject3() throws Throwable  {
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
    public void testStartObject4() throws Throwable  {
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
    public void testStartObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startObject();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
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
    public void testStartObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.startObject();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        setField(jSONReader, "context", jSONStreamContext);
        
        jSONReader.startObject();
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
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '-');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
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
    public void testEndArray3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
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
    public void testEndArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ']');
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
    public void testEndArray5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
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
    public void testEndArray6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'T');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 15);
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
        
        assertEquals(1, finalJSONReaderParserLexerSp);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEndArray7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", 'x');
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
    public void testEndArray8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
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
        
        assertEquals(16, finalJSONReaderParserLexerToken);
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
        setField(jSONScanner, "ch", 'f');
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
    
    @Test(timeout = 10000)
    public void testStartStructure5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
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
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartStructure6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
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
    public void testStartStructure7() throws Throwable  {
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
    public void testStartStructure8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ',');
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
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStartStructure9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
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
    public void testStartStructure10() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(defaultExtJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
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
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
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
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
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
    public void testReadInteger6() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 2);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadInteger8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readInteger();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadInteger9() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "token", 20);
        setField(defaultJSONParser, "lexer", jSONScanner);
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
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '/');
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
    public void testReadBefore7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
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
    
    @Test(timeout = 10000)
    public void testReadBefore8() throws Throwable  {
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
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
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
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore10() throws Throwable  {
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
        
        assertEquals(16, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore11() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReadBefore12() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1003;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Class jSONReaderClazz = Class.forName("com.alibaba.fastjson.JSONReader");
        Method readBeforeMethod = jSONReaderClazz.getDeclaredMethod("readBefore");
        readBeforeMethod.setAccessible(true);
        java.lang.Object[] readBeforeMethodArguments = new java.lang.Object[0];
        readBeforeMethod.invoke(jSONReader, readBeforeMethodArguments);
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
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
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", ' ');
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
    public void testStartArray3() throws Throwable  {
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
    public void testStartArray4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
        Object finalJSONReaderContext = getFieldValue(jSONReader, "context");
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
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
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\u0000');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
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
    public void testStartArray6() throws Throwable  {
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
        
        assertFalse(initialJSONReaderContext == finalJSONReaderContext);
        
        assertEquals(1, finalJSONReaderParserLexerBp);
        
        assertEquals('\u001A', finalJSONReaderParserLexerCh);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStartArray7() throws Throwable  {
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
    public void testStartArray8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONScanner jSONScanner = ((JSONScanner) createInstance("com.alibaba.fastjson.parser.JSONScanner"));
        setField(jSONScanner, "sp", 0);
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '\"');
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
        setField(jSONScanner, "bp", 0);
        setField(jSONScanner, "ch", '@');
        setField(jSONScanner, "pos", 0);
        setField(jSONScanner, "token", 16);
        setField(defaultJSONParser, "lexer", jSONScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        
        Object initialJSONReaderContext = getFieldValue(jSONReader, "context");
        
        jSONReader.startArray();
        
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
        
        jSONReader.readObject(((TypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject2() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1001;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject3() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1002;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 17);
        setField(defaultJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultJSONParser);
        TypeReference typeReference = ((TypeReference) createInstance("com.alibaba.fastjson.TypeReference"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        setField(typeReference, "type", typeVariableImpl);
        
        jSONReader.readObject(typeReference);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject4() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        
        jSONReader.readObject(((Map) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject5() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        jSONStreamContext.state = 1005;
        setField(jSONReader, "context", jSONStreamContext);
        DefaultExtJSONParser defaultExtJSONParser = ((DefaultExtJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultExtJSONParser"));
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        jSONReader.readObject(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject6() throws Throwable  {
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
        
        jSONReader.readObject(((Class) null));
        
        Object jSONReaderParser = getFieldValue(jSONReader, "parser");
        Object jSONReaderParserParserLexer = getFieldValue(jSONReaderParser, "lexer");
        Object finalJSONReaderParserLexerToken = getFieldValue(jSONReaderParserParserLexer, "token");
        
        assertEquals(20, finalJSONReaderParserLexerToken);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject7() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        Object object = new Object();
        
        jSONReader.readObject(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadObject8() throws Throwable  {
        JSONReader jSONReader = ((JSONReader) createInstance("com.alibaba.fastjson.JSONReader"));
        JSONStreamContext jSONStreamContext = ((JSONStreamContext) createInstance("com.alibaba.fastjson.JSONStreamContext"));
        setField(jSONReader, "context", jSONStreamContext);
        java.lang.Object[] childClassLoaderArray = createArray("org.springframework.expression.spel.standard.SpelCompiler$ChildClassLoader", 0);
        
        jSONReader.readObject(childClassLoaderArray);
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
        JSONReaderScanner jSONReaderScanner = ((JSONReaderScanner) createInstance("com.alibaba.fastjson.parser.JSONReaderScanner"));
        setField(jSONReaderScanner, "token", 0);
        setField(defaultExtJSONParser, "lexer", jSONReaderScanner);
        setField(jSONReader, "parser", defaultExtJSONParser);
        
        int actual = jSONReader.peek();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJSONReader1() throws Throwable  {
        DefaultJSONParser defaultJSONParser = ((DefaultJSONParser) createInstance("com.alibaba.fastjson.parser.DefaultJSONParser"));
        JSONReader actual = new JSONReader(defaultJSONParser);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testJSONReader3() {
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
    public void testJSONReader6() {
        new JSONReader(((Reader) null));
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
