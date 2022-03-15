package com.google.common.math;

import org.junit.Test;
import java.math.RoundingMode;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.any;

public class IntMathTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog21() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        IntMath.log2(0, roundingMode);
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
    
    @Test(timeout = 10000)
    public void testGcd2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0, 0);
            
            int actual = IntMath.gcd(0, 0);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGcd3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0, 0);
            
            int actual = IntMath.gcd(1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
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
    
    @Test(timeout = 10000)
    public void testSaturatedAdd1() throws Throwable  {
        int actual = IntMath.saturatedAdd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedAdd2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedAdd(0, 0);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedSubtract(0, 0);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFloorPowerOfTwo1() throws Throwable  {
        IntMath.floorPowerOfTwo(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFloorPowerOfTwo2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkPositive(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.floorPowerOfTwo(0);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkPositive(anyString(), anyInt());
            }).thenReturn(0);
            
            IntMath.ceilingPowerOfTwo(1073741825);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCeilingPowerOfTwo3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkPositive(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.ceilingPowerOfTwo(65536);
            
            assertEquals(65536, actual);
        } finally {
            mockedStatic.close();
        }
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
    public void testCheckedAdd1() throws Throwable  {
        int actual = IntMath.checkedAdd(0, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedAdd2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            
            int actual = IntMath.checkedAdd(-458980722, -2063556528);
            
            assertEquals(1772430046, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedAdd3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            
            int actual = IntMath.checkedAdd(638593792, 1060549504);
            
            assertEquals(1699143296, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            
            int actual = IntMath.checkedSubtract(-1979120128, 704616448);
            
            assertEquals(1611230720, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedSubtract3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            
            int actual = IntMath.checkedSubtract(93585408, -58482688);
            
            assertEquals(152068096, actual);
        } finally {
            mockedStatic.close();
        }
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
    
    @Test(timeout = 10000)
    public void testCheckedMultiply2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            
            int actual = IntMath.checkedMultiply(1946412416, -1069659937);
            
            assertEquals(-1125062016, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(0, 2);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(0, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(3, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(2, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(2, 32);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-2, 32);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-2, 33);
            
            assertEquals(-2, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-2, 1);
            
            assertEquals(-2, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-1, 1);
            
            assertEquals(-1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(3, 1);
            
            assertEquals(3, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(Integer.MIN_VALUE, 2);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckedPow15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.checkedPow(-19193, 2);
            
            assertEquals(368371249, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedMultiply(0, 0);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(2, 32);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(0, 2);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-2, 32);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-2, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(2, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(0, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(3, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-2, 1);
            
            assertEquals(-2, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-1, 1);
            
            assertEquals(-1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(46341, 2);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(Integer.MIN_VALUE, 2);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            mockedStatic1 = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic1.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(3, 1);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            mockedStatic1 = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic1.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(Integer.MIN_VALUE, 3);
            
            assertEquals(Integer.MIN_VALUE, actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSaturatedPow17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            mockedStatic1 = mockStatic(com.google.common.primitives.Ints.class);
            mockedStatic1.when(() -> {
                com.google.common.primitives.Ints.saturatedCast(anyLong());
            }).thenReturn(0);
            
            int actual = IntMath.saturatedPow(-19193, 2);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
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
    
    @Test(timeout = 10000)
    public void testFactorial2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.factorial(16);
            
            assertEquals(Integer.MAX_VALUE, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testFactorial3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            IntMath.factorial(Integer.MIN_VALUE);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testFactorial4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.factorial(0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
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
    
    @Test(timeout = 10000)
    public void testBinomial2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            int[] prevBiggestBinomials = IntMath.biggestBinomials;
            try {
                int[] biggestBinomials = new int[9];
                IntMath.biggestBinomials = biggestBinomials;
                mockedStatic = mockStatic(MathPreconditions.class);
                mockedStatic.when(() -> {
                    MathPreconditions.checkNonNegative(anyString(), anyInt());
                }).thenReturn(0, 0);
                mockedStatic1 = mockStatic(com.google.common.base.Preconditions.class);
                
                int actual = IntMath.binomial(Integer.MIN_VALUE, 1073741824);
                
                assertEquals(Integer.MAX_VALUE, actual);
            } finally {
                IntMath.biggestBinomials = prevBiggestBinomials;
            }
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBinomial3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            int[] prevBiggestBinomials = IntMath.biggestBinomials;
            try {
                int[] biggestBinomials = new int[9];
                IntMath.biggestBinomials = biggestBinomials;
                mockedStatic = mockStatic(MathPreconditions.class);
                mockedStatic.when(() -> {
                    MathPreconditions.checkNonNegative(anyString(), anyInt());
                }).thenReturn(0, 0);
                mockedStatic1 = mockStatic(com.google.common.base.Preconditions.class);
                
                IntMath.binomial(-536866560, 1275066881);
            } finally {
                IntMath.biggestBinomials = prevBiggestBinomials;
            }
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(LongMath.class);
            mockedStatic.when(() -> {
                LongMath.isPrime(anyLong());
            }).thenReturn(false);
            
            boolean actual = IntMath.isPrime(0);
            
            assertFalse(actual);
        } finally {
            mockedStatic.close();
        }
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
    public void testLog101() throws Throwable  {
        RoundingMode roundingMode = ((RoundingMode) createInstance("java.math.RoundingMode"));
        
        IntMath.log10(0, roundingMode);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testLog102() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkPositive(anyString(), anyInt());
            }).thenReturn(0);
            
            IntMath.log10(0, null);
        } finally {
            mockedStatic.close();
        }
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(-2, 32);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(0, 2);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(2, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(2, 32);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(0, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(3, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(3, 1);
            
            assertEquals(3, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(-2, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(-2, 1);
            
            assertEquals(-2, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(-1, 0);
            
            assertEquals(1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(-1, 1);
            
            assertEquals(-1, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(3, 2);
            
            assertEquals(9, actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testPow15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(MathPreconditions.class);
            mockedStatic.when(() -> {
                MathPreconditions.checkNonNegative(anyString(), anyInt());
            }).thenReturn(0);
            
            int actual = IntMath.pow(3, 3);
            
            assertEquals(27, actual);
        } finally {
            mockedStatic.close();
        }
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
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testDivide2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            RoundingMode roundingMode = RoundingMode.UP;
            
            IntMath.divide(0, 0, roundingMode);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testDivide3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.google.common.base.Preconditions.class);
            mockedStatic.when(() -> {
                com.google.common.base.Preconditions.checkNotNull(any());
            }).thenReturn(null);
            
            int actual = IntMath.divide(0, 1073545216, null);
            
            assertEquals(0, actual);
        } finally {
            mockedStatic.close();
        }
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
