package spoon.reflect.visitor.filter;

import org.junit.Test;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.declaration.CtEnumImpl;
import spoon.support.reflect.reference.CtIntersectionTypeReferenceImpl;
import spoon.support.reflect.code.CtCommentImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtDoImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtJavaDocImpl;
import spoon.support.reflect.code.CtThrowImpl;
import spoon.support.reflect.code.CtOperatorAssignmentImpl;
import spoon.support.reflect.cu.position.BodyHolderSourcePositionImpl;
import spoon.support.reflect.code.CtTryImpl;
import spoon.support.reflect.code.CtBreakImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        
        boolean actual = lineFilter.matches(ctClassImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches3() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtBlockImpl ctBlockImpl = ((CtBlockImpl) createInstance("spoon.support.reflect.code.CtBlockImpl"));
        
        boolean actual = lineFilter.matches(ctBlockImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches4() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        CtBlockImpl ctBlockImpl = ((CtBlockImpl) createInstance("spoon.support.reflect.code.CtBlockImpl"));
        setField(ctBlockImpl, "parent", null);
        setField(ctClassImpl, "parent", ctBlockImpl);
        
        boolean actual = lineFilter.matches(ctClassImpl);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches5() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        CtIntersectionTypeReferenceImpl ctIntersectionTypeReferenceImpl = ((CtIntersectionTypeReferenceImpl) createInstance("spoon.support.reflect.reference.CtIntersectionTypeReferenceImpl"));
        setField(ctIntersectionTypeReferenceImpl, "parent", null);
        setField(ctEnumImpl, "parent", ctIntersectionTypeReferenceImpl);
        
        boolean actual = lineFilter.matches(ctEnumImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches6() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtCommentImpl ctCommentImpl = ((CtCommentImpl) createInstance("spoon.support.reflect.code.CtCommentImpl"));
        CtIfImpl ctIfImpl = ((CtIfImpl) createInstance("spoon.support.reflect.code.CtIfImpl"));
        setField(ctIfImpl, "parent", null);
        setField(ctIfImpl, "thenStatement", ctCommentImpl);
        setField(ctCommentImpl, "parent", ctIfImpl);
        
        boolean actual = lineFilter.matches(ctCommentImpl);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches7() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtCommentImpl ctCommentImpl = ((CtCommentImpl) createInstance("spoon.support.reflect.code.CtCommentImpl"));
        CtDoImpl ctDoImpl = ((CtDoImpl) createInstance("spoon.support.reflect.code.CtDoImpl"));
        setField(ctDoImpl, "parent", null);
        setField(ctDoImpl, "body", ctCommentImpl);
        setField(ctCommentImpl, "parent", ctDoImpl);
        
        boolean actual = lineFilter.matches(ctCommentImpl);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches8() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtLocalVariableImpl ctLocalVariableImpl = ((CtLocalVariableImpl) createInstance("spoon.support.reflect.code.CtLocalVariableImpl"));
        CtDoImpl ctDoImpl = ((CtDoImpl) createInstance("spoon.support.reflect.code.CtDoImpl"));
        setField(ctDoImpl, "parent", null);
        CtJavaDocImpl ctJavaDocImpl = ((CtJavaDocImpl) createInstance("spoon.support.reflect.code.CtJavaDocImpl"));
        setField(ctJavaDocImpl, "parent", null);
        setField(ctDoImpl, "body", ctJavaDocImpl);
        setField(ctLocalVariableImpl, "parent", ctDoImpl);
        
        boolean actual = lineFilter.matches(ctLocalVariableImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches9() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtCommentImpl ctCommentImpl = ((CtCommentImpl) createInstance("spoon.support.reflect.code.CtCommentImpl"));
        CtIfImpl ctIfImpl = ((CtIfImpl) createInstance("spoon.support.reflect.code.CtIfImpl"));
        setField(ctIfImpl, "parent", null);
        CtThrowImpl ctThrowImpl = ((CtThrowImpl) createInstance("spoon.support.reflect.code.CtThrowImpl"));
        setField(ctThrowImpl, "parent", null);
        setField(ctIfImpl, "thenStatement", ctThrowImpl);
        setField(ctIfImpl, "elseStatement", ctCommentImpl);
        setField(ctCommentImpl, "parent", ctIfImpl);
        
        boolean actual = lineFilter.matches(ctCommentImpl);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches10() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtOperatorAssignmentImpl ctOperatorAssignmentImpl = ((CtOperatorAssignmentImpl) createInstance("spoon.support.reflect.code.CtOperatorAssignmentImpl"));
        BodyHolderSourcePositionImpl bodyHolderSourcePositionImpl = ((BodyHolderSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.BodyHolderSourcePositionImpl"));
        setField(ctOperatorAssignmentImpl, "position", bodyHolderSourcePositionImpl);
        setField(ctOperatorAssignmentImpl, "parent", null);
        
        boolean actual = lineFilter.matches(ctOperatorAssignmentImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches11() throws Throwable  {
        LineFilter lineFilter = ((LineFilter) createInstance("spoon.reflect.visitor.filter.LineFilter"));
        Class class1 = Object.class;
        setField(lineFilter, "type", class1);
        CtTryImpl ctTryImpl = ((CtTryImpl) createInstance("spoon.support.reflect.code.CtTryImpl"));
        CtDoImpl ctDoImpl = ((CtDoImpl) createInstance("spoon.support.reflect.code.CtDoImpl"));
        setField(ctDoImpl, "parent", null);
        CtBreakImpl ctBreakImpl = ((CtBreakImpl) createInstance("spoon.support.reflect.code.CtBreakImpl"));
        setField(ctBreakImpl, "parent", null);
        setField(ctDoImpl, "body", ctBreakImpl);
        setField(ctTryImpl, "parent", ctDoImpl);
        
        boolean actual = lineFilter.matches(ctTryImpl);
        
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
