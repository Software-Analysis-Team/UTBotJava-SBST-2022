package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.declaration.CtTypeParameterImpl;
import spoon.support.reflect.declaration.CtEnumImpl;
import spoon.support.reflect.reference.CtTypeReferenceImpl;
import spoon.support.util.EmptyClearableList;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.spi.RootLogger;
import org.apache.log4j.Hierarchy;
import java.util.Vector;
import java.util.Hashtable;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.helpers.OnlyOnceErrorHandler;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import sun.nio.cs.US_ASCII;
import sun.nio.cs.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import sun.nio.cs.Surrogate.Parser;
import sun.nio.cs.Surrogate;
import java.nio.charset.CoderResult;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.PrintingContext;
import java.util.Deque;
import java.util.LinkedList;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class PrintingContextTest {
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        String actual = printingContext.toString();
        
        String expected = new String("context.ignoreGenerics: false\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.skipArray();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "SKIP_ARRAY", 0L);
        
        boolean actual = printingContext.skipArray();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "SKIP_ARRAY", -1L);
        
        boolean actual = printingContext.skipArray();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "currentTopLevel", null);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCurrentTypeReference3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtTypeParameterImpl ctTypeParameterImpl = ((CtTypeParameterImpl) createInstance("spoon.support.reflect.declaration.CtTypeParameterImpl"));
        setField(ctTypeParameterImpl, "factory", null);
        setField(printingContext, "currentTopLevel", ctTypeParameterImpl);
        setField(printingContext, "currentThis", null);
        
        printingContext.getCurrentTypeReference();
    }
    ///endregion
    
    
    ///region Errors report for getCurrentTypeReference
    
    public void testGetCurrentTypeReference_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.nio.charset.CoderResult$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.forceWildcardGenerics();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "FORCE_WILDCARD_GENERICS", 0L);
        
        boolean actual = printingContext.forceWildcardGenerics();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "FORCE_WILDCARD_GENERICS", -1L);
        
        boolean actual = printingContext.forceWildcardGenerics();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.ignoreEnclosingClass();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_ENCLOSING_CLASS", 0L);
        
        boolean actual = printingContext.ignoreEnclosingClass();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "IGNORE_ENCLOSING_CLASS", -1L);
        
        boolean actual = printingContext.ignoreEnclosingClass();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.ignoreStaticAccess();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_STATIC_ACCESS", 0L);
        
        boolean actual = printingContext.ignoreStaticAccess();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "IGNORE_STATIC_ACCESS", -1L);
        
        boolean actual = printingContext.ignoreStaticAccess();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeContext1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        TypeContext actual = ((TypeContext) getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeContext2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "currentThis", null);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        TypeContext actual = ((TypeContext) getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeContext3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[16];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        TypeContext actual = ((TypeContext) getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.noTypeDecl();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "NO_TYPE_DECL", 0L);
        
        boolean actual = printingContext.noTypeDecl();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "NO_TYPE_DECL", -1L);
        
        boolean actual = printingContext.noTypeDecl();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.ignoreGenerics();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_GENERICS", 0L);
        
        boolean actual = printingContext.ignoreGenerics();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "IGNORE_GENERICS", -1L);
        
        boolean actual = printingContext.ignoreGenerics();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testModify1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        PrintingContext.Writable actual = printingContext.modify();
        
        PrintingContext.Writable expected = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        setField(expected, "oldState", 0L);
        setField(expected, "this$0", printingContext);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testModify2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        
        PrintingContext.Writable actual = printingContext.modify();
        
        PrintingContext.Writable expected = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        setField(expected, "oldState", 0L);
        setField(expected, "this$0", printingContext);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPushCurrentThis1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        printingContext.pushCurrentThis(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPushCurrentThis2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "currentThis", null);
        CtTypeParameterImpl ctTypeParameterImpl = ((CtTypeParameterImpl) createInstance("spoon.support.reflect.declaration.CtTypeParameterImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "type", null);
        setField(ctTypeParameterImpl, "factory", factoryImpl);
        
        printingContext.pushCurrentThis(ctTypeParameterImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        printingContext.popCurrentThis();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "currentThis", null);
        
        printingContext.popCurrentThis();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopCurrentThis3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "modCount", 0);
        setField(keepAliveStreamCleaner, "last", null);
        Object node = createInstance("java.util.LinkedList$Node");
        setField(node, "next", null);
        setField(node, "item", null);
        setField(keepAliveStreamCleaner, "first", node);
        setField(keepAliveStreamCleaner, "size", 0);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        Deque deque = printingContext.currentThis;
        Object initialPrintingContextCurrentThisFirst = getFieldValue(deque, "first");
        
        printingContext.popCurrentThis();
        
        Deque deque1 = printingContext.currentThis;
        Object finalPrintingContextCurrentThisModCount = getFieldValue(deque1, "modCount");
        Deque deque2 = printingContext.currentThis;
        Object finalPrintingContextCurrentThisFirst = getFieldValue(deque2, "first");
        Deque deque3 = printingContext.currentThis;
        Object finalPrintingContextCurrentThisSize = getFieldValue(deque3, "size");
        
        assertNull(finalPrintingContextCurrentThisFirst);
        
        assertEquals(1, finalPrintingContextCurrentThisModCount);
        
        assertEquals(-1, finalPrintingContextCurrentThisSize);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        boolean actual = printingContext.isInCurrentScope(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        setField(printingContext, "currentTopLevel", ctEnumImpl);
        LinkedList linkedList = ((LinkedList) createInstance("java.util.LinkedList"));
        setField(linkedList, "size", 1);
        setField(printingContext, "currentThis", linkedList);
        
        printingContext.isInCurrentScope(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtTypeParameterImpl ctTypeParameterImpl = ((CtTypeParameterImpl) createInstance("spoon.support.reflect.declaration.CtTypeParameterImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctTypeParameterImpl, "factory", factoryImpl);
        setField(printingContext, "currentTopLevel", ctTypeParameterImpl);
        setField(printingContext, "currentThis", null);
        
        printingContext.isInCurrentScope(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope4() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        setField(printingContext, "currentTopLevel", ctEnumImpl);
        CtTypeReferenceImpl ctTypeReferenceImpl = ((CtTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtTypeReferenceImpl"));
        
        printingContext.isInCurrentScope(ctTypeReferenceImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        
        boolean actual = printingContext.isInCurrentScope(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintingContext1() {
        PrintingContext actual = new PrintingContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPrintingContext2() {
        PrintingContext actual = new PrintingContext();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClose1() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClose2() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(writable, "this$0", printingContext);
        setField(writable, "oldState", 0L);
        
        writable.close();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSetState1() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        Class writableClazz = Class.forName("spoon.reflect.visitor.PrintingContext$Writable");
        Class longType = long.class;
        Class booleanType = boolean.class;
        Method setStateMethod = writableClazz.getDeclaredMethod("setState", longType, booleanType);
        setStateMethod.setAccessible(true);
        java.lang.Object[] setStateMethodArguments = new java.lang.Object[2];
        setStateMethodArguments[0] = 0L;
        setStateMethodArguments[1] = false;
        try {
            setStateMethod.invoke(writable, setStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetState2() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(writable, "this$0", printingContext);
        
        Class writableClazz = Class.forName("spoon.reflect.visitor.PrintingContext$Writable");
        Class longType = long.class;
        Class booleanType = boolean.class;
        Method setStateMethod = writableClazz.getDeclaredMethod("setState", longType, booleanType);
        setStateMethod.setAccessible(true);
        java.lang.Object[] setStateMethodArguments = new java.lang.Object[2];
        setStateMethodArguments[0] = 0L;
        setStateMethodArguments[1] = true;
        setStateMethod.invoke(writable, setStateMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetState3() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(writable, "this$0", printingContext);
        
        Class writableClazz = Class.forName("spoon.reflect.visitor.PrintingContext$Writable");
        Class longType = long.class;
        Class booleanType = boolean.class;
        Method setStateMethod = writableClazz.getDeclaredMethod("setState", longType, booleanType);
        setStateMethod.setAccessible(true);
        java.lang.Object[] setStateMethodArguments = new java.lang.Object[2];
        setStateMethodArguments[0] = 0L;
        setStateMethodArguments[1] = false;
        setStateMethod.invoke(writable, setStateMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSkipArray4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.skipArray(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "SKIP_ARRAY", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.skipArray(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "SKIP_ARRAY", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.skipArray(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testForceWildcardGenerics4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.forceWildcardGenerics(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "FORCE_WILDCARD_GENERICS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.forceWildcardGenerics(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "FORCE_WILDCARD_GENERICS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.forceWildcardGenerics(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIgnoreEnclosingClass4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.ignoreEnclosingClass(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_ENCLOSING_CLASS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreEnclosingClass(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_ENCLOSING_CLASS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreEnclosingClass(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIgnoreStaticAccess4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.ignoreStaticAccess(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_STATIC_ACCESS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreStaticAccess(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_STATIC_ACCESS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreStaticAccess(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNoTypeDecl4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.noTypeDecl(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "NO_TYPE_DECL", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.noTypeDecl(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "NO_TYPE_DECL", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.noTypeDecl(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIgnoreGenerics4() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        
        writable.ignoreGenerics(false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics5() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_GENERICS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreGenerics(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_GENERICS", 0L);
        setField(writable, "this$0", printingContext);
        
        PrintingContext.Writable actual = writable.ignoreGenerics(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testWritable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class spoon.reflect.visitor.PrintingContext$Writable constructor testing is not supported yet
        // 
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testWritable_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Inner class spoon.reflect.visitor.PrintingContext$Writable constructor testing is not supported yet
        // 
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
