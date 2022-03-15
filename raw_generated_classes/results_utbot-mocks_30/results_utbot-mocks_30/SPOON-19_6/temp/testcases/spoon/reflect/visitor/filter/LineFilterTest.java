package spoon.reflect.visitor.filter;

import org.junit.Test;
import spoon.reflect.code.CtStatement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class LineFilterTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches1() throws Throwable  {
        LineFilter lineFilter = new LineFilter();
        
        lineFilter.matches(((CtStatement) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches2() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtStatement ctStatementMock = mock(CtStatement.class);
        
        boolean actual = lineFilter.matches(ctStatementMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches3() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtStatement ctStatementMock = mock(CtStatement.class);
        when(ctStatementMock.getParent()).thenReturn(((spoon.reflect.declaration.CtElement) null));
        
        boolean actual = lineFilter.matches(ctStatementMock);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLineFilter1() {
        LineFilter actual = new LineFilter();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLineFilter2() {
        LineFilter actual = new LineFilter();
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
