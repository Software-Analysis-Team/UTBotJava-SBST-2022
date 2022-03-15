package com.google.common.math;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.common.math.LinearTransformation.LinearTransformationBuilder;
import com.google.common.math.LinearTransformation;
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

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.ArgumentMatchers.anyDouble;

public class PairedStatsAccumulatorTest {
    ///region
    
    @Test(timeout = 10000)
    public void testSnapshot1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        PairedStats actual = pairedStatsAccumulator.snapshot();
        
        PairedStats expected = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "count", 0L);
        setField(stats, "mean", 0.0);
        setField(stats, "sumOfSquaresOfDeltas", 0.0);
        setField(stats, "min", java.lang.Double.NaN);
        setField(stats, "max", java.lang.Double.NaN);
        setField(expected, "xStats", stats);
        Stats stats1 = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats1, "count", 0L);
        setField(stats1, "mean", 0.0);
        setField(stats1, "sumOfSquaresOfDeltas", 0.0);
        setField(stats1, "min", java.lang.Double.NaN);
        setField(stats1, "max", java.lang.Double.NaN);
        setField(expected, "yStats", stats1);
        setField(expected, "sumOfProductsOfDeltas", 0.0);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSnapshot2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        Stats statsMock = mock(Stats.class);
        when(statsAccumulatorMock.snapshot()).thenReturn(statsMock);
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
        Stats statsMock1 = mock(Stats.class);
        when(statsAccumulatorMock1.snapshot()).thenReturn(statsMock1);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
        
        PairedStats actual = pairedStatsAccumulator.snapshot();
        
        PairedStats expected = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        setField(expected, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        setField(expected, "yStats", statsMock);
        setField(expected, "xStats", statsMock1);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testYStats1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        Stats actual = pairedStatsAccumulator.yStats();
        
        Stats expected = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(expected, "count", 0L);
        setField(expected, "mean", 0.0);
        setField(expected, "sumOfSquaresOfDeltas", 0.0);
        setField(expected, "min", java.lang.Double.NaN);
        setField(expected, "max", java.lang.Double.NaN);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testYStats2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.snapshot()).thenReturn(((Stats) null));
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        
        Stats actual = pairedStatsAccumulator.yStats();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsurePositive1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensurePositiveMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensurePositive", doubleType);
        ensurePositiveMethod.setAccessible(true);
        java.lang.Object[] ensurePositiveMethodArguments = new java.lang.Object[1];
        ensurePositiveMethodArguments[0] = 0.0;
        double actual = ((double) ensurePositiveMethod.invoke(pairedStatsAccumulator, ensurePositiveMethodArguments));
        
        assertEquals(4.9E-324, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsurePositive2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensurePositiveMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensurePositive", doubleType);
        ensurePositiveMethod.setAccessible(true);
        java.lang.Object[] ensurePositiveMethodArguments = new java.lang.Object[1];
        ensurePositiveMethodArguments[0] = 2.225073858507202E-308;
        double actual = ((double) ensurePositiveMethod.invoke(pairedStatsAccumulator, ensurePositiveMethodArguments));
        
        assertEquals(2.225073858507202E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsurePositive3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensurePositiveMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensurePositive", doubleType);
        ensurePositiveMethod.setAccessible(true);
        java.lang.Object[] ensurePositiveMethodArguments = new java.lang.Object[1];
        ensurePositiveMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((double) ensurePositiveMethod.invoke(pairedStatsAccumulator, ensurePositiveMethodArguments));
        
        assertEquals(4.9E-324, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSampleCovariance1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        pairedStatsAccumulator.sampleCovariance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSampleCovariance2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(2L, 0L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.sampleCovariance();
            
            assertEquals(-0.0, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSampleCovariance3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(-9223372036854775806L, 0L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.sampleCovariance();
            
            assertEquals(-0.0, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        pairedStatsAccumulator.leastSquaresFit();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            mockedStatic1.when(() -> {
                LinearTransformation.vertical(anyDouble());
            }).thenReturn(((LinearTransformation) null));
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
            when(statsAccumulatorMock1.count()).thenReturn(1L);
            when(statsAccumulatorMock1.sumOfSquaresOfDeltas()).thenReturn(-0.0);
            when(statsAccumulatorMock1.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            mockedStatic1.when(() -> {
                LinearTransformation.horizontal(anyDouble());
            }).thenReturn(((LinearTransformation) null));
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(java.lang.Double.NaN);
            when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
            when(statsAccumulatorMock1.count()).thenReturn(1L);
            when(statsAccumulatorMock1.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            mockedStatic1.when(LinearTransformation::forNaN).thenReturn(((LinearTransformation) null));
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(-9223372036854775806L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            mockedStatic1.when(() -> {
                LinearTransformation.mapping(anyDouble(), anyDouble());
            }).thenReturn(((LinearTransformation.LinearTransformationBuilder) null));
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
            when(statsAccumulatorMock1.count()).thenReturn(1L);
            when(statsAccumulatorMock1.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            when(statsAccumulatorMock1.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
            
            pairedStatsAccumulator.leastSquaresFit();
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            LinearTransformation linearTransformationMock = mock(LinearTransformation.class);
            mockedStatic1.when(() -> {
                LinearTransformation.vertical(anyDouble());
            }).thenReturn(linearTransformationMock);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
            when(statsAccumulatorMock1.count()).thenReturn(1L);
            when(statsAccumulatorMock1.sumOfSquaresOfDeltas()).thenReturn(java.lang.Double.NaN);
            when(statsAccumulatorMock1.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(linearTransformationMock, actual));
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            LinearTransformation.LinearTransformationBuilder linearTransformationBuilderMock = mock(LinearTransformation.LinearTransformationBuilder.class);
            when(linearTransformationBuilderMock.withSlope(anyDouble())).thenReturn(((LinearTransformation) null));
            mockedStatic1.when(() -> {
                LinearTransformation.mapping(anyDouble(), anyDouble());
            }).thenReturn(linearTransformationBuilderMock);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            StatsAccumulator statsAccumulatorMock1 = mock(StatsAccumulator.class);
            when(statsAccumulatorMock1.count()).thenReturn(-9223372036854743040L);
            when(statsAccumulatorMock1.sumOfSquaresOfDeltas()).thenReturn(2.225073858507202E-308);
            when(statsAccumulatorMock1.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock1);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic1 = mockStatic(LinearTransformation.class);
            mockedStatic1.when(() -> {
                LinearTransformation.vertical(anyDouble());
            }).thenReturn(((LinearTransformation) null));
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(1125899906842624L);
            when(statsAccumulatorMock.sumOfSquaresOfDeltas()).thenReturn(java.lang.Double.NaN, 2.225073858507202E-308);
            when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testXStats1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        Stats actual = pairedStatsAccumulator.xStats();
        
        Stats expected = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(expected, "count", 0L);
        setField(expected, "mean", 0.0);
        setField(expected, "sumOfSquaresOfDeltas", 0.0);
        setField(expected, "min", java.lang.Double.NaN);
        setField(expected, "max", java.lang.Double.NaN);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testXStats2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.snapshot()).thenReturn(((Stats) null));
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        
        Stats actual = pairedStatsAccumulator.xStats();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopulationCovariance1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        pairedStatsAccumulator.populationCovariance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopulationCovariance2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(-9223372036854775807L, 0L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.populationCovariance();
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopulationCovariance3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(0L, 0L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.populationCovariance();
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPearsonsCorrelationCoefficient1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        pairedStatsAccumulator.pearsonsCorrelationCoefficient();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPearsonsCorrelationCoefficient2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(-9223372036854775806L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.pearsonsCorrelationCoefficient();
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPearsonsCorrelationCoefficient3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(2L);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            double actual = pairedStatsAccumulator.pearsonsCorrelationCoefficient();
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        pairedStatsAccumulator.add(0.0, 0.0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Doubles.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Doubles.isFinite(anyDouble());
            }).thenReturn(true, false);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            pairedStatsAccumulator.add(java.lang.Double.NaN, java.lang.Double.NaN);
            
            Object finalPairedStatsAccumulatorSumOfProductsOfDeltas = getFieldValue(pairedStatsAccumulator, "sumOfProductsOfDeltas");
            
            assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorSumOfProductsOfDeltas), 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Doubles.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Doubles.isFinite(anyDouble());
            }).thenReturn(false);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            pairedStatsAccumulator.add(java.lang.Double.NaN, java.lang.Double.NaN);
            
            Object finalPairedStatsAccumulatorSumOfProductsOfDeltas = getFieldValue(pairedStatsAccumulator, "sumOfProductsOfDeltas");
            
            assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorSumOfProductsOfDeltas), 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Doubles.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Doubles.isFinite(anyDouble());
            }).thenReturn(true, true);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(-9223372036854775806L);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            pairedStatsAccumulator.add(java.lang.Double.NaN, java.lang.Double.NaN);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Doubles.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Doubles.isFinite(anyDouble());
            }).thenReturn(true, true);
            PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
            setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
            StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
            when(statsAccumulatorMock.count()).thenReturn(2L);
            when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN);
            setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
            setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
            
            pairedStatsAccumulator.add(java.lang.Double.NaN, java.lang.Double.NaN);
            
            Object finalPairedStatsAccumulatorSumOfProductsOfDeltas = getFieldValue(pairedStatsAccumulator, "sumOfProductsOfDeltas");
            
            assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorSumOfProductsOfDeltas), 1.0E-6);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCount1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        
        long actual = pairedStatsAccumulator.count();
        
        org.junit.Assert.assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCount2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.count()).thenReturn(0L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        
        long actual = pairedStatsAccumulator.count();
        
        org.junit.Assert.assertEquals(0L, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll1() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = new PairedStatsAccumulator();
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        
        pairedStatsAccumulator.addAll(pairedStats);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        
        pairedStatsAccumulator.addAll(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAll3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        PairedStats pairedStatsMock = mock(PairedStats.class);
        when(pairedStatsMock.count()).thenReturn(0L);
        
        pairedStatsAccumulator.addAll(pairedStatsMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll4() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.count()).thenReturn(-9223372036854775807L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        PairedStats pairedStatsMock = mock(PairedStats.class);
        when(pairedStatsMock.count()).thenReturn(-9223372036854775807L);
        when(pairedStatsMock.xStats()).thenReturn(((Stats) null), ((Stats) null));
        when(pairedStatsMock.sumOfProductsOfDeltas()).thenReturn(java.lang.Double.NaN);
        
        pairedStatsAccumulator.addAll(pairedStatsMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll5() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN);
        when(statsAccumulatorMock.count()).thenReturn(-9223372036854775807L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        PairedStats pairedStatsMock = mock(PairedStats.class);
        when(pairedStatsMock.count()).thenReturn(-9223372036854775807L);
        Stats statsMock = mock(Stats.class);
        when(statsMock.mean()).thenReturn(java.lang.Double.NaN);
        when(pairedStatsMock.xStats()).thenReturn(((Stats) null), statsMock);
        when(pairedStatsMock.sumOfProductsOfDeltas()).thenReturn(java.lang.Double.NaN);
        when(pairedStatsMock.yStats()).thenReturn(((Stats) null));
        
        pairedStatsAccumulator.addAll(pairedStatsMock);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAll6() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.count()).thenReturn(0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        PairedStats pairedStatsMock = mock(PairedStats.class);
        when(pairedStatsMock.count()).thenReturn(-9223372036854775807L);
        when(pairedStatsMock.xStats()).thenReturn(((Stats) null));
        when(pairedStatsMock.sumOfProductsOfDeltas()).thenReturn(java.lang.Double.NaN);
        when(pairedStatsMock.yStats()).thenReturn(((Stats) null));
        
        pairedStatsAccumulator.addAll(pairedStatsMock);
        
        Object finalPairedStatsAccumulatorSumOfProductsOfDeltas = getFieldValue(pairedStatsAccumulator, "sumOfProductsOfDeltas");
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorSumOfProductsOfDeltas), 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAddAll7() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
        StatsAccumulator statsAccumulatorMock = mock(StatsAccumulator.class);
        when(statsAccumulatorMock.mean()).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN);
        when(statsAccumulatorMock.count()).thenReturn(-9223372036854775807L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulatorMock);
        setField(pairedStatsAccumulator, "xStats", statsAccumulatorMock);
        PairedStats pairedStatsMock = mock(PairedStats.class);
        when(pairedStatsMock.count()).thenReturn(-9223372036854775807L, 0L);
        Stats statsMock = mock(Stats.class);
        when(statsMock.mean()).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN);
        when(pairedStatsMock.xStats()).thenReturn(((Stats) null), statsMock);
        when(pairedStatsMock.sumOfProductsOfDeltas()).thenReturn(java.lang.Double.NaN);
        when(pairedStatsMock.yStats()).thenReturn(statsMock, ((Stats) null));
        
        pairedStatsAccumulator.addAll(pairedStatsMock);
        
        Object finalPairedStatsAccumulatorSumOfProductsOfDeltas = getFieldValue(pairedStatsAccumulator, "sumOfProductsOfDeltas");
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorSumOfProductsOfDeltas), 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureInUnitRange1() throws Throwable  {
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensureInUnitRangeMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensureInUnitRange", doubleType);
        ensureInUnitRangeMethod.setAccessible(true);
        java.lang.Object[] ensureInUnitRangeMethodArguments = new java.lang.Object[1];
        ensureInUnitRangeMethodArguments[0] = 0.0;
        double actual = ((double) ensureInUnitRangeMethod.invoke(null, ensureInUnitRangeMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureInUnitRange2() throws Throwable  {
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensureInUnitRangeMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensureInUnitRange", doubleType);
        ensureInUnitRangeMethod.setAccessible(true);
        java.lang.Object[] ensureInUnitRangeMethodArguments = new java.lang.Object[1];
        ensureInUnitRangeMethodArguments[0] = 1.0;
        double actual = ((double) ensureInUnitRangeMethod.invoke(null, ensureInUnitRangeMethodArguments));
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureInUnitRange3() throws Throwable  {
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensureInUnitRangeMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensureInUnitRange", doubleType);
        ensureInUnitRangeMethod.setAccessible(true);
        java.lang.Object[] ensureInUnitRangeMethodArguments = new java.lang.Object[1];
        ensureInUnitRangeMethodArguments[0] = -2.000000000000007;
        double actual = ((double) ensureInUnitRangeMethod.invoke(null, ensureInUnitRangeMethodArguments));
        
        assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEnsureInUnitRange4() throws Throwable  {
        Class pairedStatsAccumulatorClazz = Class.forName("com.google.common.math.PairedStatsAccumulator");
        Class doubleType = double.class;
        Method ensureInUnitRangeMethod = pairedStatsAccumulatorClazz.getDeclaredMethod("ensureInUnitRange", doubleType);
        ensureInUnitRangeMethod.setAccessible(true);
        java.lang.Object[] ensureInUnitRangeMethodArguments = new java.lang.Object[1];
        ensureInUnitRangeMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((double) ensureInUnitRangeMethod.invoke(null, ensureInUnitRangeMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPairedStatsAccumulator1() {
        PairedStatsAccumulator actual = new PairedStatsAccumulator();
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
