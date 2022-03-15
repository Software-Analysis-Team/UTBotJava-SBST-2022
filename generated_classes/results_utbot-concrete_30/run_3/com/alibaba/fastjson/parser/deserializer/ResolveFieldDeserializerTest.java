package com.alibaba.fastjson.util;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.jar.JarInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class IOUtilsTest {
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
        IOUtils.getChars(0, 0, ((char[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars3() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(Integer.MIN_VALUE, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars4() throws Throwable  {
        IOUtils.getChars(-65537, 0, ((char[]) null));
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
        IOUtils.getChars(4611686018427387904L, 0, ((char[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars7() throws Throwable  {
        IOUtils.getChars(32768L, 0, ((char[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars8() throws Throwable  {
        char[] charArray = new char[10];
        
        IOUtils.getChars(65536L, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars9() throws Throwable  {
        IOUtils.getChars(-1073741824L, 0, ((char[]) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars10() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.getChars((byte) 0, 0, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetChars11() throws Throwable  {
        char[] charArray = new char[17];
        
        IOUtils.getChars(java.lang.Byte.MIN_VALUE, 0, charArray);
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
        IOUtils.decode(null, null, null);
    }
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
        setField(decoder, "state", 1);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "isReadOnly", false);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode5() throws Throwable  {
        UTF8Decoder uTF8Decoder = ((UTF8Decoder) createInstance("com.alibaba.fastjson.util.UTF8Decoder"));
        setField(uTF8Decoder, "state", 2);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "isReadOnly", false);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[0];
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
        }}
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
    public void testStringSize1() throws Throwable  {
        int actual = IOUtils.stringSize(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize2() throws Throwable  {
        int actual = IOUtils.stringSize(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize3() throws Throwable  {
        int actual = IOUtils.stringSize(0L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize4() throws Throwable  {
        int actual = IOUtils.stringSize(-9223372036854775797L);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize5() throws Throwable  {
        int actual = IOUtils.stringSize(11L);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testStringSize6() throws Throwable  {
        int actual = IOUtils.stringSize(1000000000000000000L);
        
        assertEquals(19, actual);
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
        IOUtils.encodeUTF8(null, 0, 0, null);
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
        
        int actual = IOUtils.encodeUTF8(null, 510, -2147467263, byteArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEncodeUTF85() throws Throwable  {
        char[] charArray = new char[9];
        byte[] byteArray = new byte[16];
        
        IOUtils.encodeUTF8(charArray, -536809308, -2147448295, byteArray);
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
        char[] charArray = new char[9];
        charArray[0] = '\u0080';
        byte[] byteArray = new byte[32];
        
        int actual = IOUtils.encodeUTF8(charArray, 0, 1, byteArray);
        
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
        char[] charArray = new char[15];
        charArray[9] = '\uD800';
        charArray[10] = '\uDC00';
        byte[] byteArray = new byte[14];
        
        IOUtils.encodeUTF8(charArray, 9, 9, byteArray);
        
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
        char[] charArray = new char[0];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase642() throws Throwable  {
        char[] charArray = new char[17];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase643() throws Throwable  {
        char[] charArray = new char[0];
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase644() throws Throwable  {
        char[] charArray = new char[15];
        charArray[0] = '=';
        
        IOUtils.decodeBase64(charArray, 0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase645() throws Throwable  {
        char[] charArray = new char[9];
        
        IOUtils.decodeBase64(charArray, 1744830388, -1744830387);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase646() throws Throwable  {
        char[] charArray = new char[4];
        
        byte[] actual = IOUtils.decodeBase64(charArray, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase647() throws Throwable  {
        char[] charArray = new char[9];
        
        byte[] actual = IOUtils.decodeBase64(charArray, Integer.MAX_VALUE, -2147483646);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase648() throws Throwable  {
        char[] charArray = new char[9];
        
        IOUtils.decodeBase64(charArray, 715827870, -715827869);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase649() throws Throwable  {
        IOUtils.decodeBase64(((char[]) null), 628934271, -536885631);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6410() throws Throwable  {
        IOUtils.decodeBase64(((char[]) null), -1929379840, -1962934272);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6411() throws Throwable  {
        String string = new String();
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6412() throws Throwable  {
        IOUtils.decodeBase64(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6413() throws Throwable  {
        String string = new String("");
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6414() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6415() throws Throwable  {
        String string = new String("=");
        
        IOUtils.decodeBase64(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6416() throws Throwable  {
        String string = new String();
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6417() throws Throwable  {
        byte[] actual = IOUtils.decodeBase64(((String) null), 0, 0);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6418() throws Throwable  {
        IOUtils.decodeBase64(((String) null), 8781840, -2146434744);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6419() throws Throwable  {
        String string = new String("\u0000");
        
        IOUtils.decodeBase64(string, 1583338752, -1583338751);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6420() throws Throwable  {
        String string = new String("\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 0, 1);
        
        byte[] expected = new byte[0];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeBase6421() throws Throwable  {
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byte[] actual = IOUtils.decodeBase64(string, 715827882, -715827881);
        
        byte[] expected = new byte[1];
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeBase6422() throws Throwable  {
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
        IOUtils.decodeUTF8(null, 0, 0, null);
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
        char[] charArray = new char[10];
        
        int actual = IOUtils.decodeUTF8(null, 12288, -2147482613, charArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF85() throws Throwable  {
        byte[] byteArray = new byte[9];
        char[] charArray = new char[4];
        
        IOUtils.decodeUTF8(byteArray, -1610579952, -1073537785, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF86() throws Throwable  {
        byte[] byteArray = new byte[14];
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF87() throws Throwable  {
        byte[] byteArray = new byte[14];
        byteArray[3] = (byte) -16;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF88() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -32;
        char[] charArray = new char[34];
        
        IOUtils.decodeUTF8(byteArray, 8, 23, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF89() throws Throwable  {
        byte[] byteArray = new byte[39];
        byteArray[34] = (byte) -32;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 34, 1, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF810() throws Throwable  {
        byte[] byteArray = new byte[14];
        byteArray[3] = (byte) -64;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF811() throws Throwable  {
        byte[] byteArray = new byte[38];
        byteArray[33] = (byte) -62;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 33, 1, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF812() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[34];
        
        IOUtils.decodeUTF8(byteArray, 8, 23, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF813() throws Throwable  {
        byte[] byteArray = new byte[9];
        byteArray[8] = (byte) -62;
        char[] charArray = new char[34];
        
        IOUtils.decodeUTF8(byteArray, 8, 23, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF814() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -31;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF815() throws Throwable  {
        byte[] byteArray = new byte[10];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[34];
        
        IOUtils.decodeUTF8(byteArray, 8, 23, charArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF816() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[3] = (byte) -32;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF817() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[1] = (byte) -62;
        char[] charArray = new char[33];
        
        int actual = IOUtils.decodeUTF8(byteArray, 1, 30, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecodeUTF818() throws Throwable  {
        byte[] byteArray = new byte[11];
        byteArray[8] = (byte) -16;
        char[] charArray = new char[36];
        
        IOUtils.decodeUTF8(byteArray, 8, 21, charArray);
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
        char[] charArray = new char[32];
        
        int actual = IOUtils.decodeUTF8(byteArray, 3, 3, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF821() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 29, charArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecodeUTF822() throws Throwable  {
        byte[] byteArray = new byte[15];
        byteArray[2] = (byte) -16;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 29, charArray);
        
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
        char[] charArray = new char[4];
        
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
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 29, charArray);
        
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
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 29, charArray);
        
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
        char[] charArray = new char[36];
        
        int actual = IOUtils.decodeUTF8(byteArray, 2, 29, charArray);
        
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
        byte[] byteArray = new byte[15];
        byteArray[1] = (byte) -12;
        byteArray[2] = java.lang.Byte.MIN_VALUE;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        byteArray[4] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[33];
        
        int actual = IOUtils.decodeUTF8(byteArray, 1, 4, charArray);
        
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
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -12;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        byteArray[2] = java.lang.Byte.MIN_VALUE;
        byteArray[3] = java.lang.Byte.MIN_VALUE;
        char[] charArray = new char[35];
        
        int actual = IOUtils.decodeUTF8(byteArray, 0, 5, charArray);
        
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
