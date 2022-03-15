package io.seata.core.protocol.transaction;

import org.junit.Test;
import java.nio.ByteBuffer;
import io.seata.core.protocol.ResultCode;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.ArgumentMatchers.anyByte;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
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
    
    @Test(timeout = 10000)
    public void testDecode2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(ResultCode.class);
            ResultCode resultCodeMock = mock(ResultCode.class);
            mockedStatic.when(() -> {
                ResultCode.get(anyByte());
            }).thenReturn(resultCodeMock);
            mockedStatic1 = mockStatic(io.seata.core.exception.TransactionExceptionCode.class);
            mockedStatic1.when(() -> {
                io.seata.core.exception.TransactionExceptionCode.get(anyByte());
            }).thenReturn(((io.seata.core.exception.TransactionExceptionCode) null));
            GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
            setField(globalBeginResponse, "resultCode", null);
            setField(globalBeginResponse, "transactionExceptionCode", null);
            ByteBuffer byteBufferMock = mock(ByteBuffer.class);
            when(byteBufferMock.get()).thenReturn((byte) 0, (byte) 0);
            when(byteBufferMock.getShort()).thenReturn(java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE);
            
            Object initialGlobalBeginResponseResultCode = getFieldValue(globalBeginResponse, "resultCode");
            
            globalBeginResponse.decode(byteBufferMock);
            
            Object finalGlobalBeginResponseResultCode = getFieldValue(globalBeginResponse, "resultCode");
            
            assertFalse(initialGlobalBeginResponseResultCode == finalGlobalBeginResponseResultCode);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDecode3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(ResultCode.class);
            mockedStatic.when(() -> {
                ResultCode.get(anyByte());
            }).thenReturn(((ResultCode) null));
            mockedStatic1 = mockStatic(io.seata.core.exception.TransactionExceptionCode.class);
            mockedStatic1.when(() -> {
                io.seata.core.exception.TransactionExceptionCode.get(anyByte());
            }).thenReturn(((io.seata.core.exception.TransactionExceptionCode) null));
            GlobalBeginResponse globalBeginResponse = ((GlobalBeginResponse) createInstance("io.seata.core.protocol.transaction.GlobalBeginResponse"));
            setField(globalBeginResponse, "resultCode", null);
            setField(globalBeginResponse, "transactionExceptionCode", null);
            ByteBuffer byteBufferMock = mock(ByteBuffer.class);
            when(byteBufferMock.get()).thenReturn((byte) 0, (byte) 0);
            when(byteBufferMock.getShort()).thenReturn(java.lang.Short.MIN_VALUE, (short) 0);
            
            globalBeginResponse.decode(byteBufferMock);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
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
