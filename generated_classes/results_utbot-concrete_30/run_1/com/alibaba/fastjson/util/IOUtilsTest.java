package com.alibaba.fastjson.util;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.Inflater;
import java.util.zip.GZIPOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class IOUtilsTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF81() throws Throwable  {
        char[] charArray = new char[0];
        byte[] byteArray = new byte[0];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 0, byteArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF82() throws Throwable  {
        char[] charArray = new char[9];
        
        IOUtils.encodeUTF8(charArray, 0, 0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF83() throws Throwable  {
        char[] charArray = new char[17];
        byte[] byteArray = new byte[9];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 0, byteArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetStringProperty1() throws Throwable  {
        String string = new String();
        
        IOUtils.getStringProperty(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLoadPropertiesFromFile1() throws Throwable  {
        IOUtils.loadPropertiesFromFile();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLoadPropertiesFromFile2() throws Throwable  {
        IOUtils.loadPropertiesFromFile();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFirstIdentifier1() throws Throwable  {
        boolean actual = IOUtils.firstIdentifier('\u0000');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsIdent1() throws Throwable  {
        boolean actual = IOUtils.isIdent('\u0000');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase641() throws Throwable  {
        String string = new String();
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase642() throws Throwable  {
        IOUtils.decodeBase64(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase643() throws Throwable  {
        String string = new String("");
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase644() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase645() throws Throwable  {
        char[] charArray = new char[0];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase646() throws Throwable  {
        char[] charArray = new char[17];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase647() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase648() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '=';
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase649() throws Throwable  {
        char[] charArray = new char[9];
        
        IOUtils.decodeBase64(charArray, 1744830368, -1744830367);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6410() throws Throwable  {
        char[] charArray = new char[9];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6411() throws Throwable  {
        char[] charArray = new char[9];
        
        byte[] actual = IOUtils.decodeBase64(charArray, Integer.MAX_VALUE, -2147483646);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6412() throws Throwable  {
        char[] charArray = new char[12];
        
        IOUtils.decodeBase64(charArray, 2147483601, -2147483600);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6413() throws Throwable  {
        IOUtils.decodeBase64(((char[]) null), -1717038592, 368049920);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6414() throws Throwable  {
        IOUtils.decodeBase64(((char[]) null), 965345280, -100786176);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6415() throws Throwable  {
        String string = new String();
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6416() throws Throwable  {
        byte[] actual = IOUtils.decodeBase64(((String) null), 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6417() throws Throwable  {
        IOUtils.decodeBase64(((String) null), 715827880, -2147483640);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6418() throws Throwable  {
        String string = new String("\u0000");
        
        IOUtils.decodeBase64(string, 1583338752, -1583338751);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6419() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6420() throws Throwable  {
        IOUtils.decodeBase64(((String) null), -2147483376, 7963720);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6421() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 715827882, -715827881);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6422() throws Throwable  {
        String string = new String("\u0000");
        
        IOUtils.decodeBase64(string, 1431655752, -1431655751);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6423() throws Throwable  {
        String string = new String("=");
        
        IOUtils.decodeBase64(string, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6424() throws Throwable  {
        IOUtils.decodeBase64(((String) null), 1073741952, -1072136104);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF81() throws Throwable  {
        byte[] byteArray = new byte[0];
        char[] charArray = new char[0];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 0, charArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF82() throws Throwable  {
        byte[] byteArray = new byte[9];
        
        IOUtils.decodeUTF8(byteArray, 0, 0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF83() throws Throwable  {
        byte[] byteArray = new byte[9];
        char[] charArray = new char[32];
        
        IOUtils.decodeUTF8(byteArray, 1073741824, 1, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF84() throws Throwable  {
        char[] charArray = new char[0];
        
        int actual = IOUtils.decodeUTF8(null, 16384, -2147478517, charArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF85() throws Throwable  {
        byte[] byteArray = new byte[9];
        char[] charArray = new char[16];
        
        IOUtils.decodeUTF8(byteArray, -1333606242, -1073874947, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF86() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[33] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[31];
        
        int actual = IOUtils.decodeUTF8(byteArray, 33, 31, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF87() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[32] = (byte) -16;
        char[] charArray = new char[17];
        
        int actual = IOUtils.decodeUTF8(byteArray, 32, 2, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF88() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -32;
        char[] charArray = new char[40];
        
        IOUtils.decodeUTF8(byteArray, 8, 39, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF89() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[32] = (byte) -32;
        char[] charArray = new char[15];
        
        int actual = IOUtils.decodeUTF8(byteArray, 32, 1, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF810() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[33] = (byte) -64;
        char[] charArray = new char[31];
        
        int actual = IOUtils.decodeUTF8(byteArray, 33, 31, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF811() throws Throwable  {
        byte[] byteArray = new byte[34];
        byteArray[32] = (byte) -62;
        char[] charArray = new char[15];
        
        int actual = IOUtils.decodeUTF8(byteArray, 32, 1, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF812() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[40];
        
        IOUtils.decodeUTF8(byteArray, 8, 39, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF813() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -62;
        char[] charArray = new char[40];
        
        IOUtils.decodeUTF8(byteArray, 8, 39, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF814() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -31;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[11];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 11, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF815() throws Throwable  {
        byte[] byteArray = new byte[10];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[40];
        
        IOUtils.decodeUTF8(byteArray, 8, 39, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF816() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -32;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[12];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 11, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF817() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[1] = (byte) -62;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 1, 38, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF818() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -31;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        byteArray[5] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[11];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 11, charArray);
        
        assertEquals(9, actual);
        
        char finalCharArray0 = charArray[0];
        
        assertEquals('\u1000', finalCharArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF819() throws Throwable  {
        byte[] byteArray = new byte[17];
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 1, charArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReadAll1() throws Throwable  {
        IOUtils.readAll(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidJsonpQueryParam1() throws Throwable  {
        String string = new String();
        
        boolean actual = IOUtils.isValidJsonpQueryParam(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidJsonpQueryParam2() throws Throwable  {
        boolean actual = IOUtils.isValidJsonpQueryParam(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidJsonpQueryParam3() throws Throwable  {
        String string = new String("");
        
        boolean actual = IOUtils.isValidJsonpQueryParam(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidJsonpQueryParam4() throws Throwable  {
        String string = new String(".");
        
        boolean actual = IOUtils.isValidJsonpQueryParam(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidJsonpQueryParam5() throws Throwable  {
        String string = new String(".\u0000");
        
        boolean actual = IOUtils.isValidJsonpQueryParam(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars1() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.getChars(0, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars2() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(-65537, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars3() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(0, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars4() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.getChars((byte) 0, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars5() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.getChars(0L, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars6() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(-1073774592L, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars7() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(4611686018427387904L, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars8() throws Throwable  {
        IOUtils.getChars(1L, 0, ((char[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode1() throws Throwable  {
        IOUtils.decode(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode2() throws Throwable  {
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class charsetDecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", charsetDecoderType, directByteBufferRType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = null;
        decodeMethodArguments[1] = directByteBufferR;
        decodeMethodArguments[2] = heapCharBufferR;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode3() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        
        IOUtils.decode(uTF8Decoder, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode4() throws Throwable  {
        Object decoder = createInstance("sun.nio.cs.US_ASCII$Decoder");
        setField(decoder, "state", 0);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "position", 0);
        setField(heapCharBufferR, "isReadOnly", false);
        char[] charArray = new char[0];
        setField(heapCharBufferR, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class decoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", decoderType, heapByteBufferType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = decoder;
        decodeMethodArguments[1] = heapByteBuffer;
        decodeMethodArguments[2] = heapCharBufferR;
        decodeMethod.invoke(null, decodeMethodArguments);
        
        Object finalDecoderState = getFieldValue(decoder, "state");
        
        assertEquals(3, finalDecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode5() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 1);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "limit", 0);
        setField(heapCharBufferR, "position", 0);
        setField(heapCharBufferR, "isReadOnly", false);
        char[] charArray = new char[0];
        setField(heapCharBufferR, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBuffer;
        decodeMethodArguments[2] = heapCharBufferR;
        decodeMethod.invoke(null, decodeMethodArguments);
        
        Object finalUTF8DecoderState = getFieldValue(uTF8Decoder, "state");
        
        assertEquals(3, finalUTF8DecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode6() throws Throwable  {
        Object decoder = createInstance("sun.nio.cs.US_ASCII$Decoder");
        setField(decoder, "state", 1);
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 1);
        setField(heapByteBufferR, "position", 0);
        setField(heapByteBufferR, "isReadOnly", true);
        setField(heapByteBufferR, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBufferR, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "limit", 0);
        setField(heapCharBufferR, "position", 0);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class decoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", decoderType, heapByteBufferRType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = decoder;
        decodeMethodArguments[1] = heapByteBufferR;
        decodeMethodArguments[2] = heapCharBufferR;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDecoderState = getFieldValue(decoder, "state");
        
        assertEquals(2, finalDecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose1() throws Throwable  {
        IOUtils.close(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose2() throws Throwable  {
        IOUtils.close(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose3() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        setField(jarInputStream, "closed", true);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeMethod = iOUtilsClazz.getDeclaredMethod("close", jarInputStreamType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[1];
        closeMethodArguments[0] = jarInputStream;
        closeMethod.invoke(null, closeMethodArguments);
        
        Object finalJarInputStreamClosed = getFieldValue(jarInputStream, "closed");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalJarInputStreamClosedType = boolean.class;
        Method assertFalseMethod = assertClazz.getDeclaredMethod("assertFalse", finalJarInputStreamClosedType);
        assertFalseMethod.setAccessible(true);
        java.lang.Object[] assertFalseMethodArguments = new java.lang.Object[1];
        assertFalseMethodArguments[0] = finalJarInputStreamClosed;
        assertFalseMethod.invoke(null, assertFalseMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose4() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(zipInputStream, "in", null);
        setField(zipInputStream, "usesDefaultInflater", false);
        setField(zipInputStream, "closed", true);
        setField(zipInputStream, "inf", null);
        setField(jarInputStream, "in", zipInputStream);
        setField(jarInputStream, "usesDefaultInflater", true);
        setField(jarInputStream, "closed", false);
        Inflater inflater = ((Inflater) createInstance("java.util.zip.Inflater"));
        setField(inflater, "buf", null);
        Object zStreamRef = createInstance("java.util.zip.ZStreamRef");
        setField(zStreamRef, "address", -9223372036854775807L);
        setField(inflater, "zsRef", zStreamRef);
        setField(jarInputStream, "inf", inflater);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeMethod = iOUtilsClazz.getDeclaredMethod("close", jarInputStreamType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[1];
        closeMethodArguments[0] = jarInputStream;
        closeMethod.invoke(null, closeMethodArguments);
        
        Object finalJarInputStreamClosed = getFieldValue(jarInputStream, "closed");
        Object jarInputStreamInf = getFieldValue(jarInputStream, "inf");
        Object jarInputStreamInfInfZsRef = getFieldValue(jarInputStreamInf, "zsRef");
        Object finalJarInputStreamInfZsRefAddress = getFieldValue(jarInputStreamInfInfZsRef, "address");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalJarInputStreamClosedType = boolean.class;
        Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalJarInputStreamClosedType);
        assertTrueMethod.setAccessible(true);
        java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
        assertTrueMethodArguments[0] = finalJarInputStreamClosed;
        assertTrueMethod.invoke(null, assertTrueMethodArguments);
        
        assertEquals(0L, finalJarInputStreamInfZsRefAddress);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose5() throws Throwable  {
        GZIPOutputStream gZIPOutputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        setField(gZIPOutputStream, "closed", true);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class gZIPOutputStreamType = Class.forName("java.io.Closeable");
        Method closeMethod = iOUtilsClazz.getDeclaredMethod("close", gZIPOutputStreamType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[1];
        closeMethodArguments[0] = gZIPOutputStream;
        closeMethod.invoke(null, closeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose6() throws Throwable  {
        JarInputStream jarInputStream = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(zipInputStream, "in", null);
        setField(zipInputStream, "usesDefaultInflater", false);
        setField(zipInputStream, "closed", false);
        setField(zipInputStream, "inf", null);
        setField(jarInputStream, "in", zipInputStream);
        setField(jarInputStream, "usesDefaultInflater", true);
        setField(jarInputStream, "closed", false);
        Inflater inflater = ((Inflater) createInstance("java.util.zip.Inflater"));
        Object zStreamRef = createInstance("java.util.zip.ZStreamRef");
        setField(zStreamRef, "address", 0L);
        setField(inflater, "zsRef", zStreamRef);
        setField(jarInputStream, "inf", inflater);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class jarInputStreamType = Class.forName("java.io.Closeable");
        Method closeMethod = iOUtilsClazz.getDeclaredMethod("close", jarInputStreamType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[1];
        closeMethodArguments[0] = jarInputStream;
        closeMethod.invoke(null, closeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize1() throws Throwable  {
        int actual = IOUtils.stringSize(0L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize2() throws Throwable  {
        int actual = IOUtils.stringSize(-9223372036854775797L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize3() throws Throwable  {
        int actual = IOUtils.stringSize(11L);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize4() throws Throwable  {
        int actual = IOUtils.stringSize(1000000000000000000L);
        
        assertEquals(19, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIOUtils1() {
        IOUtils actual = new IOUtils();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIOUtils2() {
        IOUtils actual = new IOUtils();
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
