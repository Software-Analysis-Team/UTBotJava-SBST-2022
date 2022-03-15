package io.seata.core.protocol;

import org.junit.Test;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MessageFutureTest {
    ///region
    
    @Test(timeout = 10000)
    public void testGetTimeout1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        
        long actual = messageFuture.getTimeout();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTimeout2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "timeout", 0L);
        
        long actual = messageFuture.getTimeout();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetRequestMessage1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        
        RpcMessage actual = messageFuture.getRequestMessage();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetRequestMessage2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "requestMessage", null);
        
        RpcMessage actual = messageFuture.getRequestMessage();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetRequestMessage1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        RpcMessage rpcMessage = new RpcMessage();
        
        messageFuture.setRequestMessage(rpcMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetRequestMessage2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "requestMessage", null);
        
        messageFuture.setRequestMessage(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTimeout1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        
        messageFuture.setTimeout(0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTimeout2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "timeout", 0L);
        
        messageFuture.setTimeout(0L);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResultMessage1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        Object object = new Object();
        
        messageFuture.setResultMessage(object);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResultMessage2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        CountDownLatch countDownLatch = ((CountDownLatch) createInstance("java.util.concurrent.CountDownLatch"));
        Object sync = createInstance("java.util.concurrent.CountDownLatch$Sync");
        setField(sync, "state", 0);
        setField(countDownLatch, "sync", sync);
        setField(messageFuture, "latch", countDownLatch);
        setField(messageFuture, "resultMessage", null);
        java.lang.Object[] byteBufferAsLongBufferBArray = createArray("java.nio.ByteBufferAsLongBufferB", 0);
        
        Object initialMessageFutureResultMessage = getFieldValue(messageFuture, "resultMessage");
        
        messageFuture.setResultMessage(byteBufferAsLongBufferBArray);
        
        Object finalMessageFutureResultMessage = getFieldValue(messageFuture, "resultMessage");
        
        assertFalse(initialMessageFutureResultMessage == finalMessageFutureResultMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetResultMessage3() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        CountDownLatch countDownLatch = ((CountDownLatch) createInstance("java.util.concurrent.CountDownLatch"));
        Object sync = createInstance("java.util.concurrent.CountDownLatch$Sync");
        setField(sync, "state", 0);
        setField(countDownLatch, "sync", sync);
        setField(messageFuture, "latch", countDownLatch);
        setField(messageFuture, "resultMessage", null);
        
        Object initialMessageFutureResultMessage = getFieldValue(messageFuture, "resultMessage");
        
        messageFuture.setResultMessage(null);
        
        Object finalMessageFutureResultMessage = getFieldValue(messageFuture, "resultMessage");
        
        assertFalse(initialMessageFutureResultMessage == finalMessageFutureResultMessage);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsTimeout1() throws Throwable  {
        MessageFuture messageFuture = new MessageFuture();
        
        boolean actual = messageFuture.isTimeout();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsTimeout2() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "start", -4607495368187190823L);
        setField(messageFuture, "timeout", 0L);
        
        boolean actual = messageFuture.isTimeout();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsTimeout3() throws Throwable  {
        MessageFuture messageFuture = ((MessageFuture) createInstance("io.seata.core.protocol.MessageFuture"));
        setField(messageFuture, "start", 4611772820661764929L);
        setField(messageFuture, "timeout", 0L);
        
        boolean actual = messageFuture.isTimeout();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMessageFuture1() {
        MessageFuture actual = new MessageFuture();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMessageFuture2() {
        MessageFuture actual = new MessageFuture();
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
