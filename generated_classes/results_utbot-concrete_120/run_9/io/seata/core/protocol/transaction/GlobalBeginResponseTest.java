package io.seata.core.protocol.transaction;

import org.junit.Test;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import io.seata.core.protocol.ResultCode;
import io.seata.core.exception.TransactionExceptionCode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GlobalBeginResponseTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        
        globalBeginResponse.decode(((ByteBuffer) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", -2147483647);
        setField(heapByteBuffer, "position", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method decodeMethod = globalBeginResponseClazz.getDeclaredMethod("decode", heapByteBufferType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[1];
        decodeMethodArguments[0] = heapByteBuffer;
        try {
            decodeMethod.invoke(globalBeginResponse, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for decode
    
    public void testDecode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for decode
    
    public void testDecode_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDecode5() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 1);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        byteArray[0] = java.lang.Byte.MIN_VALUE;
        setField(heapByteBuffer, "hb", byteArray);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Class heapByteBufferType = Class.forName("java.nio.ByteBuffer");
        Method decodeMethod = globalBeginResponseClazz.getDeclaredMethod("decode", heapByteBufferType);
        decodeMethod.setAccessible(true);
        java.lang.Object[] decodeMethodArguments = new java.lang.Object[1];
        decodeMethodArguments[0] = heapByteBuffer;
        try {
            decodeMethod.invoke(globalBeginResponse, decodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object finalHeapByteBufferPosition = getFieldValue(heapByteBuffer, "position");
        
        assertEquals(1, finalHeapByteBufferPosition);
    }
    ///endregion
    
    
    ///region Errors report for decode
    
    public void testDecode_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for decode
    
    public void testDecode_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for decode
    
    public void testDecode_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        
        short actual = globalBeginResponse.getTypeCode();
        
        assertEquals((short) 2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCode2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        
        short actual = globalBeginResponse.getTypeCode();
        
        assertEquals((short) 2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        Object heapByteBufferR = createInstance("java.nio.HeapByteBufferR");
        setField(globalBeginResponse, "byteBuffer", heapByteBufferR);
        ResultCode resultCode = ResultCode.Failed;
        setField(globalBeginResponse, "resultCode", resultCode);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode3() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "msg", null);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 2);
        setField(heapByteBuffer, "position", 0);
        setField(heapByteBuffer, "offset", 0);
        byte[] byteArray = new byte[9];
        setField(heapByteBuffer, "hb", byteArray);
        setField(globalBeginResponse, "byteBuffer", heapByteBuffer);
        ResultCode resultCode = ResultCode.Failed;
        setField(globalBeginResponse, "resultCode", resultCode);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = globalBeginResponse.byteBuffer;
        Object finalGlobalBeginResponseByteBufferPosition = getFieldValue(byteBuffer, "position");
        
        assertEquals(1, finalGlobalBeginResponseByteBufferPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode4() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "msg", null);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", -1811939286);
        setField(heapByteBuffer, "position", -1811939289);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 1811939296);
        byte[] byteArray = new byte[10];
        setField(heapByteBuffer, "hb", byteArray);
        setField(globalBeginResponse, "byteBuffer", heapByteBuffer);
        ResultCode resultCode = ResultCode.Failed;
        setField(globalBeginResponse, "resultCode", resultCode);
        TransactionExceptionCode transactionExceptionCode = TransactionExceptionCode.Unknown;
        setField(globalBeginResponse, "transactionExceptionCode", transactionExceptionCode);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = globalBeginResponse.byteBuffer;
        Object finalGlobalBeginResponseByteBufferPosition = getFieldValue(byteBuffer, "position");
        
        assertEquals(-1811939286, finalGlobalBeginResponseByteBufferPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode5() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", -1425455);
        setField(heapByteBuffer, "position", -1425459);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 1425472);
        byte[] byteArray = new byte[31];
        setField(heapByteBuffer, "hb", byteArray);
        setField(globalBeginResponse, "byteBuffer", heapByteBuffer);
        ResultCode resultCode = ResultCode.Failed;
        setField(globalBeginResponse, "resultCode", resultCode);
        TransactionExceptionCode transactionExceptionCode = TransactionExceptionCode.Unknown;
        setField(globalBeginResponse, "transactionExceptionCode", transactionExceptionCode);
        setField(globalBeginResponse, "extraData", null);
        setField(globalBeginResponse, "xid", null);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = globalBeginResponse.byteBuffer;
        Object finalGlobalBeginResponseByteBufferPosition = getFieldValue(byteBuffer, "position");
        
        assertEquals(-1425455, finalGlobalBeginResponseByteBufferPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoEncode6() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "msg", null);
        Object heapByteBuffer = createInstance("java.nio.HeapByteBuffer");
        setField(heapByteBuffer, "limit", 1476395006);
        setField(heapByteBuffer, "position", -671088642);
        setField(heapByteBuffer, "bigEndian", true);
        setField(heapByteBuffer, "offset", 671088642);
        byte[] byteArray = new byte[7];
        setField(heapByteBuffer, "hb", byteArray);
        setField(globalBeginResponse, "byteBuffer", heapByteBuffer);
        ResultCode resultCode = ResultCode.Failed;
        setField(globalBeginResponse, "resultCode", resultCode);
        TransactionExceptionCode transactionExceptionCode = TransactionExceptionCode.Unknown;
        setField(globalBeginResponse, "transactionExceptionCode", transactionExceptionCode);
        setField(globalBeginResponse, "extraData", null);
        setField(globalBeginResponse, "xid", null);
        
        Class globalBeginResponseClazz = Class.forName("io.seata.core.protocol.transaction.GlobalBeginResponse");
        Method doEncodeMethod = globalBeginResponseClazz.getDeclaredMethod("doEncode");
        doEncodeMethod.setAccessible(true);
        java.lang.Object[] doEncodeMethodArguments = new java.lang.Object[0];
        try {
            doEncodeMethod.invoke(globalBeginResponse, doEncodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteBuffer byteBuffer = globalBeginResponse.byteBuffer;
        Object finalGlobalBeginResponseByteBufferPosition = getFieldValue(byteBuffer, "position");
        
        assertEquals(-671088634, finalGlobalBeginResponseByteBufferPosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetExtraData1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        String string = new String();
        
        globalBeginResponse.setExtraData(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetExtraData2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "extraData", null);
        String string = new String("");
        
        globalBeginResponse.setExtraData(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraData1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        
        String actual = globalBeginResponse.getExtraData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetExtraData2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "extraData", null);
        
        String actual = globalBeginResponse.getExtraData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetXid1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        String string = new String();
        
        globalBeginResponse.setXid(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetXid2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "xid", null);
        String string = new String("");
        
        globalBeginResponse.setXid(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetXid1() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = new GlobalBeginResponse();
        
        String actual = globalBeginResponse.getXid();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetXid2() throws Throwable  {
        GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
        setField(globalBeginResponse, "xid", null);
        
        String actual = globalBeginResponse.getXid();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGlobalBeginResponse1() {
        GlobalBeginResponse actual = new GlobalBeginResponse();
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
