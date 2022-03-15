package com.alibaba.fastjson.asm;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ByteVectorTest {
    ///region
    
    @Test(timeout = 10000)
    public void testPutByteArray1() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        byte[] byteArray = new byte[0];
        
        ByteVector actual = byteVector.putByteArray(byteArray, 0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutByteArray2() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.putByteArray(null, 0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByteArray3() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -1073741854;
        byte[] byteArray = new byte[10];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByteArray(null, 0, 1073741795);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(-59, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutByteArray4() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1073741822;
        byte[] byteArray = new byte[0];
        byteVector.data = byteArray;
        byte[] byteArray1 = new byte[18];
        
        byteVector.putByteArray(byteArray1, 0, -1073741825);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByteArray5() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[16];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByteArray(null, 0, 32);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(33, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByteArray6() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 2;
        byte[] byteArray = new byte[8];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByteArray(null, 0, 9);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(11, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutUTF81() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        String string = new String();
        
        ByteVector actual = byteVector.putUTF8(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF82() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        
        byteVector.putUTF8(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF83() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        String string = new String("");
        
        byteVector.putUTF8(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF84() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 2147483620;
        byte[] byteArray = new byte[1];
        byteVector.data = byteArray;
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byteVector.putUTF8(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutUTF85() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        String string = new String("");
        
        ByteVector actual = byteVector.putUTF8(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(3, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF86() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -7;
        byte[] byteArray = new byte[7];
        byteVector.data = byteArray;
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byteVector.putUTF8(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutUTF87() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 3;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        String string = new String("");
        
        ByteVector actual = byteVector.putUTF8(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(5, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF88() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[35];
        byteVector.data = byteArray;
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byteVector.putUTF8(string);
        
        byte finalByteVectorData2 = byteVector.data[2];
        
        assertEquals((byte) 28, finalByteVectorData2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutUTF89() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[35];
        byteVector.data = byteArray;
        String string = new String("\u0081\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        byteVector.putUTF8(string);
        
        byte finalByteVectorData2 = byteVector.data[2];
        
        assertEquals((byte) 28, finalByteVectorData2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutUTF810() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[1];
        byteVector.data = byteArray;
        String string = new String("");
        
        ByteVector actual = byteVector.putUTF8(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(3, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutUTF811() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        String string = new String("\u0001");
        
        ByteVector actual = byteVector.putUTF8(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte finalByteVectorData1 = byteVector.data[1];
        byte finalByteVectorData2 = byteVector.data[2];
        
        assertEquals(3, finalByteVectorLength);
        
        assertEquals((byte) 1, finalByteVectorData1);
        
        assertEquals((byte) 1, finalByteVectorData2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut121() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        ByteVector actual = byteVector.put12(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut122() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.put12(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut123() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -4;
        byte[] byteArray = new byte[10];
        byteVector.data = byteArray;
        
        byteVector.put12(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut124() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.put12(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(3, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut125() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -2;
        byte[] byteArray = new byte[0];
        byteVector.data = byteArray;
        
        byteVector.put12(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut126() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 7;
        byte[] byteArray = new byte[6];
        byteVector.data = byteArray;
        
        byteVector.put12(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut127() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 2;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.put12(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(5, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut111() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        ByteVector actual = byteVector.put11(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut112() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.put11(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut113() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -251;
        byte[] byteArray = new byte[2];
        byteVector.data = byteArray;
        
        byteVector.put11(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut114() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.put11(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(3, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPut115() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[1];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.put11(0, 0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(3, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPut116() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 6;
        byte[] byteArray = new byte[5];
        byteVector.data = byteArray;
        
        byteVector.put11(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnlarge1() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        Class byteVectorClazz = Class.forName("com.alibaba.fastjson.asm.ByteVector");
        Class intType = int.class;
        Method enlargeMethod = byteVectorClazz.getDeclaredMethod("enlarge", intType);
        enlargeMethod.setAccessible(true);
        java.lang.Object[] enlargeMethodArguments = new java.lang.Object[1];
        enlargeMethodArguments[0] = 0;
        enlargeMethod.invoke(byteVector, enlargeMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnlarge2() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "data", null);
        
        Class byteVectorClazz = Class.forName("com.alibaba.fastjson.asm.ByteVector");
        Class intType = int.class;
        Method enlargeMethod = byteVectorClazz.getDeclaredMethod("enlarge", intType);
        enlargeMethod.setAccessible(true);
        java.lang.Object[] enlargeMethodArguments = new java.lang.Object[1];
        enlargeMethodArguments[0] = 0;
        try {
            enlargeMethod.invoke(byteVector, enlargeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnlarge3() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 7;
        byte[] byteArray = new byte[18];
        byteVector.data = byteArray;
        
        Class byteVectorClazz = Class.forName("com.alibaba.fastjson.asm.ByteVector");
        Class intType = int.class;
        Method enlargeMethod = byteVectorClazz.getDeclaredMethod("enlarge", intType);
        enlargeMethod.setAccessible(true);
        java.lang.Object[] enlargeMethodArguments = new java.lang.Object[1];
        enlargeMethodArguments[0] = 2147483641;
        enlargeMethod.invoke(byteVector, enlargeMethodArguments);
        
        byte[] finalByteVectorData = byteVector.data;
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEnlarge4() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -2147483639;
        byte[] byteArray = new byte[1];
        byteVector.data = byteArray;
        
        Class byteVectorClazz = Class.forName("com.alibaba.fastjson.asm.ByteVector");
        Class intType = int.class;
        Method enlargeMethod = byteVectorClazz.getDeclaredMethod("enlarge", intType);
        enlargeMethod.setAccessible(true);
        java.lang.Object[] enlargeMethodArguments = new java.lang.Object[1];
        enlargeMethodArguments[0] = Integer.MIN_VALUE;
        try {
            enlargeMethod.invoke(byteVector, enlargeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByte1() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        ByteVector actual = byteVector.putByte(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutByte2() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.putByte(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutByte3() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = Integer.MAX_VALUE;
        byte[] byteArray = new byte[30];
        byteVector.data = byteArray;
        
        byteVector.putByte(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByte4() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        byte[] byteArray = new byte[33];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByte(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(1, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByte5() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        byte[] byteArray = new byte[0];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByte(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(1, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutByte6() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 2;
        byte[] byteArray = new byte[2];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putByte(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(3, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutShort1() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        ByteVector actual = byteVector.putShort(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutShort2() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.putShort(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutShort3() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -3;
        byte[] byteArray = new byte[10];
        byteVector.data = byteArray;
        
        byteVector.putShort(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutShort4() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putShort(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(3, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutShort5() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 9;
        byte[] byteArray = new byte[0];
        byteVector.data = byteArray;
        
        byteVector.putShort(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutShort6() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 6;
        byte[] byteArray = new byte[5];
        byteVector.data = byteArray;
        
        byteVector.putShort(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutShort7() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 3;
        byte[] byteArray = new byte[3];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putShort(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(5, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutInt1() throws Throwable  {
        ByteVector byteVector = new ByteVector();
        
        ByteVector actual = byteVector.putInt(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutInt2() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 0;
        setField(byteVector, "data", null);
        
        byteVector.putInt(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPutInt3() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = -7;
        byte[] byteArray = new byte[12];
        byteVector.data = byteArray;
        
        byteVector.putInt(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutInt4() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[7];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putInt(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        
        assertEquals(5, finalByteVectorLength);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutInt5() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 1;
        byte[] byteArray = new byte[1];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putInt(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(5, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPutInt6() throws Throwable  {
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        byteVector.length = 6;
        byte[] byteArray = new byte[7];
        byteVector.data = byteArray;
        
        ByteVector actual = byteVector.putInt(0);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(byteVector, actual));
        
        int finalByteVectorLength = byteVector.length;
        byte[] finalByteVectorData = byteVector.data;
        
        assertEquals(10, finalByteVectorLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testByteVector1() {
        ByteVector actual = new ByteVector();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testByteVector2() {
        ByteVector actual = new ByteVector();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testByteVector3() {
        ByteVector actual = new ByteVector(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testByteVector4() {
        ByteVector actual = new ByteVector(9);
    }
    ///endregion
    
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
