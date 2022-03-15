package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.PrintingContext;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.declaration.CtType;
import spoon.support.util.SortedList;
import sun.awt.image.PixelConverter.ArgbPre;
import sun.awt.image.PixelConverter;
import java.util.ArrayDeque;
import java.lang.reflect.Method;
import sun.font.CompositeFont;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static java.lang.reflect.Array.get;
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
    public void testToString2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", -1L);
        setField(printingContext, "IGNORE_GENERICS", -1L);
        
        String actual = printingContext.toString();
        
        String expected = new String("context.ignoreGenerics: true\n");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "state", 0L);
        setField(printingContext, "IGNORE_GENERICS", 0L);
        
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
        setField(expected, "this$0", printingContext);
        setField(expected, "oldState", 0L);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        setField(printingContext, "currentThis", null);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference4() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        printingContext.currentTopLevel = ctTypeMock;
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        setField(sortedList, "size", -2147483647);
        setField(printingContext, "currentThis", sortedList);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        setField(sortedList, "first", null);
        setField(sortedList, "size", 1);
        setField(printingContext, "currentThis", sortedList);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference6() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        printingContext.currentTopLevel = ctTypeMock;
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        Object node = createInstance("java.util.LinkedList$Node");
        TypeContext typeContext = ((TypeContext) createInstance("spoon.reflect.visitor.TypeContext"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        typeContext.typeRef = ctTypeReferenceMock;
        setField(node, "item", typeContext);
        setField(sortedList, "first", node);
        setField(sortedList, "size", 1);
        setField(printingContext, "currentThis", sortedList);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCurrentTypeReference7() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        printingContext.currentTopLevel = ctTypeMock;
        SortedList sortedList = ((SortedList) createInstance("spoon.support.util.SortedList"));
        Object node = createInstance("java.util.LinkedList$Node");
        sun.awt.image.PixelConverter.ArgbPre[] argbPreArray = new sun.awt.image.PixelConverter.ArgbPre[0];
        setField(node, "item", argbPreArray);
        setField(sortedList, "first", node);
        setField(sortedList, "size", 1);
        setField(printingContext, "currentThis", sortedList);
        
        printingContext.getCurrentTypeReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference8() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        printingContext.currentTopLevel = ctTypeMock;
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", -3145729);
        setField(arrayDeque, "head", -3145728);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeReference9() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        printingContext.currentTopLevel = ctTypeMock;
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", -5);
        setField(arrayDeque, "head", 4);
        java.lang.Object[] objectArray = new java.lang.Object[39];
        TypeContext typeContext = ((TypeContext) createInstance("spoon.reflect.visitor.TypeContext"));
        setField(typeContext, "typeRef", null);
        objectArray[4] = ((Object) typeContext);
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        CtTypeReference actual = printingContext.getCurrentTypeReference();
        
        assertNull(actual);
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
        setField(arrayDeque, "head", -131072);
        java.lang.Object[] objectArray = new java.lang.Object[32];
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
    public void testGetCurrentTypeContext4() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "size", -2147483647);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        TypeContext actual = ((TypeContext) getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCurrentTypeContext5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        Object node = createInstance("java.util.LinkedList$Node");
        sun.font.CompositeFont[] compositeFontArray = new sun.font.CompositeFont[0];
        setField(node, "item", compositeFontArray);
        setField(keepAliveStreamCleaner, "first", node);
        setField(keepAliveStreamCleaner, "size", 1);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        try {
            getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCurrentTypeContext6() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        Object node = createInstance("java.util.LinkedList$Node");
        setField(node, "item", null);
        setField(keepAliveStreamCleaner, "first", node);
        setField(keepAliveStreamCleaner, "size", 1);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        TypeContext actual = ((TypeContext) getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCurrentTypeContext7() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 1073741823);
        setField(arrayDeque, "head", 1073741824);
        java.lang.Object[] objectArray = new java.lang.Object[39];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        try {
            getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCurrentTypeContext8() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 1);
        setField(arrayDeque, "head", -2147483646);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        Class printingContextClazz = Class.forName("spoon.reflect.visitor.PrintingContext");
        Method getCurrentTypeContextMethod = printingContextClazz.getDeclaredMethod("getCurrentTypeContext");
        getCurrentTypeContextMethod.setAccessible(true);
        java.lang.Object[] getCurrentTypeContextMethodArguments = new java.lang.Object[0];
        try {
            getCurrentTypeContextMethod.invoke(printingContext, getCurrentTypeContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPushCurrentThis1() throws Throwable  {
        PrintingContext printingContext = new PrintingContext();
        
        printingContext.pushCurrentThis(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPushCurrentThis2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", 0);
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[39];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        
        Deque deque = printingContext.currentThis;
        Object dequeCurrentThisElements = getFieldValue(deque, "elements");
        Object initialPrintingContextCurrentThisElements38 = get(dequeCurrentThisElements, 38);
        
        printingContext.pushCurrentThis(ctTypeMock);
        
        Deque deque1 = printingContext.currentThis;
        Object finalPrintingContextCurrentThisHead = getFieldValue(deque1, "head");
        Deque deque2 = printingContext.currentThis;
        Object deque2CurrentThisElements = getFieldValue(deque2, "elements");
        Object finalPrintingContextCurrentThisElements38 = get(deque2CurrentThisElements, 38);
        
        assertFalse(initialPrintingContextCurrentThisElements38 == finalPrintingContextCurrentThisElements38);
        
        assertEquals(38, finalPrintingContextCurrentThisHead);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPushCurrentThis3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        
        printingContext.pushCurrentThis(ctTypeMock);
        
        Deque deque = printingContext.currentThis;
        Object finalPrintingContextCurrentThisHead = getFieldValue(deque, "head");
        
        assertEquals(-1, finalPrintingContextCurrentThisHead);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPushCurrentThis4() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 1071120384);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        
        printingContext.pushCurrentThis(ctTypeMock);
        
        Deque deque = printingContext.currentThis;
        Object finalPrintingContextCurrentThisHead = getFieldValue(deque, "head");
        
        assertEquals(1071120383, finalPrintingContextCurrentThisHead);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPushCurrentThis5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        LinkedList linkedList = ((LinkedList) createInstance("java.util.LinkedList"));
        setField(printingContext, "currentThis", linkedList);
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        
        printingContext.pushCurrentThis(ctTypeMock);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "first", null);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        printingContext.popCurrentThis();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopCurrentThis4() throws Throwable  {
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 0);
        java.lang.Object[] objectArray = new java.lang.Object[17];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        printingContext.popCurrentThis();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis6() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", 40);
        java.lang.Object[] objectArray = new java.lang.Object[40];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        printingContext.popCurrentThis();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopCurrentThis7() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "head", Integer.MIN_VALUE);
        java.lang.Object[] objectArray = new java.lang.Object[16];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        printingContext.popCurrentThis();
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
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope2() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        setField(printingContext, "currentTopLevel", null);
        
        boolean actual = printingContext.isInCurrentScope(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope3() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        setField(printingContext, "currentThis", null);
        
        boolean actual = printingContext.isInCurrentScope(ctTypeReferenceMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope4() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        setField(printingContext, "currentThis", null);
        
        boolean actual = printingContext.isInCurrentScope(ctTypeReferenceMock);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope5() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getReference()).thenReturn(((CtTypeReference) null));
        printingContext.currentTopLevel = ctTypeMock;
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "size", -2147483647);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        boolean actual = printingContext.isInCurrentScope(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsInCurrentScope6() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "first", null);
        setField(keepAliveStreamCleaner, "size", 1);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        boolean actual = printingContext.isInCurrentScope(ctTypeReferenceMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope7() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        printingContext.currentTopLevel = ctTypeMock;
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        Object node = createInstance("java.util.LinkedList$Node");
        TypeContext typeContext = ((TypeContext) createInstance("spoon.reflect.visitor.TypeContext"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        typeContext.typeRef = ctTypeReferenceMock;
        setField(node, "item", typeContext);
        setField(keepAliveStreamCleaner, "first", node);
        setField(keepAliveStreamCleaner, "size", 1);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        printingContext.isInCurrentScope(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope8() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        printingContext.currentTopLevel = ctTypeMock;
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        Object node = createInstance("java.util.LinkedList$Node");
        sun.awt.image.PixelConverter.ArgbPre[] argbPreArray = new sun.awt.image.PixelConverter.ArgbPre[0];
        setField(node, "item", argbPreArray);
        setField(keepAliveStreamCleaner, "first", node);
        setField(keepAliveStreamCleaner, "size", 1);
        setField(printingContext, "currentThis", keepAliveStreamCleaner);
        
        printingContext.isInCurrentScope(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsInCurrentScope9() throws Throwable  {
        PrintingContext printingContext = ((PrintingContext) createInstance("spoon.reflect.visitor.PrintingContext"));
        CtType ctTypeMock = mock(CtType.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeMock.getReference()).thenReturn(ctTypeReferenceMock);
        printingContext.currentTopLevel = ctTypeMock;
        ArrayDeque arrayDeque = ((ArrayDeque) createInstance("java.util.ArrayDeque"));
        setField(arrayDeque, "tail", -3145729);
        setField(arrayDeque, "head", -3145728);
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(arrayDeque, "elements", objectArray);
        setField(printingContext, "currentThis", arrayDeque);
        
        printingContext.isInCurrentScope(null);
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        setField(writable, "oldState", 0L);
        
        writable.close();
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.skipArray(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSkipArray6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.skipArray(true);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
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
    
    @Test(timeout = 10000)
    public void testSetState3() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreStaticAccess(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreStaticAccess6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreStaticAccess(true);
        
        
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.noTypeDecl(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testNoTypeDecl6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.noTypeDecl(true);
        
        
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreGenerics(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreGenerics6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreGenerics(true);
        
        
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.forceWildcardGenerics(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testForceWildcardGenerics6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.forceWildcardGenerics(true);
        
        
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
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreEnclosingClass(false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(writable, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIgnoreEnclosingClass6() throws Throwable  {
        PrintingContext.Writable writable = ((PrintingContext.Writable) createInstance("spoon.reflect.visitor.PrintingContext$Writable"));
        PrintingContext printingContextMock = mock(PrintingContext.class);
        setField(writable, "this$0", printingContextMock);
        
        PrintingContext.Writable actual = writable.ignoreEnclosingClass(true);
        
        
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
