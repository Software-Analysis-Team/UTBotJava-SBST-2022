package spoon.support.reflect.cu.position;

import org.junit.Test;
import spoon.reflect.cu.CompilationUnit;
import java.io.File;
import spoon.reflect.factory.Factory;
import spoon.compiler.Environment;
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

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class SourcePositionImplTest {
    ///region
    
    @Test(timeout = 10000)
    public void testEquals1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        Object object = new Object();
        
        boolean actual = sourcePositionImpl.equals(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        boolean actual = sourcePositionImpl.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        File file = ((File) createInstance("java.io.File"));
        when(compilationUnitMock.getFile()).thenReturn(((File) null), file);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        DeclarationSourcePositionImpl declarationSourcePositionImpl = ((DeclarationSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.DeclarationSourcePositionImpl"));
        setField(declarationSourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        boolean actual = sourcePositionImpl.equals(declarationSourcePositionImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testEquals4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        File file = ((File) createInstance("java.io.File"));
        when(compilationUnitMock.getFile()).thenReturn(file, ((File) null), ((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        DeclarationSourcePositionImpl declarationSourcePositionImpl = ((DeclarationSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.DeclarationSourcePositionImpl"));
        setField(declarationSourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        sourcePositionImpl.equals(declarationSourcePositionImpl);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testEquals5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        File file = ((File) createInstance("java.io.File"));
        when(compilationUnitMock.getFile()).thenReturn(file, file, ((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        DeclarationSourcePositionImpl declarationSourcePositionImpl = ((DeclarationSourcePositionImpl) createInstance("spoon.support.reflect.cu.position.DeclarationSourcePositionImpl"));
        setField(declarationSourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        boolean actual = sourcePositionImpl.equals(declarationSourcePositionImpl);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(29761, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[32];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        intArray[31] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", 0);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(-2147453856, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(28800, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[5];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[3] = 256;
        intArray[4] = 256;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(-2147450973, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(3, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[31];
        intArray[1] = Integer.MIN_VALUE;
        intArray[2] = 1;
        intArray[3] = -2147483646;
        intArray[4] = -2147483646;
        intArray[5] = -2147483646;
        intArray[6] = -2147483646;
        intArray[7] = -2147483646;
        intArray[8] = -2147483646;
        intArray[9] = -2147483646;
        intArray[10] = -2147483646;
        intArray[11] = -2147483646;
        intArray[12] = -2147483646;
        intArray[13] = -2147483646;
        intArray[14] = -2147483646;
        intArray[15] = -2147483646;
        intArray[16] = -2147483646;
        intArray[17] = -2147483646;
        intArray[18] = -2147483646;
        intArray[19] = -2147483646;
        intArray[20] = -2147483646;
        intArray[21] = -2147483646;
        intArray[22] = -2147483646;
        intArray[23] = -2147483646;
        intArray[24] = -2147483646;
        intArray[25] = -2147483646;
        intArray[26] = -2147483646;
        intArray[27] = -2147483646;
        intArray[28] = -2147483646;
        intArray[29] = -2147483646;
        intArray[30] = -2147483646;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", 0);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(-2147453856, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode6() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[11];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 1;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(-2147450973, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(3, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testHashCode7() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[11];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = -2147483647;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.hashCode();
        
        assertEquals(-2147445207, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(9, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testHashCode8() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        File file = ((File) createInstance("java.io.File"));
        when(compilationUnitMock.getFile()).thenReturn(file, ((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[5];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[3] = 256;
        intArray[4] = 256;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        sourcePositionImpl.hashCode();
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(3, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        String actual = sourcePositionImpl.toString();
        
        String expected = new String("(unknown file)");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testToString2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        String actual = sourcePositionImpl.toString();
        
        String expected = new String("(unknown file)");
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Object fileSystemRoot = createInstance("javax.swing.filechooser.FileSystemView$FileSystemRoot");
        when(compilationUnitMock.getFile()).thenReturn(((File) fileSystemRoot), ((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        setField(sourcePositionImpl, "sourceStartline", 0);
        
        sourcePositionImpl.toString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testToString4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Object fileSystemRoot = createInstance("javax.swing.filechooser.FileSystemView$FileSystemRoot");
        when(compilationUnitMock.getFile()).thenReturn(((File) fileSystemRoot), ((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        sourcePositionImpl.toString();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(sourcePositionImpl, "sourceStartline", 0);
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -1073741155;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", -1073741155);
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(1, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(1, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = 1;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(1, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(1, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetLine6() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -2146959360;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStartline", -1);
        setField(sourcePositionImpl, "sourceStart", 1);
        
        int actual = sourcePositionImpl.getLine();
        
        assertEquals(2, actual);
        
        Object finalSourcePositionImplSourceStartline = getFieldValue(sourcePositionImpl, "sourceStartline");
        
        assertEquals(2, finalSourcePositionImplSourceStartline);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndLine1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getEndLine();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndLine2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndLine();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndLine3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -805305983;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", -805305983);
        
        int actual = sourcePositionImpl.getEndLine();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndLine4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = 1;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndLine();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndLine5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -2146959360;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 1);
        
        int actual = sourcePositionImpl.getEndLine();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSourceEnd1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getSourceEnd();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSourceEnd2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getSourceEnd();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSourceStart1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getSourceStart();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSourceStart2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getSourceStart();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidPosition1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        boolean actual = sourcePositionImpl.isValidPosition();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testIsValidPosition2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        boolean actual = sourcePositionImpl.isValidPosition();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[32];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[2] = -2147483646;
        intArray[3] = -2147483646;
        intArray[4] = -2147483646;
        intArray[5] = -2147483646;
        intArray[6] = -2147483646;
        intArray[7] = -2147483646;
        intArray[8] = -2147483646;
        intArray[9] = -2147483646;
        intArray[10] = -2147483646;
        intArray[11] = -2147483646;
        intArray[12] = -2147483646;
        intArray[13] = -2147483646;
        intArray[14] = -2147483646;
        intArray[15] = -2147483646;
        intArray[16] = -2147483646;
        intArray[17] = -2147483646;
        intArray[18] = -2147483646;
        intArray[19] = -2147483646;
        intArray[20] = -2147483646;
        intArray[21] = -2147483646;
        intArray[22] = -2147483646;
        intArray[23] = -2147483646;
        intArray[24] = -2147483646;
        intArray[25] = -2147483646;
        intArray[26] = -2147483646;
        intArray[27] = -2147483646;
        intArray[28] = -2147483646;
        intArray[29] = -2147483646;
        intArray[30] = -2147483646;
        intArray[31] = -2147483646;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[31];
        intArray[1] = Integer.MIN_VALUE;
        intArray[2] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[31];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = -2147483647;
        intArray[2] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 0);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn6() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(((String) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", -2147483647);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn7() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 1);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetColumn8() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", 1);
        
        int actual = sourcePositionImpl.getColumn();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetColumn9() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[2];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = Integer.MIN_VALUE;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceStart", -2147483647);
        
        sourcePositionImpl.getColumn();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[32];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[2] = -2147483646;
        intArray[3] = -2147483646;
        intArray[4] = -2147483646;
        intArray[5] = -2147483646;
        intArray[6] = -2147483646;
        intArray[7] = -2147483646;
        intArray[8] = -2147483646;
        intArray[9] = -2147483646;
        intArray[10] = -2147483646;
        intArray[11] = -2147483646;
        intArray[12] = -2147483646;
        intArray[13] = -2147483646;
        intArray[14] = -2147483646;
        intArray[15] = -2147483646;
        intArray[16] = -2147483646;
        intArray[17] = -2147483646;
        intArray[18] = -2147483646;
        intArray[19] = -2147483646;
        intArray[20] = -2147483646;
        intArray[21] = -2147483646;
        intArray[22] = -2147483646;
        intArray[23] = -2147483646;
        intArray[24] = -2147483646;
        intArray[25] = -2147483646;
        intArray[26] = -2147483646;
        intArray[27] = -2147483646;
        intArray[28] = -2147483646;
        intArray[29] = -2147483646;
        intArray[30] = -2147483646;
        intArray[31] = -2147483646;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[31];
        intArray[1] = Integer.MIN_VALUE;
        intArray[2] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[31];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = -2147483647;
        intArray[2] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 0);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn6() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(((String) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", -2147483647);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn7() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 1);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetEndColumn8() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", 1);
        
        int actual = sourcePositionImpl.getEndColumn();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetEndColumn9() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[2];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = Integer.MIN_VALUE;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        setField(sourcePositionImpl, "sourceEnd", -2147483647);
        
        sourcePositionImpl.getEndColumn();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCompilationUnit1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        CompilationUnit actual = sourcePositionImpl.getCompilationUnit();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCompilationUnit2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        CompilationUnit actual = sourcePositionImpl.getCompilationUnit();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(compilationUnitMock, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFile1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        File actual = sourcePositionImpl.getFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFile2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFile()).thenReturn(((File) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        File actual = sourcePositionImpl.getFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[32];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 1;
        intArray[2] = -2147483646;
        intArray[3] = -2147483646;
        intArray[4] = -2147483646;
        intArray[5] = -2147483646;
        intArray[6] = -2147483646;
        intArray[7] = -2147483646;
        intArray[8] = -2147483646;
        intArray[9] = -2147483646;
        intArray[10] = -2147483646;
        intArray[11] = -2147483646;
        intArray[12] = -2147483646;
        intArray[13] = -2147483646;
        intArray[14] = -2147483646;
        intArray[15] = -2147483646;
        intArray[16] = -2147483646;
        intArray[17] = -2147483646;
        intArray[18] = -2147483646;
        intArray[19] = -2147483646;
        intArray[20] = -2147483646;
        intArray[21] = -2147483646;
        intArray[22] = -2147483646;
        intArray[23] = -2147483646;
        intArray[24] = -2147483646;
        intArray[25] = -2147483646;
        intArray[26] = -2147483646;
        intArray[27] = -2147483646;
        intArray[28] = -2147483646;
        intArray[29] = -2147483646;
        intArray[30] = -2147483646;
        intArray[31] = -2147483646;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSearchColumnNumber4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getFactory()).thenReturn(((Factory) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        try {
            searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSearchColumnNumber5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.getEnvironment()).thenReturn(((Environment) null));
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        try {
            searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSearchColumnNumber6() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        when(factoryMock.getEnvironment()).thenReturn(((Environment) null));
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[2];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = -2147483647;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        try {
            searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber7() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[31];
        intArray[1] = Integer.MIN_VALUE;
        intArray[2] = 1;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        intArray[9] = 2;
        intArray[10] = 2;
        intArray[11] = 2;
        intArray[12] = 2;
        intArray[13] = 2;
        intArray[14] = 2;
        intArray[15] = 2;
        intArray[16] = 2;
        intArray[17] = 2;
        intArray[18] = 2;
        intArray[19] = 2;
        intArray[20] = 2;
        intArray[21] = 2;
        intArray[22] = 2;
        intArray[23] = 2;
        intArray[24] = 2;
        intArray[25] = 2;
        intArray[26] = 2;
        intArray[27] = 2;
        intArray[28] = 2;
        intArray[29] = 2;
        intArray[30] = 2;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 0;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSearchColumnNumber8() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(((String) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 1;
        try {
            searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber9() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(((String) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = -2147483647;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber10() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\t");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 1;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSearchColumnNumber11() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        intArray[0] = Integer.MIN_VALUE;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 1;
        try {
            searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchColumnNumber12() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        Factory factoryMock = mock(Factory.class);
        Environment environmentMock = mock(Environment.class);
        when(environmentMock.getTabulationSize()).thenReturn(0);
        when(factoryMock.getEnvironment()).thenReturn(environmentMock);
        when(compilationUnitMock.getFactory()).thenReturn(factoryMock);
        String string = new String("\u0000");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        int[] intArray = new int[1];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchColumnNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchColumnNumber", intType);
        searchColumnNumberMethod.setAccessible(true);
        java.lang.Object[] searchColumnNumberMethodArguments = new java.lang.Object[1];
        searchColumnNumberMethodArguments[0] = 1;
        int actual = ((int) searchColumnNumberMethod.invoke(sourcePositionImpl, searchColumnNumberMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetSourceDetails1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        sourcePositionImpl.getSourceDetails();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetSourceDetails2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        String string = new String("");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        setField(sourcePositionImpl, "sourceEnd", Integer.MIN_VALUE);
        setField(sourcePositionImpl, "sourceStart", Integer.MIN_VALUE);
        
        sourcePositionImpl.getSourceDetails();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchLineNumber1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchLineNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchLineNumber", intType);
        searchLineNumberMethod.setAccessible(true);
        java.lang.Object[] searchLineNumberMethodArguments = new java.lang.Object[1];
        searchLineNumberMethodArguments[0] = 0;
        int actual = ((int) searchLineNumberMethod.invoke(sourcePositionImpl, searchLineNumberMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchLineNumber2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[0];
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchLineNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchLineNumber", intType);
        searchLineNumberMethod.setAccessible(true);
        java.lang.Object[] searchLineNumberMethodArguments = new java.lang.Object[1];
        searchLineNumberMethodArguments[0] = 0;
        int actual = ((int) searchLineNumberMethod.invoke(sourcePositionImpl, searchLineNumberMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchLineNumber3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -805305983;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchLineNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchLineNumber", intType);
        searchLineNumberMethod.setAccessible(true);
        java.lang.Object[] searchLineNumberMethodArguments = new java.lang.Object[1];
        searchLineNumberMethodArguments[0] = -805305983;
        int actual = ((int) searchLineNumberMethod.invoke(sourcePositionImpl, searchLineNumberMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchLineNumber4() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = 1;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchLineNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchLineNumber", intType);
        searchLineNumberMethod.setAccessible(true);
        java.lang.Object[] searchLineNumberMethodArguments = new java.lang.Object[1];
        searchLineNumberMethodArguments[0] = 0;
        int actual = ((int) searchLineNumberMethod.invoke(sourcePositionImpl, searchLineNumberMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSearchLineNumber5() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        int[] intArray = new int[1];
        intArray[0] = -2146959360;
        setField(sourcePositionImpl, "lineSeparatorPositions", intArray);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method searchLineNumberMethod = sourcePositionImplClazz.getDeclaredMethod("searchLineNumber", intType);
        searchLineNumberMethod.setAccessible(true);
        java.lang.Object[] searchLineNumberMethodArguments = new java.lang.Object[1];
        searchLineNumberMethodArguments[0] = 1;
        int actual = ((int) searchLineNumberMethod.invoke(sourcePositionImpl, searchLineNumberMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFragment1() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method getFragmentMethod = sourcePositionImplClazz.getDeclaredMethod("getFragment", intType, intType);
        getFragmentMethod.setAccessible(true);
        java.lang.Object[] getFragmentMethodArguments = new java.lang.Object[2];
        getFragmentMethodArguments[0] = 0;
        getFragmentMethodArguments[1] = 0;
        try {
            getFragmentMethod.invoke(sourcePositionImpl, getFragmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFragment2() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(((String) null));
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method getFragmentMethod = sourcePositionImplClazz.getDeclaredMethod("getFragment", intType, intType);
        getFragmentMethod.setAccessible(true);
        java.lang.Object[] getFragmentMethodArguments = new java.lang.Object[2];
        getFragmentMethodArguments[0] = Integer.MIN_VALUE;
        getFragmentMethodArguments[1] = Integer.MIN_VALUE;
        try {
            getFragmentMethod.invoke(sourcePositionImpl, getFragmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFragment3() throws Throwable  {
        SourcePositionImpl sourcePositionImpl = ((SourcePositionImpl) createInstance("spoon.support.reflect.cu.position.SourcePositionImpl"));
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        String string = new String("");
        when(compilationUnitMock.getOriginalSourceCode()).thenReturn(string);
        setField(sourcePositionImpl, "compilationUnit", compilationUnitMock);
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intType = int.class;
        Method getFragmentMethod = sourcePositionImplClazz.getDeclaredMethod("getFragment", intType, intType);
        getFragmentMethod.setAccessible(true);
        java.lang.Object[] getFragmentMethodArguments = new java.lang.Object[2];
        getFragmentMethodArguments[0] = Integer.MIN_VALUE;
        getFragmentMethodArguments[1] = Integer.MIN_VALUE;
        try {
            getFragmentMethod.invoke(sourcePositionImpl, getFragmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckArgsAreAscending1() throws Throwable  {
        int[] intArray = new int[0];
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = ((Object) intArray);
        checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckArgsAreAscending2() throws Throwable  {
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = null;
        try {
            checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckArgsAreAscending3() throws Throwable  {
        int[] intArray = new int[0];
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = ((Object) intArray);
        checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckArgsAreAscending4() throws Throwable  {
        int[] intArray = new int[9];
        intArray[0] = Integer.MIN_VALUE;
        intArray[1] = 9;
        intArray[2] = 9;
        intArray[3] = 9;
        intArray[4] = 9;
        intArray[5] = 9;
        intArray[6] = 9;
        intArray[7] = 9;
        intArray[8] = 9;
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = ((Object) intArray);
        try {
            checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testCheckArgsAreAscending5() throws Throwable  {
        int[] intArray = new int[1];
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = ((Object) intArray);
        checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCheckArgsAreAscending6() throws Throwable  {
        int[] intArray = new int[9];
        intArray[0] = 1;
        intArray[2] = 4;
        intArray[3] = 4;
        intArray[4] = 4;
        intArray[5] = 4;
        intArray[6] = 4;
        intArray[7] = 4;
        intArray[8] = 4;
        
        Class sourcePositionImplClazz = Class.forName("spoon.support.reflect.cu.position.SourcePositionImpl");
        Class intArrayType = Class.forName("[I");
        Method checkArgsAreAscendingMethod = sourcePositionImplClazz.getDeclaredMethod("checkArgsAreAscending", intArrayType);
        checkArgsAreAscendingMethod.setAccessible(true);
        java.lang.Object[] checkArgsAreAscendingMethodArguments = new java.lang.Object[1];
        checkArgsAreAscendingMethodArguments[0] = ((Object) intArray);
        try {
            checkArgsAreAscendingMethod.invoke(null, checkArgsAreAscendingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSourcePositionImpl1() {
        int[] intArray = new int[0];
        SourcePositionImpl actual = new SourcePositionImpl(null, 0, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSourcePositionImpl2() {
        int[] intArray = new int[9];
        new SourcePositionImpl(null, Integer.MIN_VALUE, 0, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSourcePositionImpl3() {
        int[] intArray = new int[9];
        new SourcePositionImpl(null, 0, Integer.MAX_VALUE, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSourcePositionImpl4() {
        int[] intArray = new int[9];
        new SourcePositionImpl(null, 3, 1, intArray);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testSourcePositionImpl5() throws Throwable  {
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        int[] intArray = new int[9];
        SourcePositionImpl actual = new SourcePositionImpl(compilationUnitMock, 0, 0, intArray);
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
