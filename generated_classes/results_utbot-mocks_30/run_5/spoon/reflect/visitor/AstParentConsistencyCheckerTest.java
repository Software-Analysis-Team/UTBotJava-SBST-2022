package spoon.reflect.visitor;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AstParentConsistencyCheckerTest {
    ///region
    
    @Test(timeout = 10000)
    public void testScan1() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = new AstParentConsistencyChecker();
        
        astParentConsistencyChecker.scan(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testScan2() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        
        astParentConsistencyChecker.scan(((CtElement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testScan3() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtElement ctElementMock = mock(CtElement.class);
        setField(astParentConsistencyChecker, "parent", ctElementMock);
        CtElement ctElementMock1 = mock(CtElement.class);
        when(ctElementMock1.isParentInitialized()).thenReturn(true);
        when(ctElementMock1.getParent()).thenReturn(((CtElement) null));
        
        astParentConsistencyChecker.scan(ctElementMock1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testScan4() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtElement ctElementMock = mock(CtElement.class);
        setField(astParentConsistencyChecker, "parent", ctElementMock);
        CtElement ctElementMock1 = mock(CtElement.class);
        when(ctElementMock1.isParentInitialized()).thenReturn(false);
        
        astParentConsistencyChecker.scan(ctElementMock1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testScan5() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        setField(astParentConsistencyChecker, "parent", null);
        CtElement ctElementMock = mock(CtElement.class);
        
        astParentConsistencyChecker.scan(ctElementMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testScan6() throws Throwable  {
        AstParentConsistencyChecker astParentConsistencyChecker = ((AstParentConsistencyChecker) createInstance("spoon.reflect.visitor.AstParentConsistencyChecker"));
        CtElement ctElementMock = mock(CtElement.class);
        setField(astParentConsistencyChecker, "parent", ctElementMock);
        CtElement ctElementMock1 = mock(CtElement.class);
        when(ctElementMock1.isParentInitialized()).thenReturn(true);
        when(ctElementMock1.getParent()).thenReturn(ctElementMock);
        
        astParentConsistencyChecker.scan(ctElementMock1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString1() throws Throwable  {
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctElementType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = null;
        try {
            toDebugStringMethod.invoke(null, toDebugStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToDebugString2() throws Throwable  {
        Class astParentConsistencyCheckerClazz = Class.forName("spoon.reflect.visitor.AstParentConsistencyChecker");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method toDebugStringMethod = astParentConsistencyCheckerClazz.getDeclaredMethod("toDebugString", ctElementType);
        toDebugStringMethod.setAccessible(true);
        java.lang.Object[] toDebugStringMethodArguments = new java.lang.Object[1];
        toDebugStringMethodArguments[0] = null;
        try {
            toDebugStringMethod.invoke(null, toDebugStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAstParentConsistencyChecker1() {
        AstParentConsistencyChecker actual = new AstParentConsistencyChecker();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAstParentConsistencyChecker2() {
        AstParentConsistencyChecker actual = new AstParentConsistencyChecker();
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
