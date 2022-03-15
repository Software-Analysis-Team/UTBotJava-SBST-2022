package spoon.reflect.visitor.filter;

import org.junit.Test;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Filter;
import java.lang.reflect.Method;
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

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

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
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches3() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches4() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches5() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches6() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[39];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(8, 1, 0);
            compositeFilter.operator = filteringOperatorMock;
            CtElement ctElementMock = mock(CtElement.class);
            
            boolean actual = compositeFilter.matches(ctElementMock);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            setField(compositeFilter, "operator", null);
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0, Integer.MIN_VALUE);
            compositeFilter.operator = filteringOperatorMock;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            setField(compositeFilter, "filters", null);
            CtElement ctElementMock = mock(CtElement.class);
            
            compositeFilter.matches(ctElementMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0, 1073741824);
            compositeFilter.operator = filteringOperatorMock;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            setField(compositeFilter, "filters", null);
            CtElement ctElementMock = mock(CtElement.class);
            
            compositeFilter.matches(ctElementMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            setField(compositeFilter, "filters", null);
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertTrue(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[0];
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(false);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches18() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            compositeFilter.filters = filterArray;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches19() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        compositeFilter.matches(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches20() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[1];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertTrue(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches21() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches22() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
            filterArray[1] = ((Filter) annotationFilter);
            filterArray[2] = ((Filter) annotationFilter);
            filterArray[3] = ((Filter) annotationFilter);
            filterArray[4] = ((Filter) annotationFilter);
            filterArray[5] = ((Filter) annotationFilter);
            filterArray[6] = ((Filter) annotationFilter);
            filterArray[7] = ((Filter) annotationFilter);
            filterArray[8] = ((Filter) annotationFilter);
            compositeFilter.filters = filterArray;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches23() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true, true);
            filterArray[0] = filterMock;
            filterArray[1] = filterMock;
            compositeFilter.filters = filterArray;
            CtElement ctElementMock = mock(CtElement.class);
            
            boolean actual = compositeFilter.matches(ctElementMock);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches24() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertTrue(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMatches25() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            compositeFilter.filters = filterArray;
            
            compositeFilter.matches(null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches26() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[1];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(false);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches27() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[9];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(false);
            filterArray[0] = filterMock;
            AnnotationFilter annotationFilter = ((AnnotationFilter) createInstance("spoon.reflect.visitor.filter.AnnotationFilter"));
            filterArray[1] = ((Filter) annotationFilter);
            filterArray[2] = ((Filter) annotationFilter);
            filterArray[3] = ((Filter) annotationFilter);
            filterArray[4] = ((Filter) annotationFilter);
            filterArray[5] = ((Filter) annotationFilter);
            filterArray[6] = ((Filter) annotationFilter);
            filterArray[7] = ((Filter) annotationFilter);
            filterArray[8] = ((Filter) annotationFilter);
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches28() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[3];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 2, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[1];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true);
            filterArray[0] = filterMock;
            compositeFilter.filters = filterArray;
            
            boolean actual = compositeFilter.matches(null);
            
            assertTrue(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMatches29() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(FilteringOperator.class);
            spoon.reflect.visitor.filter.FilteringOperator[] filteringOperatorArray = new spoon.reflect.visitor.filter.FilteringOperator[1];
            mockedStatic.when(FilteringOperator::values).thenReturn(filteringOperatorArray);
            CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
            FilteringOperator filteringOperatorMock = mock(FilteringOperator.class);
            when(filteringOperatorMock.ordinal()).thenReturn(0, 0, 0);
            compositeFilter.operator = filteringOperatorMock;
            spoon.reflect.visitor.Filter[] filterArray = new spoon.reflect.visitor.Filter[2];
            Filter filterMock = mock(Filter.class);
            when(filterMock.matches(any())).thenReturn(true, false);
            filterArray[0] = filterMock;
            filterArray[1] = filterMock;
            compositeFilter.filters = filterArray;
            CtElement ctElementMock = mock(CtElement.class);
            
            boolean actual = compositeFilter.matches(ctElementMock);
            
            assertTrue(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType1() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class actual = compositeFilter.getType();
        
        Class expected = CtElement.class;
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetType2() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        
        Class actual = compositeFilter.getType();
        
        Class expected = CtElement.class;
        
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
    
    @Test(timeout = 10000)
    public void testHasMatch2() throws Throwable  {
        CompositeFilter compositeFilter = ((CompositeFilter) createInstance("spoon.reflect.visitor.filter.CompositeFilter"));
        Filter filterMock = mock(Filter.class);
        when(filterMock.matches(any())).thenReturn(false);
        
        Class compositeFilterClazz = Class.forName("spoon.reflect.visitor.filter.CompositeFilter");
        Class filterMockType = Class.forName("spoon.reflect.visitor.Filter");
        Class ctElementType = Class.forName("spoon.reflect.declaration.CtElement");
        Method hasMatchMethod = compositeFilterClazz.getDeclaredMethod("hasMatch", filterMockType, ctElementType);
        hasMatchMethod.setAccessible(true);
        java.lang.Object[] hasMatchMethodArguments = new java.lang.Object[2];
        hasMatchMethodArguments[0] = filterMock;
        hasMatchMethodArguments[1] = null;
        boolean actual = ((boolean) hasMatchMethod.invoke(compositeFilter, hasMatchMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHasMatch3() throws Throwable  {
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
