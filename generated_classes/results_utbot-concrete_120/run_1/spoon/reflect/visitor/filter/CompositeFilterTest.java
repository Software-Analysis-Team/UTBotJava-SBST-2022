package spoon.reflect.visitor.filter;

import org.junit.Test;
import spoon.reflect.visitor.Filter;
import spoon.support.reflect.declaration.CtEnumValueImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.declaration.CtClassImpl;
import spoon.support.reflect.reference.CtFieldReferenceImpl;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtSuperAccessImpl;
import spoon.reflect.factory.FactoryImpl;
import java.lang.reflect.Method;
import spoon.support.reflect.code.CtArrayReadImpl;
import spoon.reflect.factory.ModuleFactory.CtUnnamedModule;
import spoon.reflect.factory.ModuleFactory;
import spoon.support.reflect.declaration.CtEnumImpl;
import spoon.reflect.factory.AnnotationFactory;
import spoon.reflect.factory.PackageFactory;
import spoon.reflect.CtModelImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import sun.misc.Unsafe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class CompositeFilterTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches1() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches2() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        setField(compositeFilter, "operator", null);
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches3() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches4() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.SUBSTRACTION;
        compositeFilter.operator = filteringOperator;
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches5() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        setField(compositeFilter, "filters", null);
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches6() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.SUBSTRACTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
        compositeFilter.filters = filterArray;
        
        boolean actual = compositeFilter.matches(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches7() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
        compositeFilter.filters = filterArray;
        
        boolean actual = compositeFilter.matches(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches8() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
        compositeFilter.filters = filterArray;
        
        boolean actual = compositeFilter.matches(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches9() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.SUBSTRACTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        compositeFilter.filters = filterArray;
        
        Filter initialCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(null);
        
        Filter finalCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters0);
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches10() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        compositeFilter.filters = filterArray;
        
        Filter initialCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(null);
        
        Filter finalCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters0);
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches11() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        compositeFilter.filters = filterArray;
        
        Filter initialCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(null);
        
        Filter finalCompositeFilterFilters0 = compositeFilter.filters[0];
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters0);
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches12() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtEnumValueImpl ctEnumValueImpl = ((CtEnumValueImpl) createInstance("spoon.support.reflect.declaration.CtEnumValueImpl"));
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        boolean actual = compositeFilter.matches(ctEnumValueImpl);
        
        assertFalse(actual);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches13() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[1];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtConstructorCallImpl ctConstructorCallImpl = ((CtConstructorCallImpl) createInstance("spoon.support.reflect.code.CtConstructorCallImpl"));
        
        boolean actual = compositeFilter.matches(ctConstructorCallImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches14() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[20];
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        filterArray[0] = ((Filter) annotationFilter);
        compositeFilter.filters = filterArray;
        CtClassImpl ctClassImpl = ((CtClassImpl) createInstance("spoon.support.reflect.declaration.CtClassImpl"));
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        Filter initialCompositeFilterFilters9 = compositeFilter.filters[9];
        Filter initialCompositeFilterFilters10 = compositeFilter.filters[10];
        Filter initialCompositeFilterFilters11 = compositeFilter.filters[11];
        Filter initialCompositeFilterFilters12 = compositeFilter.filters[12];
        Filter initialCompositeFilterFilters13 = compositeFilter.filters[13];
        Filter initialCompositeFilterFilters14 = compositeFilter.filters[14];
        Filter initialCompositeFilterFilters15 = compositeFilter.filters[15];
        Filter initialCompositeFilterFilters16 = compositeFilter.filters[16];
        Filter initialCompositeFilterFilters17 = compositeFilter.filters[17];
        Filter initialCompositeFilterFilters18 = compositeFilter.filters[18];
        Filter initialCompositeFilterFilters19 = compositeFilter.filters[19];
        
        compositeFilter.matches(ctClassImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        Filter finalCompositeFilterFilters9 = compositeFilter.filters[9];
        Filter finalCompositeFilterFilters10 = compositeFilter.filters[10];
        Filter finalCompositeFilterFilters11 = compositeFilter.filters[11];
        Filter finalCompositeFilterFilters12 = compositeFilter.filters[12];
        Filter finalCompositeFilterFilters13 = compositeFilter.filters[13];
        Filter finalCompositeFilterFilters14 = compositeFilter.filters[14];
        Filter finalCompositeFilterFilters15 = compositeFilter.filters[15];
        Filter finalCompositeFilterFilters16 = compositeFilter.filters[16];
        Filter finalCompositeFilterFilters17 = compositeFilter.filters[17];
        Filter finalCompositeFilterFilters18 = compositeFilter.filters[18];
        Filter finalCompositeFilterFilters19 = compositeFilter.filters[19];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
        
        assertNull(finalCompositeFilterFilters9);
        
        assertNull(finalCompositeFilterFilters10);
        
        assertNull(finalCompositeFilterFilters11);
        
        assertNull(finalCompositeFilterFilters12);
        
        assertNull(finalCompositeFilterFilters13);
        
        assertNull(finalCompositeFilterFilters14);
        
        assertNull(finalCompositeFilterFilters15);
        
        assertNull(finalCompositeFilterFilters16);
        
        assertNull(finalCompositeFilterFilters17);
        
        assertNull(finalCompositeFilterFilters18);
        
        assertNull(finalCompositeFilterFilters19);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches15() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.SUBSTRACTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(fieldAccessFilter, "variable", ctFieldReferenceImpl);
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtFieldReadImpl ctFieldReadImpl = ((CtFieldReadImpl) createInstance("spoon.support.reflect.code.CtFieldReadImpl"));
        setField(ctFieldReadImpl, "variable", ctFieldReferenceImpl);
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(ctFieldReadImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches16() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(fieldAccessFilter, "variable", ctFieldReferenceImpl);
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtSuperAccessImpl ctSuperAccessImpl = ((CtSuperAccessImpl) createInstance("spoon.support.reflect.code.CtSuperAccessImpl"));
        CtFieldReferenceImpl ctFieldReferenceImpl1 = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(ctSuperAccessImpl, "variable", ctFieldReferenceImpl1);
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(ctSuperAccessImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches17() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.INTERSECTION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[10];
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        setField(annotationFilter, "annotationType", class1);
        filterArray[0] = ((Filter) annotationFilter);
        compositeFilter.filters = filterArray;
        CtEnumValueImpl ctEnumValueImpl = ((CtEnumValueImpl) createInstance("spoon.support.reflect.declaration.CtEnumValueImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "annotation", null);
        setField(ctEnumValueImpl, "factory", factoryImpl);
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        Filter initialCompositeFilterFilters9 = compositeFilter.filters[9];
        
        compositeFilter.matches(ctEnumValueImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        Filter finalCompositeFilterFilters9 = compositeFilter.filters[9];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
        
        assertNull(finalCompositeFilterFilters9);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches18() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtFieldReadImpl ctFieldReadImpl = ((CtFieldReadImpl) createInstance("spoon.support.reflect.code.CtFieldReadImpl"));
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(ctFieldReadImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches19() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FilteringOperator filteringOperator = FilteringOperator.UNION;
        compositeFilter.operator = filteringOperator;
        spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        filterArray[0] = ((Filter) fieldAccessFilter);
        compositeFilter.filters = filterArray;
        CtSuperAccessImpl ctSuperAccessImpl = ((CtSuperAccessImpl) createInstance("spoon.support.reflect.code.CtSuperAccessImpl"));
        
        Filter initialCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter initialCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter initialCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter initialCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter initialCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter initialCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter initialCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter initialCompositeFilterFilters8 = compositeFilter.filters[8];
        
        compositeFilter.matches(ctSuperAccessImpl);
        
        Filter finalCompositeFilterFilters1 = compositeFilter.filters[1];
        Filter finalCompositeFilterFilters2 = compositeFilter.filters[2];
        Filter finalCompositeFilterFilters3 = compositeFilter.filters[3];
        Filter finalCompositeFilterFilters4 = compositeFilter.filters[4];
        Filter finalCompositeFilterFilters5 = compositeFilter.filters[5];
        Filter finalCompositeFilterFilters6 = compositeFilter.filters[6];
        Filter finalCompositeFilterFilters7 = compositeFilter.filters[7];
        Filter finalCompositeFilterFilters8 = compositeFilter.filters[8];
        
        assertNull(finalCompositeFilterFilters1);
        
        assertNull(finalCompositeFilterFilters2);
        
        assertNull(finalCompositeFilterFilters3);
        
        assertNull(finalCompositeFilterFilters4);
        
        assertNull(finalCompositeFilterFilters5);
        
        assertNull(finalCompositeFilterFilters6);
        
        assertNull(finalCompositeFilterFilters7);
        
        assertNull(finalCompositeFilterFilters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType1() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class actual = compositeFilter.getType();
        
        Class expected = spoon.reflect.declaration.CtElement.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType2() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class actual = compositeFilter.getType();
        
        Class expected = spoon.reflect.declaration.CtElement.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch1() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class filterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", filterType, ctElementType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = null;
        hasMatchMethodArguments[1] = null;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch2() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class filterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", filterType, ctElementType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = null;
        hasMatchMethodArguments[1] = null;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasMatch3() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        FieldAccessFilter fieldAccessFilter = ((FieldAccessFilter) createInstance("spoon.reflect.visitor.filter.FieldAccessFilter"));
        CtArrayReadImpl ctArrayReadImpl = ((CtArrayReadImpl) createInstance("spoon.support.reflect.code.CtArrayReadImpl"));
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class fieldAccessFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctArrayReadImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", fieldAccessFilterType, ctArrayReadImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = fieldAccessFilter;
        hasMatchMethodArguments[1] = ctArrayReadImpl;
        boolean actual = ((boolean) hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHasMatch4() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        VariableAccessFilter variableAccessFilter = ((VariableAccessFilter) createInstance("spoon.reflect.visitor.filter.VariableAccessFilter"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(variableAccessFilter, "variable", ctFieldReferenceImpl);
        CtFieldReadImpl ctFieldReadImpl = ((CtFieldReadImpl) createInstance("spoon.support.reflect.code.CtFieldReadImpl"));
        setField(ctFieldReadImpl, "variable", ctFieldReferenceImpl);
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class variableAccessFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctFieldReadImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", variableAccessFilterType, ctFieldReadImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = variableAccessFilter;
        hasMatchMethodArguments[1] = ctFieldReadImpl;
        boolean actual = ((boolean) hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch5() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        ModuleFactory.CtUnnamedModule ctUnnamedModule = ((ModuleFactory.CtUnnamedModule) createInstance("spoon.reflect.factory.ModuleFactory$CtUnnamedModule"));
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class annotationFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctUnnamedModuleType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", annotationFilterType, ctUnnamedModuleType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = annotationFilter;
        hasMatchMethodArguments[1] = ctUnnamedModule;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch6() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        setField(annotationFilter, "annotationType", class1);
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "packageF", null);
        AnnotationFactory annotationFactory = ((AnnotationFactory) createInstance("spoon.reflect.factory.AnnotationFactory"));
        setField(annotationFactory, "factory", factoryImpl);
        setField(factoryImpl, "annotation", annotationFactory);
        setField(ctEnumImpl, "factory", factoryImpl);
        
        Object ctEnumImplFactory = getFieldValue(ctEnumImpl, "factory");
        Object initialCtEnumImplFactoryPackageF = getFieldValue(ctEnumImplFactory, "packageF");
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class annotationFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctEnumImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", annotationFilterType, ctEnumImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = annotationFilter;
        hasMatchMethodArguments[1] = ctEnumImpl;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object ctEnumImplFactory1 = getFieldValue(ctEnumImpl, "factory");
        Object finalCtEnumImplFactoryPackageF = getFieldValue(ctEnumImplFactory1, "packageF");
        
        assertFalse(initialCtEnumImplFactoryPackageF == finalCtEnumImplFactoryPackageF);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch7() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        VariableAccessFilter variableAccessFilter = ((VariableAccessFilter) createInstance("spoon.reflect.visitor.filter.VariableAccessFilter"));
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(variableAccessFilter, "variable", ctFieldReferenceImpl);
        CtFieldReadImpl ctFieldReadImpl = ((CtFieldReadImpl) createInstance("spoon.support.reflect.code.CtFieldReadImpl"));
        CtFieldReferenceImpl ctFieldReferenceImpl1 = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        setField(ctFieldReadImpl, "variable", ctFieldReferenceImpl1);
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class variableAccessFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctFieldReadImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", variableAccessFilterType, ctFieldReadImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = variableAccessFilter;
        hasMatchMethodArguments[1] = ctFieldReadImpl;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch8() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        setField(annotationFilter, "annotationType", class1);
        CtFieldReferenceImpl ctFieldReferenceImpl = ((CtFieldReferenceImpl) createInstance("spoon.support.reflect.reference.CtFieldReferenceImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "model", null);
        PackageFactory packageFactory = ((PackageFactory) createInstance("spoon.reflect.factory.PackageFactory"));
        FactoryImpl factoryImpl1 = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        CtModelImpl ctModelImpl = ((CtModelImpl) createInstance("spoon.reflect.CtModelImpl"));
        setField(factoryImpl1, "model", ctModelImpl);
        setField(factoryImpl1, "packageF", null);
        setField(factoryImpl1, "annotation", null);
        setField(packageFactory, "factory", factoryImpl1);
        setField(factoryImpl, "packageF", packageFactory);
        AnnotationFactory annotationFactory = ((AnnotationFactory) createInstance("spoon.reflect.factory.AnnotationFactory"));
        setField(annotationFactory, "factory", factoryImpl);
        setField(factoryImpl, "annotation", annotationFactory);
        setField(ctFieldReferenceImpl, "factory", factoryImpl);
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class annotationFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctFieldReferenceImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", annotationFilterType, ctFieldReferenceImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = annotationFilter;
        hasMatchMethodArguments[1] = ctFieldReferenceImpl;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch9() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
        Class class1 = Object.class;
        setField(annotationFilter, "type", class1);
        setField(annotationFilter, "annotationType", null);
        CtEnumImpl ctEnumImpl = ((CtEnumImpl) createInstance("spoon.support.reflect.declaration.CtEnumImpl"));
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "annotation", null);
        setField(ctEnumImpl, "factory", factoryImpl);
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class annotationFilterType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctEnumImplType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", annotationFilterType, ctEnumImplType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = annotationFilter;
        hasMatchMethodArguments[1] = ctEnumImpl;
        try {
            hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCompositeFilter1() {
        CompositeFilter actual = new CompositeFilter(null, null);
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
