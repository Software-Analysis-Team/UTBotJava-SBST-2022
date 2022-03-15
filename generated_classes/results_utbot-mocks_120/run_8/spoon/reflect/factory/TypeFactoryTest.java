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
import java.util.List;
import java.util.ArrayList;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtPackage;
import java.lang.reflect.Method;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.support.reflect.reference.CtArrayTypeReferenceImpl;
import spoon.reflect.reference.CtPackageReference;
import spoon.support.reflect.reference.CtTypeParameterReferenceImpl;
import spoon.reflect.declaration.CtFormalTypeDeclarer;
import spoon.support.visitor.GenericTypeAdapter;
import spoon.reflect.reference.CtReference;
import spoon.reflect.declaration.CtImport;
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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
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
    
    @Test(timeout = 10000)
    public void testObjectType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "OBJECT", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.objectType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAll1() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        List actual = typeFactory.getAll();
        
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
        
        typeFactory.getAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.getModel()).thenReturn(((spoon.reflect.CtModel) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.getAll();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetAll4() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        List actual = typeFactory.getAll(false);
        
        ArrayList expected = new ArrayList();
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        
        typeFactory.getAll(true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Package()).thenReturn(((PackageFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.getAll(true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetAll7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.getAll()).thenReturn(((java.util.Collection) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.getAll(true);
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
    public void testCreateReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.createReference(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("");
        
        typeFactory.createReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        String string = new String("");
        
        typeFactory.createReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("\u0000\u0000\u0000\u0000");
        
        typeFactory.createReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference6() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtTypeParameter) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createReference(((CtTypeParameter) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtTypeParameter ctTypeParameterMock = mock(CtTypeParameter.class);
        
        typeFactory.createReference(ctTypeParameterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference9() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(((CtTypeParameterReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createReference(((CtTypeParameter) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference10() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(((CtTypeParameterReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtTypeParameter ctTypeParameterMock = mock(CtTypeParameter.class);
        when(ctTypeParameterMock.getSuperclass()).thenReturn(((CtTypeReference) null));
        when(ctTypeParameterMock.getAnnotations()).thenReturn(((List) null));
        
        typeFactory.createReference(ctTypeParameterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference11() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(((CtTypeParameterReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtTypeParameter ctTypeParameterMock = mock(CtTypeParameter.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeParameterMock.getSuperclass()).thenReturn(ctTypeReferenceMock, ((CtTypeReference) null));
        
        typeFactory.createReference(ctTypeParameterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference12() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeParameterReference ctTypeParameterReferenceMock = mock(CtTypeParameterReference.class);
        when(ctTypeParameterReferenceMock.setBoundingType(any())).thenReturn(((CtTypeParameterReference) null));
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(ctTypeParameterReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtTypeParameter ctTypeParameterMock = mock(CtTypeParameter.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        when(ctTypeParameterMock.getSuperclass()).thenReturn(ctTypeReferenceMock, ctTypeReferenceMock);
        when(ctTypeParameterMock.getAnnotations()).thenReturn(((List) null));
        
        typeFactory.createReference(ctTypeParameterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference13() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(((CtTypeParameterReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtTypeParameter ctTypeParameterMock = mock(CtTypeParameter.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        when(ctTypeParameterMock.getSuperclass()).thenReturn(ctTypeReferenceMock, ctTypeReferenceMock);
        
        typeFactory.createReference(ctTypeParameterMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference14() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        CtTypeReference actual = typeFactory.createReference(((Class) null), false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference15() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        Class class1 = Object.class;
        
        typeFactory.createReference(class1, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference16() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        Class class1 = Object.class;
        
        typeFactory.createReference(class1, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference17() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        CtTypeReference actual = typeFactory.createReference(((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference18() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtType) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference19() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtType ctTypeMock = mock(CtType.class);
        
        typeFactory.createReference(ctTypeMock, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference20() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createReference(((CtType) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference21() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeReference()).thenReturn(((CtTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createReference(((CtType) null), false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference22() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        when(ctTypeMock.getPackage()).thenReturn(((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtTypeReference actual = typeFactory.createReference(ctTypeMock, false);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference23() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeReference()).thenReturn(((CtTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        when(factoryMock.Package()).thenReturn(((PackageFactory) null));
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        
        typeFactory.createReference(ctTypeMock, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference24() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeReference()).thenReturn(((CtTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        when(ctTypeMock.getPackage()).thenReturn(((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        typeFactory.createReference(ctTypeMock, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference25() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        when(ctTypeMock.getPackage()).thenReturn(((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        when(ctTypeMock.getFormalCtTypeParameters()).thenReturn(((List) null));
        
        typeFactory.createReference(ctTypeMock, true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference26() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeReference()).thenReturn(((CtTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        
        typeFactory.createReference(ctTypeMock, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference27() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        when(ctTypeMock.getFormalCtTypeParameters()).thenReturn(((List) null));
        
        typeFactory.createReference(ctTypeMock, true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReference28() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createReference(((CtType) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference29() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        when(ctTypeMock.getPackage()).thenReturn(((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtTypeReference actual = typeFactory.createReference(ctTypeMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference30() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtTypeReference actual = typeFactory.createReference(ctTypeMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateReference31() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setDeclaringType(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null), ((CtReference) null));
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock, ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        CtType ctTypeMock1 = mock(CtType.class);
        when(ctTypeMock1.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock1.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        when(ctTypeMock1.getSimpleName()).thenReturn(((String) null));
        when(ctTypeMock.getDeclaringType()).thenReturn(ctTypeMock1, ctTypeMock1);
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtTypeReference actual = typeFactory.createReference(ctTypeMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
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
    
    @Test(timeout = 10000)
    public void testBooleanType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "BOOLEAN", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.booleanType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testShortType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "SHORT", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.shortType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testDoubleType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "DOUBLE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.doubleType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testNullType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "NULL_TYPE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.nullType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testFloatType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "FLOAT", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.floatType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testByteType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "BYTE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.byteType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testLongType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "LONG", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.longType();
        
        assertNull(actual);
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasPackage4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000.");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasPackageMethod = typeFactoryClazz.getDeclaredMethod("hasPackage", stringType);
        hasPackageMethod.setAccessible(true);
        java.lang.Object[] hasPackageMethodArguments = new java.lang.Object[1];
        hasPackageMethodArguments[0] = string;
        int actual = ((int) hasPackageMethod.invoke(typeFactory, hasPackageMethodArguments));
        
        assertEquals(10, actual);
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
    
    @Test(timeout = 10000)
    public void testVoidPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "VOID_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.voidPrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testBooleanPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "BOOLEAN_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.booleanPrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testBytePrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "BYTE_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.bytePrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testVoidType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "VOID", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.voidType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testStringType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "STRING", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.stringType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testCharacterType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "CHARACTER", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.characterType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testCharacterPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        CtTypeReference ctTypeReferenceMock1 = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(ctTypeReferenceMock1);
        setField(typeFactory, "CHARACTER_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.characterPrimitiveType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock1, actual));
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
    
    @Test(timeout = 10000)
    public void testIntegerType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        CtTypeReference ctTypeReferenceMock1 = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(ctTypeReferenceMock1);
        setField(typeFactory, "INTEGER", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.integerType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock1, actual));
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
    
    @Test(timeout = 10000)
    public void testIntegerPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        CtTypeReference ctTypeReferenceMock1 = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(ctTypeReferenceMock1);
        setField(typeFactory, "INTEGER_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.integerPrimitiveType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock1, actual));
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
    
    @Test(timeout = 10000)
    public void testLongPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        CtTypeReference ctTypeReferenceMock1 = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(ctTypeReferenceMock1);
        setField(typeFactory, "LONG_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.longPrimitiveType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock1, actual));
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
    
    @Test(timeout = 10000)
    public void testFloatPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "FLOAT_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.floatPrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testDoublePrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "DOUBLE_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.doublePrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testShortPrimitiveType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "SHORT_PRIMITIVE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.shortPrimitiveType();
        
        assertNull(actual);
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
    
    @Test(timeout = 10000)
    public void testDateType2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.clone()).thenReturn(((CtTypeReference) null));
        setField(typeFactory, "DATE", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.dateType();
        
        assertNull(actual);
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
    public void testCreateArrayReference2() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(((CtTypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        
        typeFactory.createArrayReference(ctTypeReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(((CtArrayTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(((CtTypeReference) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(((CtTypeReference) null));
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference6() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createArrayReference(((CtType) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtType ctTypeMock = mock(CtType.class);
        
        typeFactory.createArrayReference(ctTypeMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(((CtType) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference9() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(((CtArrayTypeReference) null));
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        typeFactory.createArrayReference(ctTypeMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference10() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.createReference(org.mockito.ArgumentMatchers.any(CtPackage.class))).thenReturn(((CtPackageReference) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctTypeMock.getPackage()).thenReturn(ctPackageMock, ((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(ctTypeMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference11() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getDeclaringType()).thenReturn(((CtType) null));
        when(ctTypeMock.getPackage()).thenReturn(((CtPackage) null));
        when(ctTypeMock.getSimpleName()).thenReturn(((String) null));
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(ctTypeMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceMock, actual));
    }
    ///endregion
    
    
    ///region Errors report for createArrayReference
    
    public void testCreateArrayReference_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
    }
    ///endregion
    
    
    ///region Errors report for createArrayReference
    
    public void testCreateArrayReference_errors2()
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
    public void testCreateArrayReference14() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("");
        
        typeFactory.createArrayReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference15() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(((String) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference16() throws Throwable  {
        TypeFactory typeFactory = new TypeFactory();
        
        typeFactory.createArrayReference(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference17() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(null, 1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference18() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, ((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(null, 2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateArrayReference19() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null), ((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock, ctArrayTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtArrayTypeReference actual = typeFactory.createArrayReference(null, 2);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctArrayTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayReference20() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtArrayTypeReference ctArrayTypeReferenceMock = mock(CtArrayTypeReference.class);
        when(ctArrayTypeReferenceMock.setComponentType(any())).thenReturn(((CtArrayTypeReference) null));
        when(coreFactoryMock.createArrayTypeReference()).thenReturn(ctArrayTypeReferenceMock, ((CtArrayTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock, coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createArrayReference(null, 2);
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
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        
        typeFactory.createWildcardStaticTypeMemberReference(ctTypeReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createWildcardStaticTypeMemberReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(coreFactoryMock.createWildcardStaticTypeMemberReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createWildcardStaticTypeMemberReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createWildcardStaticTypeMemberReference()).thenReturn(((CtTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createWildcardStaticTypeMemberReference(null);
    }
    ///endregion
    
    
    ///region Errors report for createWildcardStaticTypeMemberReference
    
    public void testCreateWildcardStaticTypeMemberReference_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.getDeclaringType()).thenReturn(((CtTypeReference) null));
        CtPackageReference ctPackageReferenceMock = mock(CtPackageReference.class);
        when(ctTypeReferenceMock.getPackage()).thenReturn(ctPackageReferenceMock, ((CtPackageReference) null));
        when(coreFactoryMock.createWildcardStaticTypeMemberReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createWildcardStaticTypeMemberReference(ctTypeReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateWildcardStaticTypeMemberReference8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.getDeclaringType()).thenReturn(((CtTypeReference) null));
        CtPackageReference ctPackageReferenceMock = mock(CtPackageReference.class);
        when(ctPackageReferenceMock.clone()).thenReturn(((CtPackageReference) null));
        when(ctTypeReferenceMock.getPackage()).thenReturn(ctPackageReferenceMock, ctPackageReferenceMock);
        when(ctTypeReferenceMock.getSimpleName()).thenReturn(((String) null));
        when(ctTypeReferenceMock.setPackage(any())).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createWildcardStaticTypeMemberReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtTypeReference actual = typeFactory.createWildcardStaticTypeMemberReference(ctTypeReferenceMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateWildcardStaticTypeMemberReference9() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        when(ctTypeReferenceMock.getDeclaringType()).thenReturn(((CtTypeReference) null));
        when(ctTypeReferenceMock.getPackage()).thenReturn(((CtPackageReference) null));
        when(ctTypeReferenceMock.getSimpleName()).thenReturn(((String) null));
        when(ctTypeReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createWildcardStaticTypeMemberReference()).thenReturn(ctTypeReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtTypeReference actual = typeFactory.createWildcardStaticTypeMemberReference(ctTypeReferenceMock);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
    }
    ///endregion
    
    
    ///region Errors report for createWildcardStaticTypeMemberReference
    
    public void testCreateWildcardStaticTypeMemberReference_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // <Throwable with empty message>
        // 
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
        CtType ctTypeMock = mock(CtType.class);
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class listType = Class.forName("java.util.List");
        Class ctTypeMockType = Class.forName("spoon.reflect.declaration.CtType");
        Method addNestedTypeMethod = typeFactoryClazz.getDeclaredMethod("addNestedType", listType, ctTypeMockType);
        addNestedTypeMethod.setAccessible(true);
        java.lang.Object[] addNestedTypeMethodArguments = new java.lang.Object[2];
        addNestedTypeMethodArguments[0] = null;
        addNestedTypeMethodArguments[1] = ctTypeMock;
        try {
            addNestedTypeMethod.invoke(typeFactory, addNestedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddNestedType3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
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
    public void testAddNestedType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        CtType ctTypeMock = mock(CtType.class);
        when(ctTypeMock.getNestedTypes()).thenReturn(((Set) null));
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class arrayListType = Class.forName("java.util.List");
        Class ctTypeMockType = Class.forName("spoon.reflect.declaration.CtType");
        Method addNestedTypeMethod = typeFactoryClazz.getDeclaredMethod("addNestedType", arrayListType, ctTypeMockType);
        addNestedTypeMethod.setAccessible(true);
        java.lang.Object[] addNestedTypeMethodArguments = new java.lang.Object[2];
        addNestedTypeMethodArguments[0] = arrayList;
        addNestedTypeMethodArguments[1] = ctTypeMock;
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
        
        List actual = typeFactory.createReferences(arrayList);
        
        ArrayList expected = new ArrayList();
        
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasInnerType4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000$");
        
        Class typeFactoryClazz = Class.forName("spoon.reflect.factory.TypeFactory");
        Class stringType = Class.forName("java.lang.String");
        Method hasInnerTypeMethod = typeFactoryClazz.getDeclaredMethod("hasInnerType", stringType);
        hasInnerTypeMethod.setAccessible(true);
        java.lang.Object[] hasInnerTypeMethodArguments = new java.lang.Object[1];
        hasInnerTypeMethodArguments[0] = string;
        int actual = ((int) hasInnerTypeMethod.invoke(typeFactory, hasInnerTypeMethodArguments));
        
        assertEquals(10, actual);
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
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createTypeParameterReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeParameterReference3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("");
        
        typeFactory.createTypeParameterReference(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeParameterReference4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(((CtTypeParameterReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createTypeParameterReference(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateTypeParameterReference5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtTypeParameterReference ctTypeParameterReferenceMock = mock(CtTypeParameterReference.class);
        when(ctTypeParameterReferenceMock.setSimpleName(anyString())).thenReturn(((CtReference) null));
        when(coreFactoryMock.createTypeParameterReference()).thenReturn(ctTypeParameterReferenceMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        CtTypeParameterReference actual = typeFactory.createTypeParameterReference(null);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeParameterReferenceMock, actual));
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
    
    @Test(timeout = 10000)
    public void testCreateTypeAdapter3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        CtFormalTypeDeclarer ctFormalTypeDeclarerMock = mock(CtFormalTypeDeclarer.class);
        
        GenericTypeAdapter actual = typeFactory.createTypeAdapter(ctFormalTypeDeclarerMock);
        
        assertNull(actual);
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
        ArrayList arrayList = new ArrayList();
        
        typeFactory.createIntersectionTypeReferenceWithBounds(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createIntersectionTypeReferenceWithBounds(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createIntersectionTypeReference()).thenReturn(((spoon.reflect.reference.CtIntersectionTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createIntersectionTypeReferenceWithBounds(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createIntersectionTypeReference()).thenReturn(((spoon.reflect.reference.CtIntersectionTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        ArrayList arrayList = new ArrayList();
        
        typeFactory.createIntersectionTypeReferenceWithBounds(arrayList);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReferenceWithBounds6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createIntersectionTypeReference()).thenReturn(((spoon.reflect.reference.CtIntersectionTypeReference) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        typeFactory.createIntersectionTypeReferenceWithBounds(arrayList);
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
        CtTypeReference ctTypeReferenceMock = mock(CtTypeReference.class);
        setField(typeFactory, "OBJECT", ctTypeReferenceMock);
        
        CtTypeReference actual = typeFactory.getDefaultBoundingType();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeReferenceMock, actual));
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
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Core()).thenReturn(((CoreFactory) null));
        typeFactory.factory = factoryMock;
        
        typeFactory.createImport(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport3() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        CtReference ctReferenceMock = mock(CtReference.class);
        
        typeFactory.createImport(ctReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createImport()).thenReturn(((CtImport) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        
        typeFactory.createImport(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        when(coreFactoryMock.createImport()).thenReturn(((CtImport) null));
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtReference ctReferenceMock = mock(CtReference.class);
        when(ctReferenceMock.clone()).thenReturn(((CtReference) null));
        
        typeFactory.createImport(ctReferenceMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateImport6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        CoreFactory coreFactoryMock = mock(CoreFactory.class);
        CtImport ctImportMock = mock(CtImport.class);
        when(ctImportMock.setReference(any())).thenReturn(((CtImport) null));
        when(coreFactoryMock.createImport()).thenReturn(ctImportMock);
        when(factoryMock.Core()).thenReturn(coreFactoryMock);
        typeFactory.factory = factoryMock;
        CtReference ctReferenceMock = mock(CtReference.class);
        when(ctReferenceMock.clone()).thenReturn(((CtReference) null));
        
        CtImport actual = typeFactory.createImport(ctReferenceMock);
        
        assertNull(actual);
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
        setField(typeFactory, "factory", null);
        String string = new String("");
        
        typeFactory.get(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet4() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Package()).thenReturn(((PackageFactory) null));
        typeFactory.factory = factoryMock;
        String string = new String("");
        
        typeFactory.get(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet5() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String(".");
        
        typeFactory.get(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet6() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        setField(typeFactory, "factory", null);
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000.");
        
        typeFactory.get(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet7() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        CtType ctTypeMock = mock(CtType.class);
        when(ctPackageMock.getType(anyString())).thenReturn(ctTypeMock);
        when(packageFactoryMock.getRootPackage()).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        String string = new String(".");
        
        CtType actual = typeFactory.get(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet8() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.Package()).thenReturn(((PackageFactory) null));
        typeFactory.factory = factoryMock;
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000.");
        
        typeFactory.get(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet9() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        CtType ctTypeMock = mock(CtType.class);
        when(ctPackageMock.getType(anyString())).thenReturn(ctTypeMock);
        when(packageFactoryMock.get(anyString())).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000.");
        
        CtType actual = typeFactory.get(string);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet10() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        when(packageFactoryMock.getRootPackage()).thenReturn(((CtPackage) null));
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        String string = new String("$");
        
        CtType actual = typeFactory.get(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet11() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(ctPackageMock.getType(anyString())).thenReturn(((CtType) null));
        when(packageFactoryMock.getRootPackage()).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        String string = new String(".");
        
        CtType actual = typeFactory.get(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet12() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        
        typeFactory.get(((Class) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet13() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        CtType ctTypeMock = mock(CtType.class);
        when(ctPackageMock.getType(anyString())).thenReturn(ctTypeMock);
        when(packageFactoryMock.getRootPackage()).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        Class class1 = Object.class;
        
        CtType actual = typeFactory.get(class1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGet14() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        CtType ctTypeMock = mock(CtType.class);
        when(ctPackageMock.getType(anyString())).thenReturn(ctTypeMock);
        when(packageFactoryMock.getRootPackage()).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
        Class class1 = Object.class;
        
        CtType actual = typeFactory.get(class1);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(ctTypeMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGet15() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("spoon.reflect.factory.TypeFactory"));
        Factory factoryMock = mock(Factory.class);
        PackageFactory packageFactoryMock = mock(PackageFactory.class);
        CtPackage ctPackageMock = mock(CtPackage.class);
        when(packageFactoryMock.get(anyString())).thenReturn(ctPackageMock);
        setField(packageFactoryMock, "factory", null);
        when(factoryMock.Package()).thenReturn(packageFactoryMock);
        typeFactory.factory = factoryMock;
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
        String string = new String("\u0000");
        
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
        String string = new String("$");
        
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
    public void testGetSimpleName4() throws Throwable  {
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
        String string = new String(".");
        
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testTypeFactory1() {
        new TypeFactory(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testTypeFactory2() {
        TypeFactory actual = new TypeFactory();
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
