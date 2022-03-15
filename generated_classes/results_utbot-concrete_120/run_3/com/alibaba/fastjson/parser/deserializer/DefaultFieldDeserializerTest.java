package com.alibaba.fastjson.util;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.Inflater;
import java.util.zip.GZIPOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF83() throws Throwable  {
        char[] charArray = new char[9];
        byte[] byteArray = new byte[32];
        
        IOUtils.encodeUTF8(charArray, 1073741824, 1, byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF84() throws Throwable  {
        byte[] byteArray = new byte[0];
        
        int actual = IOUtils.encodeUTF8(null, 66046, -1073725439, byteArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF85() throws Throwable  {
        char[] charArray = new char[2];
        byte[] byteArray = new byte[0];
        
        IOUtils.encodeUTF8(charArray, -2147428752, -2147440503, byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF86() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '\uE000';
        byte[] byteArray = new byte[1];
        
        IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) -18, finalByteArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF87() throws Throwable  {
        char[] charArray = new char[9];
        charArray[8] = '\uD800';
        byte[] byteArray = new byte[15];
        
        IOUtils.encodeUTF8(charArray, 8, 15, byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF88() throws Throwable  {
        char[] charArray = new char[15];
        charArray[14] = '\uE000';
        byte[] byteArray = new byte[2];
        
        IOUtils.encodeUTF8(charArray, 14, 2, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) -18, finalByteArray0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF89() throws Throwable  {
        char[] charArray = new char[9];
        byte[] byteArray = new byte[9];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF810() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '\u0080';
        byte[] byteArray = new byte[1];
        
        IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) -62, finalByteArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF811() throws Throwable  {
        char[] charArray = new char[15];
        charArray[9] = '\uD800';
        byte[] byteArray = new byte[14];
        
        IOUtils.encodeUTF8(charArray, 9, 9, byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF812() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '\uDC00';
        byte[] byteArray = new byte[32];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
        assertEquals(1, actual);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 63, finalByteArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF813() throws Throwable  {
        char[] charArray = new char[15];
        charArray[9] = '\uD800';
        charArray[10] = '\uE000';
        byte[] byteArray = new byte[14];
        
        IOUtils.encodeUTF8(charArray, 9, 9, byteArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF814() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '\uD800';
        byte[] byteArray = new byte[32];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
        assertEquals(1, actual);
        
        byte finalByteArray0 = byteArray[0];
        
        assertEquals((byte) 63, finalByteArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF815() throws Throwable  {
        char[] charArray = new char[15];
        charArray[14] = '\u0080';
        byte[] byteArray = new byte[32];
        
        int actual = IOUtils.encodeUTF8(charArray, 14, 1, byteArray);
        
        assertEquals(2, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) -62, finalByteArray0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF816() throws Throwable  {
        char[] charArray = new char[11];
        charArray[1] = '\uD800';
        charArray[2] = '\uDC00';
        byte[] byteArray = new byte[2];
        
        IOUtils.encodeUTF8(charArray, 1, 2, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        assertEquals((byte) -16, finalByteArray0);
        
        assertEquals((byte) -112, finalByteArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF817() throws Throwable  {
        char[] charArray = new char[11];
        charArray[1] = '\uD800';
        charArray[2] = '\uDC00';
        byte[] byteArray = new byte[3];
        
        IOUtils.encodeUTF8(charArray, 1, 3, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) -16, finalByteArray0);
        
        assertEquals((byte) -112, finalByteArray1);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF818() throws Throwable  {
        char[] charArray = new char[11];
        charArray[0] = '\uD800';
        charArray[1] = '\uDC00';
        byte[] byteArray = new byte[33];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 2, byteArray);
        
        assertEquals(4, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        
        assertEquals((byte) -16, finalByteArray0);
        
        assertEquals((byte) -112, finalByteArray1);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray2);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray3);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF819() throws Throwable  {
        char[] charArray = new char[35];
        charArray[33] = '\uE000';
        byte[] byteArray = new byte[3];
        
        IOUtils.encodeUTF8(charArray, 33, 2, byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) -18, finalByteArray0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray1);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEncodeUTF820() throws Throwable  {
        char[] charArray = new char[11];
        charArray[0] = '\uE000';
        byte[] byteArray = new byte[33];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 2, byteArray);
        
        assertEquals(4, actual);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) -18, finalByteArray0);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray1);
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalByteArray2);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetStringProperty2() throws Throwable  {
        IOUtils.getStringProperty(null);
    }
    ///endregion
    
    
    ///region Errors report for getStringProperty
    
    public void testGetStringProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase645() throws Throwable  {
        String string = new String("=");
        
        IOUtils.decodeBase64(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase646() throws Throwable  {
        char[] charArray = new char[0];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase647() throws Throwable  {
        char[] charArray = new char[17];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase648() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase649() throws Throwable  {
        char[] charArray = new char[9];
        charArray[0] = '=';
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6410() throws Throwable  {
        char[] charArray = new char[9];
        
        IOUtils.decodeBase64(charArray, 1744830465, -1744830464);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6411() throws Throwable  {
        char[] charArray = new char[2];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6412() throws Throwable  {
        char[] charArray = new char[9];
        
        byte[] actual = IOUtils.decodeBase64(charArray, Integer.MAX_VALUE, -2147483646);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6413() throws Throwable  {
        String string = new String();
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6414() throws Throwable  {
        byte[] actual = IOUtils.decodeBase64(((String) null), 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6415() throws Throwable  {
        IOUtils.decodeBase64(((String) null), 44564576, -2147483624);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6416() throws Throwable  {
        String string = new String("\u0000");
        
        IOUtils.decodeBase64(string, 1073741824, -1073741823);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6417() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6418() throws Throwable  {
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 715827882, -715827881);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6419() throws Throwable  {
        String string = new String("=");
        
        IOUtils.decodeBase64(string, 0, 1);
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
        
        int actual = IOUtils.decodeUTF8(null, 1073754112, -2147483453, charArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF85() throws Throwable  {
        byte[] byteArray = new byte[9];
        char[] charArray = new char[12];
        
        IOUtils.decodeUTF8(byteArray, -1341819120, -1073881167, charArray);
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
        
        int actual = IOUtils.decodeUTF8(byteArray, 32, 2, charArray);
        
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
        char[] charArray = new char[12];
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF818() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[40];
        
        IOUtils.decodeUTF8(byteArray, 8, 37, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF819() throws Throwable  {
        byte[] byteArray = new byte[9];
        char[] charArray = new char[9];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 1, charArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF820() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -19;
        byteArray[4] = (byte) -96;
        byteArray[5] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[12];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 11, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF821() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 37, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF822() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 37, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF823() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) -24;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        byteArray[2] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[34];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 3, charArray);
        
        assertEquals(1, actual);
        
        char finalCharArray0 = charArray[0];
        
        assertEquals('\u8000', finalCharArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF824() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 37, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF825() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        byteArray[5] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 37, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF826() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -10;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        byteArray[5] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[40];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 37, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF827() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) -62;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[33];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 2, charArray);
        
        assertEquals(1, actual);
        
        char finalCharArray0 = charArray[0];
        
        assertEquals('\u0080', finalCharArray0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF828() throws Throwable  {
        byte[] byteArray = new byte[31];
        byteArray[17] = (byte) -12;
        byteArray[18] = java.lang.Byte.MIN_VALUE;
        byteArray[19] = java.lang.Byte.MIN_VALUE;
        byteArray[20] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[33];
        
        int actual = IOUtils.decodeUTF8(byteArray, 17, 4, charArray);
        
        assertEquals(2, actual);
        
        char finalCharArray0 = charArray[0];
        char finalCharArray1 = charArray[1];
        
        assertEquals('\uDBC0', finalCharArray0);
        
        assertEquals('\uDC00', finalCharArray1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF829() throws Throwable  {
        byte[] byteArray = new byte[37];
        byteArray[32] = (byte) -12;
        byteArray[33] = java.lang.Byte.MIN_VALUE;
        byteArray[34] = java.lang.Byte.MIN_VALUE;
        byteArray[35] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 32, 5, charArray);
        
        assertEquals(3, actual);
        
        char finalCharArray0 = charArray[0];
        char finalCharArray1 = charArray[1];
        
        assertEquals('\uDBC0', finalCharArray0);
        
        assertEquals('\uDC00', finalCharArray1);
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
        String string = new String("...............\u0000");
        
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
        char[] charArray = new char[0];
        
        IOUtils.getChars((byte) 0, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars3() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.getChars(0L, 0, charArray);
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
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class charsetDecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class byteBufferType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", charsetDecoderType, byteBufferType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = null;
        decodeMethodArguments[1] = null;
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode4() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 0);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 0);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class charBufferType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferType, charBufferType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBuffer;
        decodeMethodArguments[2] = null;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalUTF8DecoderState = getFieldValue(uTF8Decoder, "state");
        
        assertEquals(2, finalUTF8DecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode5() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 1057226694);
        setField(directByteBuffer, "position", -1073741759);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 1073741767);
        byte[] byteArray = new byte[9];
        byteArray[8] = java.lang.Byte.MIN_VALUE;
        setField(directByteBuffer, "hb", byteArray);
        Object byteBufferAsCharBufferB = createInstance("java.nio.ByteBufferAsCharBufferB");
        setField(byteBufferAsCharBufferB, "limit", -1073741882);
        setField(byteBufferAsCharBufferB, "position", 1572897);
        setField(byteBufferAsCharBufferB, "isReadOnly", false);
        setField(byteBufferAsCharBufferB, "offset", 1073741799);
        char[] charArray = new char[9];
        setField(byteBufferAsCharBufferB, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class byteBufferAsCharBufferBType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, byteBufferAsCharBufferBType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = byteBufferAsCharBufferB;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalByteBufferAsCharBufferBOffset = getFieldValue(byteBufferAsCharBufferB, "offset");
        
        assertEquals(0, finalByteBufferAsCharBufferBOffset);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode6() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", -543144959);
        setField(heapByteBuffer, "position", -543144960);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 543144960);
        byte[] byteArray = new byte[11];
        byteArray[0] = (byte) -16;
        setField(heapByteBuffer, "hb", byteArray);
        Object byteBufferAsCharBufferL = createInstance("java.nio.ByteBufferAsCharBufferL");
        setField(byteBufferAsCharBufferL, "limit", -1675624448);
        setField(byteBufferAsCharBufferL, "position", 682950656);
        setField(byteBufferAsCharBufferL, "isReadOnly", false);
        setField(byteBufferAsCharBufferL, "offset", 529784832);
        char[] charArray = new char[9];
        setField(byteBufferAsCharBufferL, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class byteBufferAsCharBufferLType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferType, byteBufferAsCharBufferLType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBuffer;
        decodeMethodArguments[2] = byteBufferAsCharBufferL;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalByteBufferAsCharBufferLOffset = getFieldValue(byteBufferAsCharBufferL, "offset");
        
        assertEquals(0, finalByteBufferAsCharBufferLOffset);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode7() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", -1082121214);
        setField(directByteBuffer, "position", -1082121216);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 1082121239);
        byte[] byteArray = new byte[39];
        byteArray[23] = (byte) -32;
        setField(directByteBuffer, "hb", byteArray);
        Object directCharBufferRS = createInstance("java.nio.DirectCharBufferRS");
        setField(directCharBufferRS, "limit", 1610681360);
        setField(directCharBufferRS, "position", 1606355080);
        setField(directCharBufferRS, "isReadOnly", false);
        setField(directCharBufferRS, "offset", 4248958);
        char[] charArray = new char[9];
        setField(directCharBufferRS, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRSType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, directCharBufferRSType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = directCharBufferRS;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode8() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBufferR = createInstance("java.nio.DirectByteBufferR");
        setField(directByteBufferR, "limit", 1082130963);
        setField(directByteBufferR, "position", 2147479552);
        setField(directByteBufferR, "mark", 0);
        setField(directByteBufferR, "isReadOnly", false);
        setField(directByteBufferR, "offset", -2147479520);
        byte[] byteArray = new byte[33];
        byteArray[32] = java.lang.Byte.MIN_VALUE;
        setField(directByteBufferR, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "limit", 1568801344);
        setField(heapCharBufferR, "position", -807319036);
        setField(heapCharBufferR, "mark", 0);
        setField(heapCharBufferR, "isReadOnly", false);
        setField(heapCharBufferR, "offset", -596396228);
        char[] charArray = new char[9];
        setField(heapCharBufferR, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class heapCharBufferRType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferRType, heapCharBufferRType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBufferR;
        decodeMethodArguments[2] = heapCharBufferR;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDirectByteBufferRPosition = getFieldValue(directByteBufferR, "position");
        
        assertEquals(32, finalDirectByteBufferRPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode9() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 0);
        setField(directByteBuffer, "position", -1);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 16);
        byte[] byteArray = new byte[40];
        byteArray[15] = (byte) -64;
        setField(directByteBuffer, "hb", byteArray);
        Object stringCharBuffer = createInstance("java.nio.StringCharBuffer");
        setField(stringCharBuffer, "limit", -1316945506);
        setField(stringCharBuffer, "position", -552991744);
        setField(stringCharBuffer, "isReadOnly", false);
        setField(stringCharBuffer, "offset", -1030341056);
        char[] charArray = new char[9];
        setField(stringCharBuffer, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class stringCharBufferType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, stringCharBufferType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = stringCharBuffer;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode10() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 33554446);
        setField(directByteBuffer, "position", -1375731704);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 1375731708);
        byte[] byteArray = new byte[12];
        byteArray[4] = (byte) -64;
        setField(directByteBuffer, "hb", byteArray);
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        setField(directCharBufferRU, "limit", -873486337);
        setField(directCharBufferRU, "position", 1342177280);
        setField(directCharBufferRU, "isReadOnly", false);
        setField(directCharBufferRU, "offset", 353392644);
        char[] charArray = new char[12];
        setField(directCharBufferRU, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRUType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, directCharBufferRUType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = directCharBufferRU;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDirectByteBufferPosition = getFieldValue(directByteBuffer, "position");
        
        assertEquals(4, finalDirectByteBufferPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode11() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 805306336);
        setField(directByteBuffer, "position", -1073741802);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 1073741825);
        byte[] byteArray = new byte[30];
        byteArray[23] = (byte) -16;
        setField(directByteBuffer, "hb", byteArray);
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        setField(directCharBufferRU, "limit", -943702016);
        setField(directCharBufferRU, "position", 1472201792);
        setField(directCharBufferRU, "isReadOnly", false);
        setField(directCharBufferRU, "offset", 0);
        char[] charArray = new char[10];
        setField(directCharBufferRU, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRUType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, directCharBufferRUType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = directCharBufferRU;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode12() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 0);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", -1);
        setField(heapByteBuffer, "position", 2);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "limit", 2147483646);
        setField(heapCharBufferR, "position", 1073741824);
        setField(heapCharBufferR, "isReadOnly", false);
        setField(heapCharBufferR, "offset", 1073741824);
        char[] charArray = new char[9];
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
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalUTF8DecoderState = getFieldValue(uTF8Decoder, "state");
        
        assertEquals(2, finalUTF8DecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode13() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 0);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 536869574);
        setField(directByteBuffer, "position", -1073755959);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 1073755959);
        byte[] byteArray = new byte[25];
        byteArray[0] = (byte) -32;
        setField(directByteBuffer, "hb", byteArray);
        Object directCharBufferRS = createInstance("java.nio.DirectCharBufferRS");
        setField(directCharBufferRS, "limit", -1073738720);
        setField(directCharBufferRS, "position", 1606289544);
        setField(directCharBufferRS, "isReadOnly", false);
        setField(directCharBufferRS, "offset", 1077937530);
        char[] charArray = new char[9];
        setField(directCharBufferRS, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRSType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, directCharBufferRSType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = directCharBufferRS;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalUTF8DecoderState = getFieldValue(uTF8Decoder, "state");
        
        assertEquals(2, finalUTF8DecoderState);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode14() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 2063597554);
        setField(heapByteBufferR, "position", -54525952);
        setField(heapByteBufferR, "isReadOnly", false);
        setField(heapByteBufferR, "offset", 54525953);
        byte[] byteArray = new byte[11];
        byteArray[2] = java.lang.Byte.MIN_VALUE;
        setField(heapByteBufferR, "hb", byteArray);
        Object directCharBufferU = createInstance("java.nio.DirectCharBufferU");
        setField(directCharBufferU, "limit", -2147483647);
        setField(directCharBufferU, "position", 9);
        setField(directCharBufferU, "isReadOnly", false);
        setField(directCharBufferU, "offset", 0);
        char[] charArray = new char[10];
        setField(directCharBufferU, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferUType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferRType, directCharBufferUType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBufferR;
        decodeMethodArguments[2] = directCharBufferU;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode15() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 1056964594);
        setField(heapByteBufferR, "position", -1040187391);
        setField(heapByteBufferR, "isReadOnly", false);
        setField(heapByteBufferR, "offset", 1040187424);
        byte[] byteArray = new byte[35];
        byteArray[33] = (byte) -64;
        setField(heapByteBufferR, "hb", byteArray);
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        setField(directCharBufferRU, "limit", -805444);
        setField(directCharBufferRU, "position", 1089606783);
        setField(directCharBufferRU, "isReadOnly", false);
        setField(directCharBufferRU, "offset", 1599144323);
        char[] charArray = new char[9];
        setField(directCharBufferRU, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRUType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferRType, directCharBufferRUType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBufferR;
        decodeMethodArguments[2] = directCharBufferRU;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode16() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(heapByteBufferR, "limit", 1057095622);
        setField(heapByteBufferR, "position", -1073741759);
        setField(heapByteBufferR, "isReadOnly", false);
        setField(heapByteBufferR, "offset", 1073741767);
        byte[] byteArray = new byte[9];
        setField(heapByteBufferR, "hb", byteArray);
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        setField(byteBufferAsCharBufferRL, "limit", -1543503930);
        setField(byteBufferAsCharBufferRL, "position", -788389855);
        setField(byteBufferAsCharBufferRL, "isReadOnly", false);
        setField(byteBufferAsCharBufferRL, "offset", 872415207);
        char[] charArray = new char[9];
        setField(byteBufferAsCharBufferRL, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class heapByteBufferRType = Class.forName("java.nio.ByteBuffer");
        Class byteBufferAsCharBufferRLType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, heapByteBufferRType, byteBufferAsCharBufferRLType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = heapByteBufferR;
        decodeMethodArguments[2] = byteBufferAsCharBufferRL;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferRPosition = getFieldValue(heapByteBufferR, "position");
        
        Object finalByteBufferAsCharBufferRLOffset = getFieldValue(byteBufferAsCharBufferRL, "offset");
        
        assertEquals(8, finalHeapByteBufferRPosition);
        
        assertEquals(0, finalByteBufferAsCharBufferRLOffset);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode17() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object directByteBuffer = createInstance("java.nio.DirectByteBuffer");
        setField(directByteBuffer, "limit", 536870086);
        setField(directByteBuffer, "position", -536869831);
        setField(directByteBuffer, "isReadOnly", false);
        setField(directByteBuffer, "offset", 536869831);
        byte[] byteArray = new byte[17];
        byteArray[0] = (byte) -32;
        setField(directByteBuffer, "hb", byteArray);
        Object directCharBufferRU = createInstance("java.nio.DirectCharBufferRU");
        setField(directCharBufferRU, "limit", 1140851710);
        setField(directCharBufferRU, "position", -729808896);
        setField(directCharBufferRU, "isReadOnly", false);
        setField(directCharBufferRU, "offset", 1275069439);
        char[] charArray = new char[17];
        setField(directCharBufferRU, "hb", charArray);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class uTF8DecoderType = Class.forName("java.nio.charset.CharsetDecoder");
        Class directByteBufferType = Class.forName("java.nio.ByteBuffer");
        Class directCharBufferRUType = Class.forName("java.nio.CharBuffer");
        Method decodeMethod = iOUtilsClazz.getDeclaredMethod("decode", uTF8DecoderType, directByteBufferType, directCharBufferRUType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[3];
        decodeMethodArguments[0] = uTF8Decoder;
        decodeMethodArguments[1] = directByteBuffer;
        decodeMethodArguments[2] = directCharBufferRU;
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalDirectByteBufferPosition = getFieldValue(directByteBuffer, "position");
        
        Object finalDirectCharBufferRUPosition = getFieldValue(directCharBufferRU, "position");
        
        assertEquals(0, finalDirectByteBufferPosition);
        
        assertEquals(545260543, finalDirectCharBufferRUPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode18() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 1610606848);
        setField(heapByteBuffer, "position", 3222);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 1073736823);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        setField(heapCharBufferR, "limit", 1744832544);
        setField(heapCharBufferR, "position", -133813888);
        setField(heapCharBufferR, "isReadOnly", false);
        setField(heapCharBufferR, "offset", 670695956);
        char[] charArray = new char[9];
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
        try {
            decodeMethod.invoke(null, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferPosition = getFieldValue(heapByteBuffer, "position");
        
        Object finalHeapCharBufferRPosition = getFieldValue(heapCharBufferR, "position");
        
        assertEquals(1073740045, finalHeapByteBufferPosition);
        
        assertEquals(536882068, finalHeapCharBufferRPosition);
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
        GZIPOutputStream gZIPOutputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        setField(deflaterOutputStream, "out", null);
        setField(deflaterOutputStream, "usesDefaultDeflater", false);
        setField(deflaterOutputStream, "closed", true);
        setField(deflaterOutputStream, "def", null);
        setField(gZIPOutputStream, "out", deflaterOutputStream);
        setField(gZIPOutputStream, "usesDefaultDeflater", true);
        setField(gZIPOutputStream, "closed", false);
        Deflater deflater = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(deflater, "finished", true);
        setField(deflater, "buf", null);
        Object zStreamRef = createInstance("java.util.zip.ZStreamRef");
        setField(zStreamRef, "address", -9223372036854775807L);
        setField(deflater, "zsRef", zStreamRef);
        setField(gZIPOutputStream, "def", deflater);
        
        Class iOUtilsClazz = Class.forName("com.alibaba.fastjson.util.IOUtils");
        Class gZIPOutputStreamType = Class.forName("java.io.Closeable");
        Method closeMethod = iOUtilsClazz.getDeclaredMethod("close", gZIPOutputStreamType);
        closeMethod.setAccessible(true);
        java.lang.Object[] closeMethodArguments = new java.lang.Object[1];
        closeMethodArguments[0] = gZIPOutputStream;
        closeMethod.invoke(null, closeMethodArguments);
        
        Object finalGZIPOutputStreamClosed = getFieldValue(gZIPOutputStream, "closed");
        Object gZIPOutputStreamDef = getFieldValue(gZIPOutputStream, "def");
        Object gZIPOutputStreamDefDefZsRef = getFieldValue(gZIPOutputStreamDef, "zsRef");
        Object finalGZIPOutputStreamDefZsRefAddress = getFieldValue(gZIPOutputStreamDefDefZsRef, "address");
        
        Class assertClazz = Class.forName("org.junit.Assert");
        Class finalGZIPOutputStreamClosedType = boolean.class;
        Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalGZIPOutputStreamClosedType);
        assertTrueMethod.setAccessible(true);
        java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
        assertTrueMethodArguments[0] = finalGZIPOutputStreamClosed;
        assertTrueMethod.invoke(null, assertTrueMethodArguments);
        
        assertEquals(0L, finalGZIPOutputStreamDefZsRefAddress);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize1() throws Throwable  {
        int actual = IOUtils.stringSize(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize2() throws Throwable  {
        int actual = IOUtils.stringSize(0L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize3() throws Throwable  {
        int actual = IOUtils.stringSize(-9223372036854775797L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize4() throws Throwable  {
        int actual = IOUtils.stringSize(11L);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize5() throws Throwable  {
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