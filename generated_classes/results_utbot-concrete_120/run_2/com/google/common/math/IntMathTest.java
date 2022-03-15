package com.google.common.math;

import org.junit.Test;
import java.math.RoundingMode;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntMathTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog21() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        IntMath.log2(0, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog22() throws Throwable  {
        IntMath.log2(-2147483647, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog23() throws Throwable  {
        IntMath.log2(1, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMod1() throws Throwable  {
        IntMath.mod(0, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testMod2() throws Throwable  {
        IntMath.mod(0, -2147483647);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMod3() throws Throwable  {
        int actual = IntMath.mod(2147450860, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMod4() throws Throwable  {
        int actual = IntMath.mod(-208766597, 371);
        
        assertEquals(297, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd1() throws Throwable  {
        int actual = IntMath.gcd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGcd2() throws Throwable  {
        IntMath.gcd(Integer.MIN_VALUE, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd3() throws Throwable  {
        int actual = IntMath.gcd(1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd4() throws Throwable  {
        int actual = IntMath.gcd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd5() throws Throwable  {
        int actual = IntMath.gcd(1073741824, 67108864);
        
        assertEquals(67108864, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd6() throws Throwable  {
        int actual = IntMath.gcd(2048, 1073741832);
        
        assertEquals(8, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedAdd1() throws Throwable  {
        int actual = IntMath.saturatedAdd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedAdd2() throws Throwable  {
        int actual = IntMath.saturatedAdd(-17056766, -2147450879);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedAdd3() throws Throwable  {
        int actual = IntMath.saturatedAdd(0, Integer.MIN_VALUE);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedAdd4() throws Throwable  {
        int actual = IntMath.saturatedAdd(2141284462, 67108864);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedSubtract1() throws Throwable  {
        int actual = IntMath.saturatedSubtract(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedSubtract2() throws Throwable  {
        int actual = IntMath.saturatedSubtract(-1879053826, 1342177797);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedSubtract3() throws Throwable  {
        int actual = IntMath.saturatedSubtract(-2002780156, 144703492);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedSubtract4() throws Throwable  {
        int actual = IntMath.saturatedSubtract(558388866, -2080374784);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPowerOfTwo1() throws Throwable  {
        boolean actual = IntMath.isPowerOfTwo(0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPowerOfTwo2() throws Throwable  {
        boolean actual = IntMath.isPowerOfTwo(Integer.MAX_VALUE);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPowerOfTwo3() throws Throwable  {
        boolean actual = IntMath.isPowerOfTwo(-1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPowerOfTwo4() throws Throwable  {
        boolean actual = IntMath.isPowerOfTwo(536870912);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloorPowerOfTwo1() throws Throwable  {
        IntMath.floorPowerOfTwo(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloorPowerOfTwo2() throws Throwable  {
        IntMath.floorPowerOfTwo(-2147483647);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFloorPowerOfTwo3() throws Throwable  {
        int actual = IntMath.floorPowerOfTwo(1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCeilingPowerOfTwo1() throws Throwable  {
        IntMath.ceilingPowerOfTwo(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCeilingPowerOfTwo2() throws Throwable  {
        IntMath.ceilingPowerOfTwo(1073741825);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCeilingPowerOfTwo3() throws Throwable  {
        int actual = IntMath.ceilingPowerOfTwo(1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLessThanBranchFree1() throws Throwable  {
        int actual = IntMath.lessThanBranchFree(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLessThanBranchFree2() throws Throwable  {
        int actual = IntMath.lessThanBranchFree(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLog10Floor1() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Class intType = int.class;
        Method log10FloorMethod = intMathClazz.getDeclaredMethod("log10Floor", intType);
        log10FloorMethod.setAccessible(true);
        java.lang.Object[] log10FloorMethodArguments = new java.lang.Object[1];
        log10FloorMethodArguments[0] = 0;
        int actual = ((int) log10FloorMethod.invoke(null, log10FloorMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testLog10Floor2() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Class intType = int.class;
        Method log10FloorMethod = intMathClazz.getDeclaredMethod("log10Floor", intType);
        log10FloorMethod.setAccessible(true);
        java.lang.Object[] log10FloorMethodArguments = new java.lang.Object[1];
        log10FloorMethodArguments[0] = 16842753;
        int actual = ((int) log10FloorMethod.invoke(null, log10FloorMethodArguments));
        
        assertEquals(7, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSqrtFloor1() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Class intType = int.class;
        Method sqrtFloorMethod = intMathClazz.getDeclaredMethod("sqrtFloor", intType);
        sqrtFloorMethod.setAccessible(true);
        java.lang.Object[] sqrtFloorMethodArguments = new java.lang.Object[1];
        sqrtFloorMethodArguments[0] = 0;
        int actual = ((int) sqrtFloorMethod.invoke(null, sqrtFloorMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSqrtFloor2() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Class intType = int.class;
        Method sqrtFloorMethod = intMathClazz.getDeclaredMethod("sqrtFloor", intType);
        sqrtFloorMethod.setAccessible(true);
        java.lang.Object[] sqrtFloorMethodArguments = new java.lang.Object[1];
        sqrtFloorMethodArguments[0] = 0;
        int actual = ((int) sqrtFloorMethod.invoke(null, sqrtFloorMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedAdd1() throws Throwable  {
        int actual = IntMath.checkedAdd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedAdd2() throws Throwable  {
        int actual = IntMath.checkedAdd(638593792, 1060549504);
        
        assertEquals(1699143296, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedAdd3() throws Throwable  {
        IntMath.checkedAdd(-1004272622, -1926037428);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedSubtract1() throws Throwable  {
        int actual = IntMath.checkedSubtract(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedSubtract2() throws Throwable  {
        int actual = IntMath.checkedSubtract(93585408, -58482688);
        
        assertEquals(152068096, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedSubtract3() throws Throwable  {
        IntMath.checkedSubtract(-1877982720, 670990336);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedMultiply1() throws Throwable  {
        int actual = IntMath.checkedMultiply(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedMultiply2() throws Throwable  {
        IntMath.checkedMultiply(1835201, 671842832);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow1() throws Throwable  {
        int actual = IntMath.checkedPow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow2() throws Throwable  {
        int actual = IntMath.checkedPow(1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow3() throws Throwable  {
        int actual = IntMath.checkedPow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow4() throws Throwable  {
        int actual = IntMath.checkedPow(0, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow5() throws Throwable  {
        int actual = IntMath.checkedPow(-1, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow6() throws Throwable  {
        int actual = IntMath.checkedPow(-1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow7() throws Throwable  {
        int actual = IntMath.checkedPow(3, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow8() throws Throwable  {
        int actual = IntMath.checkedPow(2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow9() throws Throwable  {
        int actual = IntMath.checkedPow(-2, 1);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow10() throws Throwable  {
        int actual = IntMath.checkedPow(-2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow11() throws Throwable  {
        IntMath.checkedPow(0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow12() throws Throwable  {
        IntMath.checkedPow(46341, 2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow13() throws Throwable  {
        IntMath.checkedPow(2, 32);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow14() throws Throwable  {
        IntMath.checkedPow(-2, 32);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow15() throws Throwable  {
        int actual = IntMath.checkedPow(3, 1);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow16() throws Throwable  {
        IntMath.checkedPow(Integer.MIN_VALUE, 2);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow17() throws Throwable  {
        IntMath.checkedPow(46341, 3);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow18() throws Throwable  {
        int actual = IntMath.checkedPow(-19193, 2);
        
        assertEquals(368371249, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckedPow19() throws Throwable  {
        IntMath.checkedPow(-43904, 65539);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedMultiply1() throws Throwable  {
        int actual = IntMath.saturatedMultiply(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedMultiply2() throws Throwable  {
        int actual = IntMath.saturatedMultiply(-2147483628, 536871936);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedMultiply3() throws Throwable  {
        int actual = IntMath.saturatedMultiply(-1073741824, 2);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedMultiply4() throws Throwable  {
        int actual = IntMath.saturatedMultiply(1901430016, 1229635136);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow1() throws Throwable  {
        int actual = IntMath.saturatedPow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow2() throws Throwable  {
        int actual = IntMath.saturatedPow(1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow3() throws Throwable  {
        int actual = IntMath.saturatedPow(2, 32);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow4() throws Throwable  {
        int actual = IntMath.saturatedPow(2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow5() throws Throwable  {
        int actual = IntMath.saturatedPow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow6() throws Throwable  {
        int actual = IntMath.saturatedPow(-1, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow7() throws Throwable  {
        int actual = IntMath.saturatedPow(-2, 32);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow8() throws Throwable  {
        int actual = IntMath.saturatedPow(-2, 1);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow9() throws Throwable  {
        int actual = IntMath.saturatedPow(0, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow10() throws Throwable  {
        int actual = IntMath.saturatedPow(-2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow11() throws Throwable  {
        int actual = IntMath.saturatedPow(-1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow12() throws Throwable  {
        int actual = IntMath.saturatedPow(3, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSaturatedPow13() throws Throwable  {
        IntMath.saturatedPow(0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow14() throws Throwable  {
        int actual = IntMath.saturatedPow(Integer.MIN_VALUE, 2);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow15() throws Throwable  {
        int actual = IntMath.saturatedPow(46341, 2);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow16() throws Throwable  {
        int actual = IntMath.saturatedPow(Integer.MIN_VALUE, 1);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow17() throws Throwable  {
        int actual = IntMath.saturatedPow(46341, 3);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow18() throws Throwable  {
        int actual = IntMath.saturatedPow(-18167, 2);
        
        assertEquals(330039889, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow19() throws Throwable  {
        int actual = IntMath.saturatedPow(-19193, 7);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow20() throws Throwable  {
        int actual = IntMath.saturatedPow(24769, 19);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFactorial1() throws Throwable  {
        int actual = IntMath.factorial(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFactorial2() throws Throwable  {
        IntMath.factorial(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFactorial3() throws Throwable  {
        int actual = IntMath.factorial(16);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFactorial4() throws Throwable  {
        int actual = IntMath.factorial(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBinomial1() throws Throwable  {
        int actual = IntMath.binomial(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBinomial2() throws Throwable  {
        IntMath.binomial(Integer.MIN_VALUE, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBinomial3() throws Throwable  {
        IntMath.binomial(0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBinomial4() throws Throwable  {
        IntMath.binomial(0, 1);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testBinomial5() throws Throwable  {
        int[] prevBiggestBinomials = IntMath.biggestBinomials;
        try {
            int[] biggestBinomials = new int[1];
            IntMath.biggestBinomials = biggestBinomials;
            
            int actual = IntMath.binomial(1610612738, 1610612736);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            IntMath.biggestBinomials = prevBiggestBinomials;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMean1() throws Throwable  {
        int actual = IntMath.mean(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testMean2() throws Throwable  {
        int actual = IntMath.mean(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime1() throws Throwable  {
        boolean actual = IntMath.isPrime(0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime2() throws Throwable  {
        boolean actual = IntMath.isPrime(2);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime3() throws Throwable  {
        boolean actual = IntMath.isPrime(5);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime4() throws Throwable  {
        boolean actual = IntMath.isPrime(7);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime5() throws Throwable  {
        boolean actual = IntMath.isPrime(1006632979);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime6() throws Throwable  {
        boolean actual = IntMath.isPrime(201326593);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime7() throws Throwable  {
        boolean actual = IntMath.isPrime(241);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime8() throws Throwable  {
        boolean actual = IntMath.isPrime(1073741824);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime9() throws Throwable  {
        boolean actual = IntMath.isPrime(0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testIsPrime10() throws Throwable  {
        IntMath.isPrime(-2147483645);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime11() throws Throwable  {
        boolean actual = IntMath.isPrime(348401741);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsPrime12() throws Throwable  {
        boolean actual = IntMath.isPrime(47521);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSqrt1() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        int actual = IntMath.sqrt(0, roundingMode);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSqrt2() throws Throwable  {
        IntMath.sqrt(Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog101() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        IntMath.log10(0, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog102() throws Throwable  {
        IntMath.log10(-2147483647, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog103() throws Throwable  {
        IntMath.log10(327680, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow1() throws Throwable  {
        int actual = IntMath.pow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow2() throws Throwable  {
        int actual = IntMath.pow(1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow3() throws Throwable  {
        int actual = IntMath.pow(-2, 32);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow4() throws Throwable  {
        int actual = IntMath.pow(-1, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow5() throws Throwable  {
        int actual = IntMath.pow(-1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow6() throws Throwable  {
        int actual = IntMath.pow(0, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow7() throws Throwable  {
        int actual = IntMath.pow(2, 32);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow8() throws Throwable  {
        int actual = IntMath.pow(0, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow9() throws Throwable  {
        int actual = IntMath.pow(-2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow10() throws Throwable  {
        int actual = IntMath.pow(-2, 1);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow11() throws Throwable  {
        int actual = IntMath.pow(2, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow12() throws Throwable  {
        int actual = IntMath.pow(3, 1);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow13() throws Throwable  {
        int actual = IntMath.pow(3, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow14() throws Throwable  {
        int actual = IntMath.pow(3, 3);
        
        assertEquals(27, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testPow15() throws Throwable  {
        IntMath.pow(0, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow16() throws Throwable  {
        int actual = IntMath.pow(3, 2);
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDivide1() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        IntMath.divide(0, 0, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide2() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.UP;
        
        int actual = IntMath.divide(0, 1, roundingMode);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDivide3() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.UP;
        
        IntMath.divide(0, 0, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDivide4() throws Throwable  {
        IntMath.divide(0, 0, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide5() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        
        int actual = IntMath.divide(1747189760, -3407744, roundingMode);
        
        assertEquals(-513, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide6() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        
        int actual = IntMath.divide(1612709888, 393216, roundingMode);
        
        assertEquals(4101, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide7() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.CEILING;
        
        int actual = IntMath.divide(-1, 131072, roundingMode);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide8() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.DOWN;
        
        int actual = IntMath.divide(-1, 131072, roundingMode);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide9() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.CEILING;
        
        int actual = IntMath.divide(-131168, -16908384, roundingMode);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide10() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.UP;
        
        int actual = IntMath.divide(39845888, -2121269040, roundingMode);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDivide11() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        
        IntMath.divide(46137344, -2128609090, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide12() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        
        int actual = IntMath.divide(1073741824, Integer.MIN_VALUE, roundingMode);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide13() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        
        int actual = IntMath.divide(1232628192, -2295, roundingMode);
        
        assertEquals(-537093, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide14() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        
        int actual = IntMath.divide(290026, -3, roundingMode);
        
        assertEquals(-96675, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide15() throws Throwable  {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        
        int actual = IntMath.divide(1342177279, 2, roundingMode);
        
        assertEquals(671088640, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIntMath1() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Constructor intMathConstructor = intMathClazz.getDeclaredConstructor();
        intMathConstructor.setAccessible(true);
        java.lang.Object[] intMathConstructorArguments = new java.lang.Object[0];
        IntMath actual = ((IntMath) intMathConstructor.newInstance(intMathConstructorArguments));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIntMath2() throws Throwable  {
        Class intMathClazz = Class.forName("com.google.common.math.IntMath");
        Constructor intMathConstructor = intMathClazz.getDeclaredConstructor();
        intMathConstructor.setAccessible(true);
        java.lang.Object[] intMathConstructorArguments = new java.lang.Object[0];
        IntMath actual = ((IntMath) intMathConstructor.newInstance(intMathConstructorArguments));
    }
    ///endregion
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return getUnsafeInstance().allocateInstance(clazz);
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
