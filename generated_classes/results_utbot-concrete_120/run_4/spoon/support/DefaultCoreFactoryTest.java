package spoon.support;

import org.junit.Test;
import spoon.reflect.factory.Factory;
import spoon.reflect.cu.SourcePosition;
import spoon.support.reflect.cu.position.SourcePositionImpl;
import spoon.support.reflect.cu.CompilationUnitImpl;
import spoon.support.reflect.cu.position.PartialSourcePositionImpl;
import spoon.reflect.cu.position.CompoundSourcePosition;
import spoon.support.reflect.cu.position.CompoundSourcePositionImpl;
import spoon.reflect.cu.position.DeclarationSourcePosition;
import spoon.support.reflect.cu.position.DeclarationSourcePositionImpl;
import spoon.reflect.cu.CompilationUnit;
import java.util.ArrayList;
import java.util.HashSet;
import spoon.reflect.declaration.CtElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class DefaultCoreFactoryTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateThisAccess1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createThisAccess();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardStaticTypeMemberReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createWildcardStaticTypeMemberReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateModule1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createModule();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateModuleReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createModuleReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateModuleRequirement1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createModuleRequirement();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePackageExport1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createPackageExport();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateProvidedService1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createProvidedService();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateUsedService1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createUsedService();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCatch1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCatch();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeParameter1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTypeParameter();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateConditional1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createConditional();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateConstructor1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createConstructor();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateInvisibleArrayConstructor1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createInvisibleArrayConstructor();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateContinue1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createContinue();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDo1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createDo();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateEnum1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createEnum();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateExecutableReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createExecutableReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateField1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createField();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateEnumValue1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createEnumValue();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldRead1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createFieldRead();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldWrite1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createFieldWrite();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAnnotationFieldAccess1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAnnotationFieldAccess();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateUnboundVariableReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createUnboundVariableReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFieldReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createFieldReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateFor1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createFor();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateForEach1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createForEach();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIf1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createIf();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateInterface1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createInterface();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateInvocation1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createInvocation();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateLiteral1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createLiteral();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateLocalVariable1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createLocalVariable();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateLocalVariableReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createLocalVariableReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCatchVariable1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCatchVariable();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCatchVariableReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCatchVariableReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateMethod1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createMethod();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAnnotationMethod1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAnnotationMethod();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateNewArray1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createNewArray();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateConstructorCall1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createConstructorCall();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateNewClass1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createNewClass();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateLambda1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createLambda();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateExecutableReferenceExpression1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createExecutableReferenceExpression();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateOperatorAssignment1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createOperatorAssignment();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePackage1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createPackage();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePackageReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createPackageReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateParameter1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createParameter();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateParameterReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createParameterReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateReturn1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createReturn();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateStatementList1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createStatementList();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSwitch1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createSwitch();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSynchronized1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createSynchronized();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateThrow1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createThrow();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTry1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTry();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTryWithResource1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTryWithResource();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeParameterReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTypeParameterReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWildcardReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createWildcardReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateIntersectionTypeReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createIntersectionTypeReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTypeReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateTypeAccess1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createTypeAccess();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateUnaryOperator1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createUnaryOperator();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateVariableRead1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createVariableRead();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateVariableWrite1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createVariableWrite();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCodeSnippetExpression1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCodeSnippetExpression();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCodeSnippetStatement1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCodeSnippetStatement();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaDoc1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createJavaDoc();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaDoc2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        defaultCoreFactory.createJavaDoc();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateJavaDocTag1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createJavaDocTag();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateWhile1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createWhile();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateImport1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createImport();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMainFactory1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        Factory actual = defaultCoreFactory.getMainFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetMainFactory2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        Factory actual = defaultCoreFactory.getMainFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetMainFactory1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.setMainFactory(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSetMainFactory2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        defaultCoreFactory.setMainFactory(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        SourcePosition actual = defaultCoreFactory.createSourcePosition(null, 0, 0, intArray);
        
        SourcePositionImpl expected = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createSourcePosition(compilationUnitImpl, 3, 1, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        SourcePosition actual = defaultCoreFactory.createSourcePosition(compilationUnitImpl, 0, 0, intArray);
        
        SourcePositionImpl expected = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePartialSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createPartialSourcePosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreatePartialSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        defaultCoreFactory.createPartialSourcePosition(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreatePartialSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        PartialSourcePositionImpl partialSourcePositionImpl = ((PartialSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.PartialSourcePositionImpl"));
        setField(compilationUnitImpl, "myPartialSourcePosition", partialSourcePositionImpl);
        
        SourcePosition actual = defaultCoreFactory.createPartialSourcePosition(compilationUnitImpl);
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(partialSourcePositionImpl, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreatePartialSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(compilationUnitImpl, "myPartialSourcePosition", null);
        
        Object initialCompilationUnitImplMyPartialSourcePosition = getFieldValue(compilationUnitImpl, "myPartialSourcePosition");
        
        SourcePosition actual = defaultCoreFactory.createPartialSourcePosition(compilationUnitImpl);
        
        PartialSourcePositionImpl expected = ((PartialSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.PartialSourcePositionImpl"));
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
        
        Object finalCompilationUnitImplMyPartialSourcePosition = getFieldValue(compilationUnitImpl, "myPartialSourcePosition");
        
        assertFalse(initialCompilationUnitImplMyPartialSourcePosition == finalCompilationUnitImplMyPartialSourcePosition);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompoundSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        CompoundSourcePosition actual = defaultCoreFactory.createCompoundSourcePosition(null, 0, 0, 0, 0, intArray);
        
        CompoundSourcePositionImpl expected = ((CompoundSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.CompoundSourcePositionImpl"));
        setField(expected, "declarationSourceStart", 0);
        setField(expected, "declarationSourceEnd", 0);
        setField(expected, "sourceStart", 0);
        setField(expected, "sourceEnd", 0);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCompoundSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCompoundSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, 0, Integer.MAX_VALUE, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCompoundSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, 3, 1, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCompoundSourcePosition5() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, 0, 0, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompoundSourcePosition6() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        CompoundSourcePosition actual = defaultCoreFactory.createCompoundSourcePosition(compilationUnitImpl, 536870912, 1073741822, 1, 1073741825, intArray);
        
        CompoundSourcePositionImpl expected = ((CompoundSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.CompoundSourcePositionImpl"));
        setField(expected, "declarationSourceStart", 1);
        setField(expected, "declarationSourceEnd", 1073741825);
        setField(expected, "sourceStart", 536870912);
        setField(expected, "sourceEnd", 1073741822);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        defaultCoreFactory.createDeclarationSourcePosition(null, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, Integer.MIN_VALUE, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 0, Integer.MAX_VALUE, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 3, 1, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition5() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 0, 0, 0, 0, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateDeclarationSourcePosition6() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 536870912, 1073741814, Integer.MIN_VALUE, 0, 1, 1073741825, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateDeclarationSourcePosition7() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        DeclarationSourcePosition actual = defaultCoreFactory.createDeclarationSourcePosition(compilationUnitImpl, 1073741824, 1073741823, 0, 1073741822, 0, 1073741824, intArray);
        
        DeclarationSourcePositionImpl expected = ((DeclarationSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.DeclarationSourcePositionImpl"));
        setField(expected, "modifierSourceEnd", 1073741822);
        setField(expected, "modifierSourceStart", 0);
        setField(expected, "declarationSourceStart", 0);
        setField(expected, "declarationSourceEnd", 1073741824);
        setField(expected, "sourceStart", 1073741824);
        setField(expected, "sourceEnd", 1073741823);
        setField(expected, "sourceStartline", -1);
        setField(expected, "lineSeparatorPositions", intArray);
        setField(expected, "compilationUnit", compilationUnitImpl);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        int[] intArray = new int[0];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, 0, 0, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition3() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition4() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(null, 3, 1, 0, 0, 0, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition5() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(compilationUnitImpl, 0, 0, 0, 0, Integer.MIN_VALUE, 0, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition6() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(compilationUnitImpl, 536870912, 1073741822, Integer.MIN_VALUE, 0, 1, 1073741825, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBodyHolderSourcePosition7() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        CompilationUnitImpl compilationUnitImpl = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        int[] intArray = new int[9];
        
        defaultCoreFactory.createBodyHolderSourcePosition(compilationUnitImpl, 1073741824, 1073741823, 1073741822, 1073741822, 536870911, 1073741824, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompilationUnit1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        CompilationUnit actual = defaultCoreFactory.createCompilationUnit();
        
        CompilationUnitImpl expected = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(expected, "factory", null);
        ArrayList arrayList = new ArrayList();
        setField(expected, "declaredTypes", arrayList);
        setField(expected, "ctPackage", null);
        HashSet hashSet = new HashSet();
        setField(expected, "imports", hashSet);
        setField(expected, "ctModule", null);
        setField(expected, "file", null);
        setField(expected, "originalSourceCode", null);
        setField(expected, "autoImport", true);
        setField(expected, "myPartialSourcePosition", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCreateCompilationUnit2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        setField(defaultCoreFactory, "factory", null);
        
        CompilationUnit actual = defaultCoreFactory.createCompilationUnit();
        
        CompilationUnitImpl expected = ((CompilationUnitImpl) createInstance("spoon.support.reflect.cu.CompilationUnitImpl"));
        setField(expected, "factory", null);
        ArrayList arrayList = new ArrayList();
        setField(expected, "declaredTypes", arrayList);
        setField(expected, "ctPackage", null);
        HashSet hashSet = new HashSet();
        setField(expected, "imports", hashSet);
        setField(expected, "ctModule", null);
        setField(expected, "file", null);
        setField(expected, "originalSourceCode", null);
        setField(expected, "autoImport", true);
        setField(expected, "myPartialSourcePosition", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSuperAccess1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createSuperAccess();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateClass1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createClass();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAnnotationType1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAnnotationType();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAnonymousExecutable1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAnonymousExecutable();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBinaryOperator1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createBinaryOperator();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBlock1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createBlock();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayTypeReference1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createArrayTypeReference();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateBreak1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createBreak();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateCase1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createCase();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAssignment1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAssignment();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAnnotation1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAnnotation();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateAssert1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createAssert();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayWrite1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createArrayWrite();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateArrayRead1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        defaultCoreFactory.createArrayRead();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClone1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = new DefaultCoreFactory();
        
        CtElement actual = defaultCoreFactory.clone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testClone2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        CtElement actual = defaultCoreFactory.clone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate1() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        
        defaultCoreFactory.create(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreate2() throws Throwable  {
        DefaultCoreFactory defaultCoreFactory = ((DefaultCoreFactory) createInstance("spoon.support.DefaultCoreFactory"));
        Class class1 = Object.class;
        
        defaultCoreFactory.create(class1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultCoreFactory1() {
        DefaultCoreFactory actual = new DefaultCoreFactory();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDefaultCoreFactory2() {
        DefaultCoreFactory actual = new DefaultCoreFactory();
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
