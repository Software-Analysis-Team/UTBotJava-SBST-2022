package spoon.reflect.factory;

import org.junit.Test;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.reference.CtTypeReferenceImpl;
import spoon.support.util.EmptyClearableList;
import spoon.support.reflect.reference.CtPackageReferenceImpl;
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
import spoon.support.reflect.reference.CtArrayTypeReferenceImpl;
import spoon.reflect.declaration.CtType;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import spoon.reflect.CtModelImpl;
import spoon.support.reflect.declaration.CtModuleImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.support.reflect.reference.CtTypeParameterReferenceImpl;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.cu.position.NoSourcePosition;
import spoon.support.reflect.reference.CtWildcardReferenceImpl;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class TypeFactoryTest {
    
    ///region Errors report for objectType
    
    public void testObjectType_errors()
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
    public void testObjectType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(typeFactory, "OBJECT", ctArrayTypeReferenceImpl);
        
        typeFactory.objectType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        CtType actual = typeFactory.get(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.get(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.get(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Class class1 = Object.class;
        
        typeFactory.get(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSimpleName1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getSimpleNameMethod = typeFactoryClazz.getDeclaredMethod("getSimpleName", stringType);
        getSimpleNameMethod.setAccessible(true);
        java.lang.Object[] getSimpleNameMethodArguments = new java.lang.Object[1];
        getSimpleNameMethodArguments[0] = string;
        String actual = ((String) getSimpleNameMethod.invoke(typeFactory, getSimpleNameMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(string, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSimpleName2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("\u0000\u0000");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getSimpleNameMethod = typeFactoryClazz.getDeclaredMethod("getSimpleName", stringType);
        getSimpleNameMethod.setAccessible(true);
        java.lang.Object[] getSimpleNameMethodArguments = new java.lang.Object[1];
        getSimpleNameMethodArguments[0] = string;
        String actual = ((String) getSimpleNameMethod.invoke(typeFactory, getSimpleNameMethodArguments));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(string, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSimpleName3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("\u0000\u0000\u0000$\u0000");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getSimpleNameMethod = typeFactoryClazz.getDeclaredMethod("getSimpleName", stringType);
        getSimpleNameMethod.setAccessible(true);
        java.lang.Object[] getSimpleNameMethodArguments = new java.lang.Object[1];
        getSimpleNameMethodArguments[0] = string;
        String actual = ((String) getSimpleNameMethod.invoke(typeFactory, getSimpleNameMethodArguments));
        
        String expected = new String("\u0000");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPackageName1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getPackageNameMethod = typeFactoryClazz.getDeclaredMethod("getPackageName", stringType);
        getPackageNameMethod.setAccessible(true);
        java.lang.Object[] getPackageNameMethodArguments = new java.lang.Object[1];
        getPackageNameMethodArguments[0] = string;
        String actual = ((String) getPackageNameMethod.invoke(typeFactory, getPackageNameMethodArguments));
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPackageName2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getPackageNameMethod = typeFactoryClazz.getDeclaredMethod("getPackageName", stringType);
        getPackageNameMethod.setAccessible(true);
        java.lang.Object[] getPackageNameMethodArguments = new java.lang.Object[1];
        getPackageNameMethodArguments[0] = string;
        String actual = ((String) getPackageNameMethod.invoke(typeFactory, getPackageNameMethodArguments));
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetPackageName3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("\u0000\u0000.\u0000\u0000\u0000\u0000");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getPackageNameMethod = typeFactoryClazz.getDeclaredMethod("getPackageName", stringType);
        getPackageNameMethod.setAccessible(true);
        java.lang.Object[] getPackageNameMethodArguments = new java.lang.Object[1];
        getPackageNameMethodArguments[0] = string;
        String actual = ((String) getPackageNameMethod.invoke(typeFactory, getPackageNameMethodArguments));
        
        String expected = new String("\u0000\u0000");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAll1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        List actual = typeFactory.getAll(false);
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.getAll(true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        setField(factoryImpl, "model", ctModelImpl);
        setField(factoryImpl, "packageF", null);
        setField(typeFactory, "factory", factoryImpl);
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryPackageF = getFieldValue(factory, "packageF");
        
        typeFactory.getAll(true);
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryPackageF = getFieldValue(factory1, "packageF");
        
        assertFalse(initialTypeFactoryFactoryPackageF == finalTypeFactoryFactoryPackageF);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        CtModuleImpl ctModuleImpl = ((CtModuleImpl) createInstance("spoon.support.reflect.declaration.CtModuleImpl"));
        setField(ctModelImpl, "unnamedModule", ctModuleImpl);
        setField(factoryImpl, "model", ctModelImpl);
        PackageFactory packageFactory = ((PackageFactory) createInstance("spoon.reflect.factory.PackageFactory"));
        setField(packageFactory, "factory", factoryImpl);
        setField(factoryImpl, "packageF", packageFactory);
        setField(typeFactory, "factory", factoryImpl);
        
        typeFactory.getAll(true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAll5() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        List actual = typeFactory.getAll();
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.getAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        ModuleFactory.CtUnnamedModule ctUnnamedModule = ((ModuleFactory.CtUnnamedModule) createInstance("spoon.reflect.factory.ModuleFactory$CtUnnamedModule"));
        setField(ctUnnamedModule, "factory", null);
        setField(ctModelImpl, "unnamedModule", ctUnnamedModule);
        setField(factoryImpl, "model", ctModelImpl);
        setField(typeFactory, "factory", factoryImpl);
        
        typeFactory.getAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtType) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createReference(((CtType) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        typeFactory.createReference(((CtType) null), false);
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        CtTypeReference actual = typeFactory.createReference(((Class) null), false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        Class class1 = Object.class;
        
        typeFactory.createReference(class1, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        Class class1 = Object.class;
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        typeFactory.createReference(class1, false);
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        CtTypeReference actual = typeFactory.createReference(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Class class1 = Object.class;
        
        typeFactory.createReference(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference9() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(typeFactory, "factory", factoryImpl);
        Class class1 = Object.class;
        
        typeFactory.createReference(class1);
    }
    ///endregion
    
    
    ///region Errors report for createReference
    
    public void testCreateReference_errors()
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
    public void testCreateReference11() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.createReference(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference12() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("");
        
        typeFactory.createReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference13() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        String string = new String("");
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        typeFactory.createReference(string);
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference14() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtType) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference15() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        typeFactory.createReference(ctClassImpl);
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference16() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtTypeParameter) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference17() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createReference(((CtTypeParameter) null));
    }
    ///endregion
    
    
    ///region Errors report for longType
    
    public void testLongType_errors()
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
    public void testLongType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "LONG", ctArrayTypeReferenceImpl);
        
        typeFactory.longType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLongType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "LONG", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.LONG;
        Object ctTypeReferenceLONGFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryLONGFactoryCore = getFieldValue(ctTypeReferenceLONGFactory, "core");
        
        typeFactory.longType();
        
        CtTypeReference ctTypeReference1 = typeFactory.LONG;
        Object ctTypeReference1LONGFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryLONGFactoryCore = getFieldValue(ctTypeReference1LONGFactory, "core");
        
        assertFalse(initialTypeFactoryLONGFactoryCore == finalTypeFactoryLONGFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for byteType
    
    public void testByteType_errors()
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
    public void testByteType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "BYTE", ctArrayTypeReferenceImpl);
        
        typeFactory.byteType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testByteType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "BYTE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.BYTE;
        Object ctTypeReferenceBYTEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryBYTEFactoryCore = getFieldValue(ctTypeReferenceBYTEFactory, "core");
        
        typeFactory.byteType();
        
        CtTypeReference ctTypeReference1 = typeFactory.BYTE;
        Object ctTypeReference1BYTEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryBYTEFactoryCore = getFieldValue(ctTypeReference1BYTEFactory, "core");
        
        assertFalse(initialTypeFactoryBYTEFactoryCore == finalTypeFactoryBYTEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for booleanType
    
    public void testBooleanType_errors()
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
    public void testBooleanType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "BOOLEAN", ctArrayTypeReferenceImpl);
        
        typeFactory.booleanType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBooleanType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "BOOLEAN", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.BOOLEAN;
        Object ctTypeReferenceBOOLEANFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryBOOLEANFactoryCore = getFieldValue(ctTypeReferenceBOOLEANFactory, "core");
        
        typeFactory.booleanType();
        
        CtTypeReference ctTypeReference1 = typeFactory.BOOLEAN;
        Object ctTypeReference1BOOLEANFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryBOOLEANFactoryCore = getFieldValue(ctTypeReference1BOOLEANFactory, "core");
        
        assertFalse(initialTypeFactoryBOOLEANFactoryCore == finalTypeFactoryBOOLEANFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for floatType
    
    public void testFloatType_errors()
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
    public void testFloatType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "FLOAT", ctArrayTypeReferenceImpl);
        
        typeFactory.floatType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloatType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "FLOAT", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.FLOAT;
        Object ctTypeReferenceFLOATFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryFLOATFactoryCore = getFieldValue(ctTypeReferenceFLOATFactory, "core");
        
        typeFactory.floatType();
        
        CtTypeReference ctTypeReference1 = typeFactory.FLOAT;
        Object ctTypeReference1FLOATFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryFLOATFactoryCore = getFieldValue(ctTypeReference1FLOATFactory, "core");
        
        assertFalse(initialTypeFactoryFLOATFactoryCore == finalTypeFactoryFLOATFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for shortType
    
    public void testShortType_errors()
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
    public void testShortType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "SHORT", ctArrayTypeReferenceImpl);
        
        typeFactory.shortType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testShortType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "SHORT", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.SHORT;
        Object ctTypeReferenceSHORTFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactorySHORTFactoryCore = getFieldValue(ctTypeReferenceSHORTFactory, "core");
        
        typeFactory.shortType();
        
        CtTypeReference ctTypeReference1 = typeFactory.SHORT;
        Object ctTypeReference1SHORTFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactorySHORTFactoryCore = getFieldValue(ctTypeReference1SHORTFactory, "core");
        
        assertFalse(initialTypeFactorySHORTFactoryCore == finalTypeFactorySHORTFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for doubleType
    
    public void testDoubleType_errors()
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
    public void testDoubleType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "DOUBLE", ctArrayTypeReferenceImpl);
        
        typeFactory.doubleType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoubleType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "DOUBLE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.DOUBLE;
        Object ctTypeReferenceDOUBLEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryDOUBLEFactoryCore = getFieldValue(ctTypeReferenceDOUBLEFactory, "core");
        
        typeFactory.doubleType();
        
        CtTypeReference ctTypeReference1 = typeFactory.DOUBLE;
        Object ctTypeReference1DOUBLEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryDOUBLEFactoryCore = getFieldValue(ctTypeReference1DOUBLEFactory, "core");
        
        assertFalse(initialTypeFactoryDOUBLEFactoryCore == finalTypeFactoryDOUBLEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for nullType
    
    public void testNullType_errors()
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
    public void testNullType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "NULL_TYPE", ctArrayTypeReferenceImpl);
        
        typeFactory.nullType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testNullType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "NULL_TYPE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.NULL_TYPE;
        Object ctTypeReferenceNULL_TYPEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryNULL_TYPEFactoryCore = getFieldValue(ctTypeReferenceNULL_TYPEFactory, "core");
        
        typeFactory.nullType();
        
        CtTypeReference ctTypeReference1 = typeFactory.NULL_TYPE;
        Object ctTypeReference1NULL_TYPEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryNULL_TYPEFactoryCore = getFieldValue(ctTypeReference1NULL_TYPEFactory, "core");
        
        assertFalse(initialTypeFactoryNULL_TYPEFactoryCore == finalTypeFactoryNULL_TYPEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for voidType
    
    public void testVoidType_errors()
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
    public void testVoidType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "VOID", ctArrayTypeReferenceImpl);
        
        typeFactory.voidType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVoidType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "VOID", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.VOID;
        Object ctTypeReferenceVOIDFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryVOIDFactoryCore = getFieldValue(ctTypeReferenceVOIDFactory, "core");
        
        typeFactory.voidType();
        
        CtTypeReference ctTypeReference1 = typeFactory.VOID;
        Object ctTypeReference1VOIDFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryVOIDFactoryCore = getFieldValue(ctTypeReference1VOIDFactory, "core");
        
        assertFalse(initialTypeFactoryVOIDFactoryCore == finalTypeFactoryVOIDFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for stringType
    
    public void testStringType_errors()
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
    public void testStringType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "STRING", ctArrayTypeReferenceImpl);
        
        typeFactory.stringType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testStringType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "STRING", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.STRING;
        Object ctTypeReferenceSTRINGFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactorySTRINGFactoryCore = getFieldValue(ctTypeReferenceSTRINGFactory, "core");
        
        typeFactory.stringType();
        
        CtTypeReference ctTypeReference1 = typeFactory.STRING;
        Object ctTypeReference1STRINGFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactorySTRINGFactoryCore = getFieldValue(ctTypeReference1STRINGFactory, "core");
        
        assertFalse(initialTypeFactorySTRINGFactoryCore == finalTypeFactorySTRINGFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for characterType
    
    public void testCharacterType_errors()
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
    public void testCharacterType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "CHARACTER", ctArrayTypeReferenceImpl);
        
        typeFactory.characterType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCharacterType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "CHARACTER", ctArrayTypeReferenceImpl);
        
        typeFactory.characterType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCharacterType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "CHARACTER", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.CHARACTER;
        Object ctTypeReferenceCHARACTERFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryCHARACTERFactoryCore = getFieldValue(ctTypeReferenceCHARACTERFactory, "core");
        
        typeFactory.characterType();
        
        CtTypeReference ctTypeReference1 = typeFactory.CHARACTER;
        Object ctTypeReference1CHARACTERFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryCHARACTERFactoryCore = getFieldValue(ctTypeReference1CHARACTERFactory, "core");
        
        assertFalse(initialTypeFactoryCHARACTERFactoryCore == finalTypeFactoryCHARACTERFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for characterPrimitiveType
    
    public void testCharacterPrimitiveType_errors()
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
    public void testCharacterPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "CHARACTER_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.characterPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCharacterPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "CHARACTER_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.characterPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCharacterPrimitiveType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "CHARACTER_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.CHARACTER_PRIMITIVE;
        Object ctTypeReferenceCHARACTER_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryCHARACTER_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceCHARACTER_PRIMITIVEFactory, "core");
        
        typeFactory.characterPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.CHARACTER_PRIMITIVE;
        Object ctTypeReference1CHARACTER_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryCHARACTER_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1CHARACTER_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryCHARACTER_PRIMITIVEFactoryCore == finalTypeFactoryCHARACTER_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for integerType
    
    public void testIntegerType_errors()
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
    public void testIntegerType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "INTEGER", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.INTEGER;
        Object ctTypeReferenceINTEGERFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryINTEGERFactoryCore = getFieldValue(ctTypeReferenceINTEGERFactory, "core");
        
        typeFactory.integerType();
        
        CtTypeReference ctTypeReference1 = typeFactory.INTEGER;
        Object ctTypeReference1INTEGERFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryINTEGERFactoryCore = getFieldValue(ctTypeReference1INTEGERFactory, "core");
        
        assertFalse(initialTypeFactoryINTEGERFactoryCore == finalTypeFactoryINTEGERFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIntegerType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "INTEGER", ctArrayTypeReferenceImpl);
        
        typeFactory.integerType();
    }
    ///endregion
    
    
    ///region Errors report for integerPrimitiveType
    
    public void testIntegerPrimitiveType_errors()
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
    public void testIntegerPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "INTEGER_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.integerPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIntegerPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "INTEGER_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.INTEGER_PRIMITIVE;
        Object ctTypeReferenceINTEGER_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryINTEGER_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceINTEGER_PRIMITIVEFactory, "core");
        
        typeFactory.integerPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.INTEGER_PRIMITIVE;
        Object ctTypeReference1INTEGER_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryINTEGER_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1INTEGER_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryINTEGER_PRIMITIVEFactoryCore == finalTypeFactoryINTEGER_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for longPrimitiveType
    
    public void testLongPrimitiveType_errors()
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
    public void testLongPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "LONG_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.LONG_PRIMITIVE;
        Object ctTypeReferenceLONG_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryLONG_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceLONG_PRIMITIVEFactory, "core");
        
        typeFactory.longPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.LONG_PRIMITIVE;
        Object ctTypeReference1LONG_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryLONG_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1LONG_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryLONG_PRIMITIVEFactoryCore == finalTypeFactoryLONG_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLongPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "LONG_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.longPrimitiveType();
    }
    ///endregion
    
    
    ///region Errors report for floatPrimitiveType
    
    public void testFloatPrimitiveType_errors()
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
    public void testFloatPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "FLOAT_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.floatPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloatPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "FLOAT_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.floatPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloatPrimitiveType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "FLOAT_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.FLOAT_PRIMITIVE;
        Object ctTypeReferenceFLOAT_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryFLOAT_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceFLOAT_PRIMITIVEFactory, "core");
        
        typeFactory.floatPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.FLOAT_PRIMITIVE;
        Object ctTypeReference1FLOAT_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryFLOAT_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1FLOAT_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryFLOAT_PRIMITIVEFactoryCore == finalTypeFactoryFLOAT_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for doublePrimitiveType
    
    public void testDoublePrimitiveType_errors()
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
    public void testDoublePrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "DOUBLE_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.doublePrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDoublePrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "DOUBLE_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.DOUBLE_PRIMITIVE;
        Object ctTypeReferenceDOUBLE_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryDOUBLE_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceDOUBLE_PRIMITIVEFactory, "core");
        
        typeFactory.doublePrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.DOUBLE_PRIMITIVE;
        Object ctTypeReference1DOUBLE_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryDOUBLE_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1DOUBLE_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryDOUBLE_PRIMITIVEFactoryCore == finalTypeFactoryDOUBLE_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for shortPrimitiveType
    
    public void testShortPrimitiveType_errors()
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
    public void testShortPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "SHORT_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.shortPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testShortPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "SHORT_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.SHORT_PRIMITIVE;
        Object ctTypeReferenceSHORT_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactorySHORT_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceSHORT_PRIMITIVEFactory, "core");
        
        typeFactory.shortPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.SHORT_PRIMITIVE;
        Object ctTypeReference1SHORT_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactorySHORT_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1SHORT_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactorySHORT_PRIMITIVEFactoryCore == finalTypeFactorySHORT_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for dateType
    
    public void testDateType_errors()
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
    public void testDateType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "DATE", ctArrayTypeReferenceImpl);
        
        typeFactory.dateType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDateType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "DATE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.DATE;
        Object ctTypeReferenceDATEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryDATEFactoryCore = getFieldValue(ctTypeReferenceDATEFactory, "core");
        
        typeFactory.dateType();
        
        CtTypeReference ctTypeReference1 = typeFactory.DATE;
        Object ctTypeReference1DATEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryDATEFactoryCore = getFieldValue(ctTypeReference1DATEFactory, "core");
        
        assertFalse(initialTypeFactoryDATEFactoryCore == finalTypeFactoryDATEFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddNestedType1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        ArrayList arrayList = new ArrayList();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class arrayListType = Class.forName("java.util.List");
        Class ctTypeType = Class.forName("spoon.reflect.declaration.CtType");
        Method addNestedTypeMethod = typeFactoryClazz.getDeclaredMethod("addNestedType", arrayListType, ctTypeType);
        addNestedTypeMethod.setAccessible(true);
        java.lang.Object[] addNestedTypeMethodArguments = new java.lang.Object[2];
        addNestedTypeMethodArguments[0] = arrayList;
        addNestedTypeMethodArguments[1] = null;
        try {
            addNestedTypeMethod.invoke(typeFactory, addNestedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddNestedType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class listType = Class.forName("java.util.List");
        Class ctTypeType = Class.forName("spoon.reflect.declaration.CtType");
        Method addNestedTypeMethod = typeFactoryClazz.getDeclaredMethod("addNestedType", listType, ctTypeType);
        addNestedTypeMethod.setAccessible(true);
        java.lang.Object[] addNestedTypeMethodArguments = new java.lang.Object[2];
        addNestedTypeMethodArguments[0] = null;
        addNestedTypeMethodArguments[1] = null;
        try {
            addNestedTypeMethod.invoke(typeFactory, addNestedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeclaringTypeName1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getDeclaringTypeNameMethod = typeFactoryClazz.getDeclaredMethod("getDeclaringTypeName", stringType);
        getDeclaringTypeNameMethod.setAccessible(true);
        java.lang.Object[] getDeclaringTypeNameMethodArguments = new java.lang.Object[1];
        getDeclaringTypeNameMethodArguments[0] = string;
        try {
            getDeclaringTypeNameMethod.invoke(typeFactory, getDeclaringTypeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetDeclaringTypeName2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getDeclaringTypeNameMethod = typeFactoryClazz.getDeclaredMethod("getDeclaringTypeName", stringType);
        getDeclaringTypeNameMethod.setAccessible(true);
        java.lang.Object[] getDeclaringTypeNameMethodArguments = new java.lang.Object[1];
        getDeclaringTypeNameMethodArguments[0] = string;
        try {
            getDeclaringTypeNameMethod.invoke(typeFactory, getDeclaringTypeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetDeclaringTypeName3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("$");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method getDeclaringTypeNameMethod = typeFactoryClazz.getDeclaredMethod("getDeclaringTypeName", stringType);
        getDeclaringTypeNameMethod.setAccessible(true);
        java.lang.Object[] getDeclaringTypeNameMethodArguments = new java.lang.Object[1];
        getDeclaringTypeNameMethodArguments[0] = string;
        String actual = ((String) getDeclaringTypeNameMethod.invoke(typeFactory, getDeclaringTypeNameMethodArguments));
        
        String expected = new String("");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReferences1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        ArrayList arrayList = new ArrayList();
        
        List actual = typeFactory.createReferences(arrayList);
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReferences2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.createReferences(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReferences3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        List actual = typeFactory.createReferences(arrayList);
        
        ArrayList expected = new ArrayList();
        expected.add(null);
        expected.add(null);
        expected.add(null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasInnerType1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasInnerTypeMethod = typeFactoryClazz.getDeclaredMethod("hasInnerType", stringType);
        hasInnerTypeMethod.setAccessible(true);
        java.lang.Object[] hasInnerTypeMethodArguments = new java.lang.Object[1];
        hasInnerTypeMethodArguments[0] = string;
        int actual = ((int) hasInnerTypeMethod.invoke(typeFactory, hasInnerTypeMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasInnerType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasInnerTypeMethod = typeFactoryClazz.getDeclaredMethod("hasInnerType", stringType);
        hasInnerTypeMethod.setAccessible(true);
        java.lang.Object[] hasInnerTypeMethodArguments = new java.lang.Object[1];
        hasInnerTypeMethodArguments[0] = null;
        try {
            hasInnerTypeMethod.invoke(typeFactory, hasInnerTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasInnerType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasInnerTypeMethod = typeFactoryClazz.getDeclaredMethod("hasInnerType", stringType);
        hasInnerTypeMethod.setAccessible(true);
        java.lang.Object[] hasInnerTypeMethodArguments = new java.lang.Object[1];
        hasInnerTypeMethodArguments[0] = string;
        int actual = ((int) hasInnerTypeMethod.invoke(typeFactory, hasInnerTypeMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    
    ///region Errors report for createTypeParameterReference
    
    public void testCreateTypeParameterReference_errors()
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
    public void testCreateTypeParameterReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createTypeParameterReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeAdapter1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createTypeAdapter(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeAdapter2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.createTypeAdapter(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        ArrayList arrayList = new ArrayList();
        
        typeFactory.createIntersectionTypeReferenceWithBounds(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createIntersectionTypeReferenceWithBounds(null);
    }
    ///endregion
    
    
    ///region Errors report for getDefaultBoundingType
    
    public void testGetDefaultBoundingType_errors()
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
    public void testGetDefaultBoundingType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(typeFactory, "OBJECT", ctArrayTypeReferenceImpl);
        
        CtTypeReference actual = typeFactory.getDefaultBoundingType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createImport(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createImport(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createArrayReference(((CtType) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createArrayReference(((CtType) null));
    }
    ///endregion
    
    
    ///region Errors report for createArrayReference
    
    public void testCreateArrayReference_errors()
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
    public void testCreateArrayReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createArrayReference(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference5() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createArrayReference(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.createArrayReference(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(null, 1);
        
        CtArrayTypeReferenceImpl expected = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(expected, "componentType", null);
        EmptyClearableList emptyClearableList = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(emptyClearableList, "modCount", 0);
        setField(expected, "actualTypeArguments", emptyClearableList);
        setField(expected, "declaringType", null);
        setField(expected, "pack", null);
        setField(expected, "isShadow", false);
        String string = new String("");
        setField(expected, "simplename", string);
        setField(expected, "factory", factoryImpl);
        setField(expected, "parent", null);
        setField(expected, "annotations", emptyClearableList);
        setField(expected, "comments", emptyClearableList);
        NoSourcePosition noSourcePosition = ((NoSourcePosition) createInstance("spoon.reflect.cu.position.NoSourcePosition"));
        setField(expected, "position", noSourcePosition);
        setField(expected, "metadata", null);
        setField(expected, "implicit", false);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(typeFactory, "factory", factoryImpl);
        
        Factory factory = typeFactory.factory;
        Object initialTypeFactoryFactoryCore = getFieldValue(factory, "core");
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(null, 2);
        
        CtArrayTypeReferenceImpl expected = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "componentType", null);
        EmptyClearableList emptyClearableList = ((EmptyClearableList) createInstance("spoon.support.util.EmptyClearableList"));
        setField(emptyClearableList, "modCount", 0);
        setField(ctArrayTypeReferenceImpl, "actualTypeArguments", emptyClearableList);
        setField(ctArrayTypeReferenceImpl, "declaringType", null);
        setField(ctArrayTypeReferenceImpl, "pack", null);
        setField(ctArrayTypeReferenceImpl, "isShadow", false);
        String string = new String("");
        setField(ctArrayTypeReferenceImpl, "simplename", string);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(ctArrayTypeReferenceImpl, "parent", expected);
        setField(ctArrayTypeReferenceImpl, "annotations", emptyClearableList);
        setField(ctArrayTypeReferenceImpl, "comments", emptyClearableList);
        NoSourcePosition noSourcePosition = ((NoSourcePosition) createInstance("spoon.reflect.cu.position.NoSourcePosition"));
        setField(ctArrayTypeReferenceImpl, "position", noSourcePosition);
        setField(ctArrayTypeReferenceImpl, "metadata", null);
        setField(ctArrayTypeReferenceImpl, "implicit", false);
        setField(expected, "componentType", ctArrayTypeReferenceImpl);
        setField(expected, "actualTypeArguments", emptyClearableList);
        setField(expected, "declaringType", null);
        setField(expected, "pack", null);
        setField(expected, "isShadow", false);
        setField(expected, "simplename", string);
        setField(expected, "factory", factoryImpl);
        setField(expected, "parent", null);
        setField(expected, "annotations", emptyClearableList);
        setField(expected, "comments", emptyClearableList);
        setField(expected, "position", noSourcePosition);
        setField(expected, "metadata", null);
        setField(expected, "implicit", false);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Factory factory1 = typeFactory.factory;
        Object finalTypeFactoryFactoryCore = getFieldValue(factory1, "core");
        
        assertFalse(initialTypeFactoryFactoryCore == finalTypeFactoryFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for createArrayReference
    
    public void testCreateArrayReference_errors1()
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
    public void testCreateArrayReference10() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createArrayReference(((CtTypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createWildcardStaticTypeMemberReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.createWildcardStaticTypeMemberReference(null);
    }
    ///endregion
    
    
    ///region Errors report for bytePrimitiveType
    
    public void testBytePrimitiveType_errors()
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
    public void testBytePrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        setField(typeFactory, "BYTE_PRIMITIVE", ctWildcardReferenceImpl);
        
        typeFactory.bytePrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBytePrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "BYTE_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.bytePrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBytePrimitiveType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctArrayTypeReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "BYTE_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.BYTE_PRIMITIVE;
        Object ctTypeReferenceBYTE_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryBYTE_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceBYTE_PRIMITIVEFactory, "core");
        
        typeFactory.bytePrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.BYTE_PRIMITIVE;
        Object ctTypeReference1BYTE_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryBYTE_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1BYTE_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryBYTE_PRIMITIVEFactoryCore == finalTypeFactoryBYTE_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPackage1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        String string = new String();
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasPackageMethod = typeFactoryClazz.getDeclaredMethod("hasPackage", stringType);
        hasPackageMethod.setAccessible(true);
        java.lang.Object[] hasPackageMethodArguments = new java.lang.Object[1];
        hasPackageMethodArguments[0] = string;
        int actual = ((int) hasPackageMethod.invoke(typeFactory, hasPackageMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasPackage2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasPackageMethod = typeFactoryClazz.getDeclaredMethod("hasPackage", stringType);
        hasPackageMethod.setAccessible(true);
        java.lang.Object[] hasPackageMethodArguments = new java.lang.Object[1];
        hasPackageMethodArguments[0] = null;
        try {
            hasPackageMethod.invoke(typeFactory, hasPackageMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPackage3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasPackageMethod = typeFactoryClazz.getDeclaredMethod("hasPackage", stringType);
        hasPackageMethod.setAccessible(true);
        java.lang.Object[] hasPackageMethodArguments = new java.lang.Object[1];
        hasPackageMethodArguments[0] = string;
        int actual = ((int) hasPackageMethod.invoke(typeFactory, hasPackageMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    
    ///region Errors report for voidPrimitiveType
    
    public void testVoidPrimitiveType_errors()
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
    public void testVoidPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(factoryImpl, "core", defaultCoreFactory);
        setField(ctWildcardReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "VOID_PRIMITIVE", ctWildcardReferenceImpl);
        
        typeFactory.voidPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVoidPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        setField(ctWildcardReferenceImpl, "factory", null);
        setField(typeFactory, "VOID_PRIMITIVE", ctWildcardReferenceImpl);
        
        typeFactory.voidPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVoidPrimitiveType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "VOID_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.voidPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVoidPrimitiveType5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctWildcardReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "VOID_PRIMITIVE", ctWildcardReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.VOID_PRIMITIVE;
        Object ctTypeReferenceVOID_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryVOID_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceVOID_PRIMITIVEFactory, "core");
        
        typeFactory.voidPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.VOID_PRIMITIVE;
        Object ctTypeReference1VOID_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryVOID_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1VOID_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryVOID_PRIMITIVEFactoryCore == finalTypeFactoryVOID_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    
    ///region Errors report for booleanPrimitiveType
    
    public void testBooleanPrimitiveType_errors()
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
    public void testBooleanPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        setField(ctWildcardReferenceImpl, "factory", null);
        setField(typeFactory, "BOOLEAN_PRIMITIVE", ctWildcardReferenceImpl);
        
        typeFactory.booleanPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBooleanPrimitiveType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtArrayTypeReferenceImpl ctArrayTypeReferenceImpl = ((CtArrayTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtArrayTypeReferenceImpl"));
        setField(ctArrayTypeReferenceImpl, "factory", null);
        setField(typeFactory, "BOOLEAN_PRIMITIVE", ctArrayTypeReferenceImpl);
        
        typeFactory.booleanPrimitiveType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBooleanPrimitiveType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtWildcardReferenceImpl ctWildcardReferenceImpl = ((CtWildcardReferenceImpl) createInstance("spoon.support.reflect.reference.CtWildcardReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "core", null);
        setField(ctWildcardReferenceImpl, "factory", factoryImpl);
        setField(typeFactory, "BOOLEAN_PRIMITIVE", ctWildcardReferenceImpl);
        
        CtTypeReference ctTypeReference = typeFactory.BOOLEAN_PRIMITIVE;
        Object ctTypeReferenceBOOLEAN_PRIMITIVEFactory = getFieldValue(ctTypeReference, "factory");
        Object initialTypeFactoryBOOLEAN_PRIMITIVEFactoryCore = getFieldValue(ctTypeReferenceBOOLEAN_PRIMITIVEFactory, "core");
        
        typeFactory.booleanPrimitiveType();
        
        CtTypeReference ctTypeReference1 = typeFactory.BOOLEAN_PRIMITIVE;
        Object ctTypeReference1BOOLEAN_PRIMITIVEFactory = getFieldValue(ctTypeReference1, "factory");
        Object finalTypeFactoryBOOLEAN_PRIMITIVEFactoryCore = getFieldValue(ctTypeReference1BOOLEAN_PRIMITIVEFactory, "core");
        
        assertFalse(initialTypeFactoryBOOLEAN_PRIMITIVEFactoryCore == finalTypeFactoryBOOLEAN_PRIMITIVEFactoryCore);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testTypeFactory1() {
        TypeFactory actual = new TypeFactory();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTypeFactory2() {
        new TypeFactory(null);
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
