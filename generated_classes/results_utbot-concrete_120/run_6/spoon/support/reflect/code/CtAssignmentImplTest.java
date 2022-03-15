package spoon.support.reflect.code;

import org.junit.Test;
import spoon.reflect.visitor.CtBiScannerDefault;
import sun.awt.image.PixelConverter;
import java.lang.reflect.Method;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.visitor.equals.EqualsVisitor;
import spoon.support.visitor.equals.EqualsChecker;
import spoon.reflect.code.CtAssignment;
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
import spoon.reflect.declaration.CtTypedElement;
import spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl;
import spoon.support.reflect.reference.CtTypeReferenceImpl;
import spoon.reflect.reference.CtTypeReference;
import java.util.List;
import java.util.ArrayList;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtRHSReceiver;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class CtAssignmentImplTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        ctAssignmentImpl.accept(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        
        ctAssignmentImpl.accept(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        CtBiScannerDefault ctBiScannerDefault = ((CtBiScannerDefault) createInstance("spoon.reflect.visitor.CtBiScannerDefault"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        Object node = createInstance("java.util.LinkedList$Node");
        sun.awt.image.PixelConverter[] pixelConverterArray = new sun.awt.image.PixelConverter[0];
        setField(node, "item", pixelConverterArray);
        setField(keepAliveStreamCleaner, "first", node);
        setField(ctBiScannerDefault, "stack", keepAliveStreamCleaner);
        
        Class ctAssignmentImplClazz = Class.forName("spoon.support.reflect.code.CtAssignmentImpl");
        Class ctBiScannerDefaultType = Class.forName("spoon.reflect.visitor.CtVisitor");
        Method acceptMethod = ctAssignmentImplClazz.getDeclaredMethod("accept", ctBiScannerDefaultType);
        acceptMethod.setAccessible(true);
        java.lang.Object[] acceptMethodArguments = new java.lang.Object[1];
        acceptMethodArguments[0] = ctBiScannerDefault;
        try {
            acceptMethod.invoke(ctAssignmentImpl, acceptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept4() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        DefaultJavaPrettyPrinter defaultJavaPrettyPrinter = ((DefaultJavaPrettyPrinter) createInstance("spoon.reflect.visitor.DefaultJavaPrettyPrinter"));
        setField(defaultJavaPrettyPrinter, "elementPrinterHelper", null);
        
        ctAssignmentImpl.accept(defaultJavaPrettyPrinter);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAccept5() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        EqualsVisitor equalsVisitor = ((EqualsVisitor) createInstance("spoon.support.visitor.equals.EqualsVisitor"));
        Object keepAliveStreamCleaner = createInstance("sun.net.www.http.KeepAliveStreamCleaner");
        setField(keepAliveStreamCleaner, "first", null);
        setField(equalsVisitor, "stack", keepAliveStreamCleaner);
        EqualsChecker equalsChecker = ((EqualsChecker) createInstance("spoon.support.visitor.equals.EqualsChecker"));
        setField(equalsChecker, "isNotEqual", false);
        setField(equalsChecker, "other", null);
        setField(equalsVisitor, "checker", equalsChecker);
        
        Class ctAssignmentImplClazz = Class.forName("spoon.support.reflect.code.CtAssignmentImpl");
        Class equalsVisitorType = Class.forName("spoon.reflect.visitor.CtVisitor");
        Method acceptMethod = ctAssignmentImplClazz.getDeclaredMethod("accept", equalsVisitorType);
        acceptMethod.setAccessible(true);
        java.lang.Object[] acceptMethodArguments = new java.lang.Object[1];
        acceptMethodArguments[0] = equalsVisitor;
        try {
            acceptMethod.invoke(ctAssignmentImpl, acceptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for clone
    
    public void testClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // ClassId java.nio.charset.CoderResult$1 does not have canonical name
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testClone2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "factory", null);
        
        ctAssignmentImpl.clone();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetType1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtTypedElement actual = ctAssignmentImpl.setType(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetType2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "parent", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(ctAssignmentImpl, "factory", factoryImpl);
        CtWildcardStaticTypeMemberReferenceImpl ctWildcardStaticTypeMemberReferenceImpl = ((CtWildcardStaticTypeMemberReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl"));
        setField(ctWildcardStaticTypeMemberReferenceImpl, "parent", null);
        setField(ctWildcardStaticTypeMemberReferenceImpl, "factory", null);
        
        Object ctAssignmentImplFactory = getFieldValue(ctAssignmentImpl, "factory");
        Object initialCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory, "environment");
        
        Object initialCtWildcardStaticTypeMemberReferenceImplParent = getFieldValue(ctWildcardStaticTypeMemberReferenceImpl, "parent");
        
        Class ctAssignmentImplClazz = Class.forName("spoon.support.reflect.code.CtAssignmentImpl");
        Class ctWildcardStaticTypeMemberReferenceImplType = Class.forName("spoon.reflect.reference.CtTypeReference");
        Method setTypeMethod = ctAssignmentImplClazz.getDeclaredMethod("setType", ctWildcardStaticTypeMemberReferenceImplType);
        setTypeMethod.setAccessible(true);
        java.lang.Object[] setTypeMethodArguments = new java.lang.Object[1];
        setTypeMethodArguments[0] = ctWildcardStaticTypeMemberReferenceImpl;
        CtTypedElement actual = ((CtTypedElement) setTypeMethod.invoke(ctAssignmentImpl, setTypeMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
        
        Object ctAssignmentImplFactory1 = getFieldValue(ctAssignmentImpl, "factory");
        Object finalCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory1, "environment");
        
        Object finalCtWildcardStaticTypeMemberReferenceImplParent = getFieldValue(ctWildcardStaticTypeMemberReferenceImpl, "parent");
        
        assertFalse(initialCtAssignmentImplFactoryEnvironment == finalCtAssignmentImplFactoryEnvironment);
        
        assertFalse(initialCtWildcardStaticTypeMemberReferenceImplParent == finalCtWildcardStaticTypeMemberReferenceImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetType3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "parent", null);
        setField(ctAssignmentImpl, "factory", null);
        CtTypeReferenceImpl ctTypeReferenceImpl = ((CtTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtTypeReferenceImpl"));
        setField(ctTypeReferenceImpl, "parent", null);
        setField(ctTypeReferenceImpl, "factory", null);
        
        Object initialCtTypeReferenceImplParent = getFieldValue(ctTypeReferenceImpl, "parent");
        
        CtTypedElement actual = ctAssignmentImpl.setType(ctTypeReferenceImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
        
        Object finalCtTypeReferenceImplParent = getFieldValue(ctTypeReferenceImpl, "parent");
        
        assertFalse(initialCtTypeReferenceImplParent == finalCtTypeReferenceImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtTypeReference actual = ctAssignmentImpl.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        CtTypeReferenceImpl ctTypeReferenceImpl = ((CtTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtTypeReferenceImpl"));
        setField(ctAssignmentImpl, "type", ctTypeReferenceImpl);
        
        CtTypeReference actual = ctAssignmentImpl.getType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testS1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        Object actual = ctAssignmentImpl.S();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testS2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        
        Object actual = ctAssignmentImpl.S();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCasts1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        List actual = ctAssignmentImpl.getTypeCasts();
        
        EmptyClearableList expected = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(expected, "modCount", 0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetTypeCasts2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        
        List actual = ctAssignmentImpl.getTypeCasts();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(arrayList, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTypeCasts1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        ArrayList arrayList = new ArrayList();
        
        CtExpression actual = ctAssignmentImpl.setTypeCasts(arrayList);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTypeCasts2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        
        CtExpression actual = ctAssignmentImpl.setTypeCasts(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTypeCasts3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(ctAssignmentImpl, "factory", factoryImpl);
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        
        CtExpression actual = ctAssignmentImpl.setTypeCasts(arrayList1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetTypeCasts4() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        
        CtExpression actual = ctAssignmentImpl.setTypeCasts(arrayList1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddTypeCast1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtExpression actual = ctAssignmentImpl.addTypeCast(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddTypeCast2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        
        CtExpression actual = ctAssignmentImpl.addTypeCast(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddTypeCast3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        CtTypeReferenceImpl ctTypeReferenceImpl = ((CtTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtTypeReferenceImpl"));
        
        CtExpression actual = ctAssignmentImpl.addTypeCast(ctTypeReferenceImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddTypeCast4() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "parent", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(ctAssignmentImpl, "factory", factoryImpl);
        ArrayList arrayList = new ArrayList();
        setField(ctAssignmentImpl, "typeCasts", arrayList);
        CtWildcardStaticTypeMemberReferenceImpl ctWildcardStaticTypeMemberReferenceImpl = ((CtWildcardStaticTypeMemberReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardStaticTypeMemberReferenceImpl"));
        setField(ctWildcardStaticTypeMemberReferenceImpl, "parent", null);
        setField(ctWildcardStaticTypeMemberReferenceImpl, "factory", null);
        
        Object ctAssignmentImplFactory = getFieldValue(ctAssignmentImpl, "factory");
        Object initialCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory, "environment");
        
        Object initialCtWildcardStaticTypeMemberReferenceImplParent = getFieldValue(ctWildcardStaticTypeMemberReferenceImpl, "parent");
        
        Class ctAssignmentImplClazz = Class.forName("spoon.support.reflect.code.CtAssignmentImpl");
        Class ctWildcardStaticTypeMemberReferenceImplType = Class.forName("spoon.reflect.reference.CtTypeReference");
        Method addTypeCastMethod = ctAssignmentImplClazz.getDeclaredMethod("addTypeCast", ctWildcardStaticTypeMemberReferenceImplType);
        addTypeCastMethod.setAccessible(true);
        java.lang.Object[] addTypeCastMethodArguments = new java.lang.Object[1];
        addTypeCastMethodArguments[0] = ctWildcardStaticTypeMemberReferenceImpl;
        CtExpression actual = ((CtExpression) addTypeCastMethod.invoke(ctAssignmentImpl, addTypeCastMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
        
        Object ctAssignmentImplFactory1 = getFieldValue(ctAssignmentImpl, "factory");
        Object finalCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory1, "environment");
        
        Object finalCtWildcardStaticTypeMemberReferenceImplParent = getFieldValue(ctWildcardStaticTypeMemberReferenceImpl, "parent");
        
        assertFalse(initialCtAssignmentImplFactoryEnvironment == finalCtAssignmentImplFactoryEnvironment);
        
        assertFalse(initialCtWildcardStaticTypeMemberReferenceImplParent == finalCtWildcardStaticTypeMemberReferenceImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAssignment1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtExpression actual = ctAssignmentImpl.getAssignment();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAssignment2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        setField(ctOperatorAssignmentImpl, "assignment", null);
        setField(ctAssignmentImpl, "assignment", ctOperatorAssignmentImpl);
        
        CtExpression actual = ctAssignmentImpl.getAssignment();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctOperatorAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssignment1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtRHSReceiver actual = ctAssignmentImpl.setAssignment(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssignment2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "parent", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(ctAssignmentImpl, "factory", factoryImpl);
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        setField(ctOperatorAssignmentImpl, "parent", null);
        setField(ctOperatorAssignmentImpl, "factory", null);
        
        Object ctAssignmentImplFactory = getFieldValue(ctAssignmentImpl, "factory");
        Object initialCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory, "environment");
        
        Object initialCtOperatorAssignmentImplParent = getFieldValue(ctOperatorAssignmentImpl, "parent");
        
        CtRHSReceiver actual = ctAssignmentImpl.setAssignment(ctOperatorAssignmentImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
        
        Object ctAssignmentImplFactory1 = getFieldValue(ctAssignmentImpl, "factory");
        Object finalCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory1, "environment");
        
        Object finalCtOperatorAssignmentImplParent = getFieldValue(ctOperatorAssignmentImpl, "parent");
        
        assertFalse(initialCtAssignmentImplFactoryEnvironment == finalCtAssignmentImplFactoryEnvironment);
        
        assertFalse(initialCtOperatorAssignmentImplParent == finalCtOperatorAssignmentImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssignment3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "factory", null);
        
        CtRHSReceiver actual = ctAssignmentImpl.setAssignment(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssigned1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtAssignment actual = ctAssignmentImpl.setAssigned(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssigned2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "parent", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(ctAssignmentImpl, "factory", factoryImpl);
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        setField(ctOperatorAssignmentImpl, "parent", null);
        setField(ctOperatorAssignmentImpl, "factory", null);
        
        Object ctAssignmentImplFactory = getFieldValue(ctAssignmentImpl, "factory");
        Object initialCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory, "environment");
        
        Object initialCtOperatorAssignmentImplParent = getFieldValue(ctOperatorAssignmentImpl, "parent");
        
        CtAssignment actual = ctAssignmentImpl.setAssigned(ctOperatorAssignmentImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
        
        Object ctAssignmentImplFactory1 = getFieldValue(ctAssignmentImpl, "factory");
        Object finalCtAssignmentImplFactoryEnvironment = getFieldValue(ctAssignmentImplFactory1, "environment");
        
        Object finalCtOperatorAssignmentImplParent = getFieldValue(ctOperatorAssignmentImpl, "parent");
        
        assertFalse(initialCtAssignmentImplFactoryEnvironment == finalCtAssignmentImplFactoryEnvironment);
        
        assertFalse(initialCtOperatorAssignmentImplParent == finalCtOperatorAssignmentImplParent);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetAssigned3() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        setField(ctAssignmentImpl, "factory", null);
        
        CtAssignment actual = ctAssignmentImpl.setAssigned(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAssigned1() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = new CtAssignmentImpl();
        
        CtExpression actual = ctAssignmentImpl.getAssigned();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAssigned2() throws Throwable  {
        CtAssignmentImpl ctAssignmentImpl = ((CtAssignmentImpl) createInstance("spoon.support.reflect.code.CtAssignmentImpl"));
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        setField(ctOperatorAssignmentImpl, "assigned", null);
        setField(ctAssignmentImpl, "assigned", ctOperatorAssignmentImpl);
        
        CtExpression actual = ctAssignmentImpl.getAssigned();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctOperatorAssignmentImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtAssignmentImpl1() {
        CtAssignmentImpl actual = new CtAssignmentImpl();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCtAssignmentImpl2() {
        CtAssignmentImpl actual = new CtAssignmentImpl();
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
