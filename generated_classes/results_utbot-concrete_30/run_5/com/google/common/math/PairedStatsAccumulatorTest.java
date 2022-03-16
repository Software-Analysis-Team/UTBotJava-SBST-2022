package com.google.common.math;

import org.junit.Test;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "max", 4.9E-324);
        setField(statsAccumulator, "min", java.lang.Double.NaN);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "max", 2.225073858508213E-308);
        setField(statsAccumulator1, "min", java.lang.Double.NaN);
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 4.7783097267364807E-299);
        setField(statsAccumulator1, "mean", 0.0);
        setField(statsAccumulator1, "count", 0L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        PairedStats actual = pairedStatsAccumulator.snapshot();
        
        PairedStats expected = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "count", 0L);
        setField(stats, "mean", 0.0);
        setField(stats, "sumOfSquaresOfDeltas", 4.7783097267364807E-299);
        setField(stats, "min", java.lang.Double.NaN);
        setField(stats, "max", 2.225073858508213E-308);
        setField(expected, "xStats", stats);
        Stats stats1 = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats1, "count", 0L);
        setField(stats1, "mean", java.lang.Double.NaN);
        setField(stats1, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(stats1, "min", java.lang.Double.NaN);
        setField(stats1, "max", 4.9E-324);
        setField(expected, "yStats", stats1);
        setField(expected, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAdd2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "min", 5.304989477E-315);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", 4.9E-324);
        setField(statsAccumulator, "count", 128L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.add(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMin = getFieldValue(pairedStatsAccumulatorXStats, "min");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMean = getFieldValue(pairedStatsAccumulatorXStats1, "mean");
        Object pairedStatsAccumulatorXStats2 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats2, "count");
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, ((double) finalPairedStatsAccumulatorXStatsMin), 1.0E-6);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, ((double) finalPairedStatsAccumulatorXStatsMean), 1.0E-6);
        
        org.junit.Assert.assertEquals(129L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAdd3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "mean", java.lang.Double.NEGATIVE_INFINITY);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.add(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMean = getFieldValue(pairedStatsAccumulatorXStats, "mean");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats1, "count");
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorXStatsMean), 1.0E-6);
        
        org.junit.Assert.assertEquals(-9223372036854775806L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAdd4() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "min", -0.0);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", 1.73833895195875E-310);
        setField(statsAccumulator, "count", -9223372034707292160L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.add(1.0118E-320, java.lang.Double.NaN);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats, "count");
        
        org.junit.Assert.assertEquals(-9223372034707292159L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testAdd5() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "max", 0.0);
        setField(statsAccumulator, "min", 0.0);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.add(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAdd6() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "mean", java.lang.Double.POSITIVE_INFINITY);
        setField(statsAccumulator, "count", -9223372036787666944L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.add(4.9E-324, java.lang.Double.NaN);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats, "count");
        
        org.junit.Assert.assertEquals(-9223372036787666943L, finalPairedStatsAccumulatorXStatsCount);
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
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
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
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "count", 0L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll4() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "min", 6.47582E-319);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator, "mean", java.lang.Double.NEGATIVE_INFINITY);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "min", 0.0);
        setField(stats, "mean", 0.0);
        setField(stats, "count", -9223372036854775807L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMin = getFieldValue(pairedStatsAccumulatorXStats, "min");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsSumOfSquaresOfDeltas = getFieldValue(pairedStatsAccumulatorXStats1, "sumOfSquaresOfDeltas");
        Object pairedStatsAccumulatorXStats2 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats2, "count");
        
        assertEquals(0.0, ((double) finalPairedStatsAccumulatorXStatsMin), 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorXStatsSumOfSquaresOfDeltas), 1.0E-6);
        
        org.junit.Assert.assertEquals(2L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll5() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", 2048L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "mean", 4.9E-324);
        setField(stats, "count", 2305843009213693952L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMean = getFieldValue(pairedStatsAccumulatorXStats, "mean");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats1, "count");
        
        assertEquals(4.9E-324, ((double) finalPairedStatsAccumulatorXStatsMean), 1.0E-6);
        
        org.junit.Assert.assertEquals(2305843009213696000L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll6() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "min", -0.0);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator, "mean", java.lang.Double.NEGATIVE_INFINITY);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "min", java.lang.Double.NaN);
        setField(stats, "mean", java.lang.Double.POSITIVE_INFINITY);
        setField(stats, "count", -9223372036854251520L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMin = getFieldValue(pairedStatsAccumulatorXStats, "min");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsSumOfSquaresOfDeltas = getFieldValue(pairedStatsAccumulatorXStats1, "sumOfSquaresOfDeltas");
        Object pairedStatsAccumulatorXStats2 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMean = getFieldValue(pairedStatsAccumulatorXStats2, "mean");
        Object pairedStatsAccumulatorXStats3 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats3, "count");
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorXStatsMin), 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorXStatsSumOfSquaresOfDeltas), 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, ((double) finalPairedStatsAccumulatorXStatsMean), 1.0E-6);
        
        org.junit.Assert.assertEquals(524289L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll7() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "mean", 4.9E-324);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "mean", java.lang.Double.NEGATIVE_INFINITY);
        setField(stats, "count", 1L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
        
        Object pairedStatsAccumulatorXStats = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsMean = getFieldValue(pairedStatsAccumulatorXStats, "mean");
        Object pairedStatsAccumulatorXStats1 = getFieldValue(pairedStatsAccumulator, "xStats");
        Object finalPairedStatsAccumulatorXStatsCount = getFieldValue(pairedStatsAccumulatorXStats1, "count");
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, ((double) finalPairedStatsAccumulatorXStatsMean), 1.0E-6);
        
        org.junit.Assert.assertEquals(-9223372036854775806L, finalPairedStatsAccumulatorXStatsCount);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testAddAll8() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "max", 0.0);
        setField(statsAccumulator, "min", 0.0);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        PairedStats pairedStats = ((PairedStats) createInstance("com.google.common.math.PairedStats"));
        setField(pairedStats, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        Stats stats = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(stats, "max", 0.0);
        setField(stats, "min", 0.0);
        setField(stats, "sumOfSquaresOfDeltas", 0.0);
        setField(stats, "mean", 0.0);
        setField(stats, "count", -9223372036854775807L);
        setField(pairedStats, "xStats", stats);
        
        pairedStatsAccumulator.addAll(pairedStats);
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
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "max", java.lang.Double.NaN);
        setField(statsAccumulator, "min", java.lang.Double.NaN);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        
        Stats actual = pairedStatsAccumulator.yStats();
        
        Stats expected = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(expected, "count", 0L);
        setField(expected, "mean", java.lang.Double.NaN);
        setField(expected, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(expected, "min", java.lang.Double.NaN);
        setField(expected, "max", java.lang.Double.NaN);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSampleCovariance2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", -9223372036854775806L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.sampleCovariance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSampleCovariance3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 0.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        double actual = pairedStatsAccumulator.sampleCovariance();
        
        assertEquals(0.0, actual, 1.0E-6);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", -9223372036854775806L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.leastSquaresFit();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -0.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator1, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        pairedStatsAccumulator.leastSquaresFit();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit4() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
        
        Object expected = createInstance("com.google.common.math.LinearTransformation$NaNLinearTransformation");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit5() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.000000000000014);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator1, "count", 576460752303423488L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        pairedStatsAccumulator.leastSquaresFit();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit6() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -0.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator1, "mean", 0.0);
        setField(statsAccumulator1, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
        
        Object expected = createInstance("com.google.common.math.LinearTransformation$RegularLinearTransformation");
        setField(expected, "slope", 0.0);
        setField(expected, "yIntercept", 0.0);
        setField(expected, "inverse", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit7() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", 2.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator1, "mean", 0.0);
        setField(statsAccumulator1, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
        
        Object expected = createInstance("com.google.common.math.LinearTransformation$VerticalLinearTransformation");
        setField(expected, "x", 0.0);
        setField(expected, "inverse", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLeastSquaresFit8() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -0.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator1, "mean", 0.0);
        setField(statsAccumulator1, "count", 4611686018427387904L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        pairedStatsAccumulator.leastSquaresFit();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLeastSquaresFit9() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -0.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator, "mean", 0.0);
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 2.2250738585072053E-308);
        setField(statsAccumulator1, "mean", 0.0);
        setField(statsAccumulator1, "count", 4611686018427387904L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        LinearTransformation actual = pairedStatsAccumulator.leastSquaresFit();
        
        Object expected = createInstance("com.google.common.math.LinearTransformation$RegularLinearTransformation");
        setField(expected, "slope", -0.0);
        setField(expected, "yIntercept", 0.0);
        setField(expected, "inverse", null);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "max", java.lang.Double.NaN);
        setField(statsAccumulator, "min", java.lang.Double.NaN);
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "mean", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        Stats actual = pairedStatsAccumulator.xStats();
        
        Stats expected = ((Stats) createInstance("com.google.common.math.Stats"));
        setField(expected, "count", 0L);
        setField(expected, "mean", java.lang.Double.NaN);
        setField(expected, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(expected, "min", java.lang.Double.NaN);
        setField(expected, "max", java.lang.Double.NaN);
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPopulationCovariance2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.populationCovariance();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPopulationCovariance3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", -9223372036854775807L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        double actual = pairedStatsAccumulator.populationCovariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPearsonsCorrelationCoefficient2() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", -9223372036854775806L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        pairedStatsAccumulator.pearsonsCorrelationCoefficient();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPearsonsCorrelationCoefficient3() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", java.lang.Double.NaN);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator);
        
        double actual = pairedStatsAccumulator.pearsonsCorrelationCoefficient();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPearsonsCorrelationCoefficient4() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.0);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", 0.0);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator1, "count", 262144L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        pairedStatsAccumulator.pearsonsCorrelationCoefficient();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPearsonsCorrelationCoefficient5() throws Throwable  {
        PairedStatsAccumulator pairedStatsAccumulator = ((PairedStatsAccumulator) createInstance("com.google.common.math.PairedStatsAccumulator"));
        setField(pairedStatsAccumulator, "sumOfProductsOfDeltas", -2.2250738585072014E-308);
        StatsAccumulator statsAccumulator = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator, "sumOfSquaresOfDeltas", java.lang.Double.NaN);
        setField(statsAccumulator, "count", 0L);
        setField(pairedStatsAccumulator, "yStats", statsAccumulator);
        StatsAccumulator statsAccumulator1 = ((StatsAccumulator) createInstance("com.google.common.math.StatsAccumulator"));
        setField(statsAccumulator1, "sumOfSquaresOfDeltas", 3.337610787760802E-308);
        setField(statsAccumulator1, "count", 2L);
        setField(pairedStatsAccumulator, "xStats", statsAccumulator1);
        
        pairedStatsAccumulator.pearsonsCorrelationCoefficient();
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
    
    ///region
    
    @Test(timeout = 10000)
    public void testPairedStatsAccumulator2() {
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
