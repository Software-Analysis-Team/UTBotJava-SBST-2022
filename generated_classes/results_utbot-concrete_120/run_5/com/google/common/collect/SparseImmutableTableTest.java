package com.google.common.collect;

import org.junit.Test;
import com.google.common.primitives.Bytes;
import com.google.common.collect.ImmutableMapEntry.NonTerminalImmutableBiMapEntry;
import com.google.common.collect.ImmutableMapEntry;
import java.lang.reflect.Constructor;
import com.google.common.base.Preconditions;
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

public class SparseImmutableTableTest {
    ///region
    
    @Test(timeout = 10000)
    public void testColumnMap1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        setField(sparseImmutableTable, "columnMap", regularImmutableMap);
        
        ImmutableMap actual = sparseImmutableTable.columnMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(regularImmutableMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testColumnMap2() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        ImmutableEnumMap immutableEnumMap = ((ImmutableEnumMap) createInstance("com.google.common.collect.ImmutableEnumMap"));
        setField(sparseImmutableTable, "columnMap", immutableEnumMap);
        
        ImmutableMap actual = sparseImmutableTable.columnMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(immutableEnumMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testColumnMap3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        JdkBackedImmutableMap jdkBackedImmutableMap = ((JdkBackedImmutableMap) createInstance("com.google.common.collect.JdkBackedImmutableMap"));
        setField(sparseImmutableTable, "columnMap", jdkBackedImmutableMap);
        
        ImmutableMap actual = sparseImmutableTable.columnMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jdkBackedImmutableMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testColumnMap4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        SingletonImmutableBiMap singletonImmutableBiMap = ((SingletonImmutableBiMap) createInstance("com.google.common.collect.SingletonImmutableBiMap"));
        setField(sparseImmutableTable, "columnMap", singletonImmutableBiMap);
        
        ImmutableMap actual = sparseImmutableTable.columnMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(singletonImmutableBiMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRowMap1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        setField(sparseImmutableTable, "rowMap", regularImmutableMap);
        
        ImmutableMap actual = sparseImmutableTable.rowMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(regularImmutableMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRowMap2() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        ImmutableEnumMap immutableEnumMap = ((ImmutableEnumMap) createInstance("com.google.common.collect.ImmutableEnumMap"));
        setField(sparseImmutableTable, "rowMap", immutableEnumMap);
        
        ImmutableMap actual = sparseImmutableTable.rowMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(immutableEnumMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRowMap3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        JdkBackedImmutableMap jdkBackedImmutableMap = ((JdkBackedImmutableMap) createInstance("com.google.common.collect.JdkBackedImmutableMap"));
        setField(sparseImmutableTable, "rowMap", jdkBackedImmutableMap);
        
        ImmutableMap actual = sparseImmutableTable.rowMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(jdkBackedImmutableMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRowMap4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        SingletonImmutableBiMap singletonImmutableBiMap = ((SingletonImmutableBiMap) createInstance("com.google.common.collect.SingletonImmutableBiMap"));
        setField(sparseImmutableTable, "rowMap", singletonImmutableBiMap);
        
        ImmutableMap actual = sparseImmutableTable.rowMap();
        
        
        // Current deep equals depth exceeds max depth 0
        assertTrue(deepEquals(singletonImmutableBiMap, actual));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        Object jumboEnumSet = createInstance("java.util.JumboEnumSet");
        setField(jumboEnumSet, "size", Integer.MIN_VALUE);
        setField(immutableEnumSet, "delegate", jumboEnumSet);
        setField(regularImmutableMap, "keySet", immutableEnumSet);
        setField(sparseImmutableTable, "columnMap", regularImmutableMap);
        
        sparseImmutableTable.createSerializedForm();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm2() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        Object jumboEnumSet = createInstance("java.util.JumboEnumSet");
        setField(jumboEnumSet, "size", 9);
        long[] longArray = new long[0];
        setField(jumboEnumSet, "elements", longArray);
        setField(immutableEnumSet, "delegate", jumboEnumSet);
        setField(regularImmutableMap, "keySet", immutableEnumSet);
        setField(sparseImmutableTable, "columnMap", regularImmutableMap);
        
        sparseImmutableTable.createSerializedForm();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        RegularImmutableSet regularImmutableSet = ((RegularImmutableSet) createInstance("com.google.common.collect.RegularImmutableSet"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        setField(regularImmutableSet, "elements", objectArray);
        setField(regularImmutableMap, "keySet", regularImmutableSet);
        setField(sparseImmutableTable, "columnMap", regularImmutableMap);
        
        sparseImmutableTable.createSerializedForm();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        ImmutableEnumMap immutableEnumMap = ((ImmutableEnumMap) createInstance("com.google.common.collect.ImmutableEnumMap"));
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        Object jumboEnumSet = createInstance("java.util.JumboEnumSet");
        setField(jumboEnumSet, "size", Integer.MIN_VALUE);
        setField(immutableEnumSet, "delegate", jumboEnumSet);
        setField(immutableEnumMap, "keySet", immutableEnumSet);
        setField(sparseImmutableTable, "columnMap", immutableEnumMap);
        
        sparseImmutableTable.createSerializedForm();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm5() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        RegularImmutableSet regularImmutableSet = ((RegularImmutableSet) createInstance("com.google.common.collect.RegularImmutableSet"));
        java.lang.Object[] objectArray = new java.lang.Object[0];
        setField(regularImmutableSet, "elements", objectArray);
        setField(regularImmutableMap, "keySet", regularImmutableSet);
        setField(sparseImmutableTable, "columnMap", regularImmutableMap);
        
        sparseImmutableTable.createSerializedForm();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        
        sparseImmutableTable.getValue(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue2() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        
        sparseImmutableTable.getValue(536870912);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        intArray[1] = 2;
        intArray[2] = 2;
        intArray[3] = 2;
        intArray[4] = 2;
        intArray[5] = 2;
        intArray[6] = 2;
        intArray[7] = 2;
        intArray[8] = 2;
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        RegularImmutableAsList regularImmutableAsList = ((RegularImmutableAsList) createInstance("com.google.common.collect.RegularImmutableAsList"));
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        com.google.common.primitives.Bytes[] bytesArray = new com.google.common.primitives.Bytes[0];
        objectArray[0] = ((Object) bytesArray);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        objectArray[7] = objectArray;
        objectArray[8] = objectArray;
        setField(regularImmutableList, "array", objectArray);
        setField(regularImmutableAsList, "delegateList", regularImmutableList);
        setField(immutableSortedMap, "valueList", regularImmutableAsList);
        setField(sparseImmutableTable, "rowMap", immutableSortedMap);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        JdkBackedImmutableMap jdkBackedImmutableMap = ((JdkBackedImmutableMap) createInstance("com.google.common.collect.JdkBackedImmutableMap"));
        Object entrySet = createInstance("com.google.common.collect.ImmutableSetMultimap$EntrySet");
        setField(jdkBackedImmutableMap, "values", entrySet);
        setField(sparseImmutableTable, "rowMap", jdkBackedImmutableMap);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue5() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        JdkBackedImmutableMap jdkBackedImmutableMap = ((JdkBackedImmutableMap) createInstance("com.google.common.collect.JdkBackedImmutableMap"));
        Object stringAsImmutableList = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        setField(jdkBackedImmutableMap, "values", stringAsImmutableList);
        setField(sparseImmutableTable, "rowMap", jdkBackedImmutableMap);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue6() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        intArray1[1] = 19;
        intArray1[2] = 19;
        intArray1[3] = 19;
        intArray1[4] = 19;
        intArray1[5] = 19;
        intArray1[6] = 19;
        intArray1[7] = 19;
        intArray1[8] = 19;
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(immutableSortedMap, "values", null);
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        Object complementRanges = createInstance("com.google.common.collect.ImmutableRangeSet$ComplementRanges");
        setField(regularImmutableMap, "values", complementRanges);
        objectArray[0] = ((Object) regularImmutableMap);
        setField(regularImmutableList, "array", objectArray);
        setField(immutableSortedMap, "valueList", regularImmutableList);
        setField(sparseImmutableTable, "rowMap", immutableSortedMap);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        
        sparseImmutableTable.getCell(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell2() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        
        sparseImmutableTable.getCell(536870912);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        intArray[1] = 19;
        intArray[2] = 19;
        intArray[3] = 19;
        intArray[4] = 19;
        intArray[5] = 19;
        intArray[6] = 19;
        intArray[7] = 19;
        intArray[8] = 19;
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        ImmutableSortedAsList immutableSortedAsList = ((ImmutableSortedAsList) createInstance("com.google.common.collect.ImmutableSortedAsList"));
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        java.lang.Object[] directLongBufferRSArray = createArray("java.nio.DirectLongBufferRS", 0);
        objectArray[0] = directLongBufferRSArray;
        setField(regularImmutableList, "array", objectArray);
        setField(immutableSortedAsList, "delegateList", regularImmutableList);
        setField(immutableEnumSet, "asList", immutableSortedAsList);
        setField(immutableSortedMap, "entrySet", immutableEnumSet);
        setField(sparseImmutableTable, "rowMap", immutableSortedMap);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        intArray1[1] = 1945;
        intArray1[2] = 1945;
        intArray1[3] = 1945;
        intArray1[4] = 1945;
        intArray1[5] = 1945;
        intArray1[6] = 1945;
        intArray1[7] = 1945;
        intArray1[8] = 1945;
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        Object rowMap = createInstance("com.google.common.collect.DenseImmutableTable$RowMap");
        Object cellSet = createInstance("com.google.common.collect.RegularImmutableTable$CellSet");
        RegularImmutableAsList regularImmutableAsList = ((RegularImmutableAsList) createInstance("com.google.common.collect.RegularImmutableAsList"));
        RegularImmutableAsList regularImmutableAsList1 = ((RegularImmutableAsList) createInstance("com.google.common.collect.RegularImmutableAsList"));
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        Object entrySet = createInstance("com.google.common.collect.ImmutableSetMultimap$EntrySet");
        setField(entrySet, "asList", null);
        setField(immutableSortedMap, "entrySet", entrySet);
        setField(attributeEntry, "value", immutableSortedMap);
        objectArray[0] = attributeEntry;
        setField(regularImmutableList, "array", objectArray);
        setField(regularImmutableAsList1, "delegateList", regularImmutableList);
        setField(regularImmutableAsList, "delegateList", regularImmutableAsList1);
        setField(cellSet, "asList", regularImmutableAsList);
        setField(rowMap, "entrySet", cellSet);
        setField(sparseImmutableTable, "rowMap", rowMap);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell5() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        intArray1[1] = 8192;
        intArray1[2] = 8192;
        intArray1[3] = 8192;
        intArray1[4] = 8192;
        intArray1[5] = 8192;
        intArray1[6] = 8192;
        intArray1[7] = 8192;
        intArray1[8] = 8192;
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        Object cellSet = createInstance("com.google.common.collect.RegularImmutableTable$CellSet");
        ImmutableSortedAsList immutableSortedAsList = ((ImmutableSortedAsList) createInstance("com.google.common.collect.ImmutableSortedAsList"));
        RegularImmutableAsList regularImmutableAsList = ((RegularImmutableAsList) createInstance("com.google.common.collect.RegularImmutableAsList"));
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        ImmutableSortedMap immutableSortedMap1 = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(immutableSortedMap1, "entrySet", null);
        setField(attributeEntry, "value", immutableSortedMap1);
        objectArray[0] = attributeEntry;
        objectArray[1] = ((Object) immutableSortedMap);
        objectArray[2] = ((Object) immutableSortedMap);
        objectArray[3] = ((Object) immutableSortedMap);
        objectArray[4] = ((Object) immutableSortedMap);
        objectArray[5] = ((Object) immutableSortedMap);
        objectArray[6] = ((Object) immutableSortedMap);
        objectArray[7] = ((Object) immutableSortedMap);
        objectArray[8] = ((Object) immutableSortedMap);
        setField(regularImmutableList, "array", objectArray);
        setField(regularImmutableAsList, "delegateList", regularImmutableList);
        setField(immutableSortedAsList, "delegateList", regularImmutableAsList);
        setField(cellSet, "asList", immutableSortedAsList);
        setField(immutableSortedMap, "entrySet", cellSet);
        setField(sparseImmutableTable, "rowMap", immutableSortedMap);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell6() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[1];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        Object entrySet = createInstance("com.google.common.collect.ImmutableSetMultimap$EntrySet");
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        ImmutableMapEntry.NonTerminalImmutableBiMapEntry nonTerminalImmutableBiMapEntry = ((ImmutableMapEntry.NonTerminalImmutableBiMapEntry) createInstance("com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry"));
        ImmutableSortedMap immutableSortedMap1 = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        SingletonImmutableSet singletonImmutableSet = ((SingletonImmutableSet) createInstance("com.google.common.collect.SingletonImmutableSet"));
        setField(singletonImmutableSet, "asList", null);
        setField(immutableSortedMap1, "entrySet", singletonImmutableSet);
        setField(nonTerminalImmutableBiMapEntry, "value", immutableSortedMap1);
        objectArray[0] = ((Object) nonTerminalImmutableBiMapEntry);
        setField(regularImmutableList, "array", objectArray);
        setField(entrySet, "asList", regularImmutableList);
        setField(immutableSortedMap, "entrySet", entrySet);
        setField(sparseImmutableTable, "rowMap", immutableSortedMap);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell7() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[1];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        Object column = createInstance("com.google.common.collect.DenseImmutableTable$Column");
        Object entrySet = createInstance("com.google.common.collect.ImmutableMultiset$EntrySet");
        RegularImmutableList regularImmutableList = ((RegularImmutableList) createInstance("com.google.common.collect.RegularImmutableList"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        RegularImmutableMap regularImmutableMap = ((RegularImmutableMap) createInstance("com.google.common.collect.RegularImmutableMap"));
        setField(regularImmutableMap, "entrySet", null);
        setField(attributeEntry, "value", regularImmutableMap);
        objectArray[0] = attributeEntry;
        setField(regularImmutableList, "array", objectArray);
        setField(entrySet, "asList", regularImmutableList);
        setField(column, "entrySet", entrySet);
        setField(sparseImmutableTable, "rowMap", column);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable1() {
        new SparseImmutableTable(null, null, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable2() throws Throwable  {
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        Object jumboEnumSet = createInstance("java.util.JumboEnumSet");
        setField(jumboEnumSet, "size", Integer.MIN_VALUE);
        setField(immutableEnumSet, "delegate", jumboEnumSet);
        new SparseImmutableTable(null, immutableEnumSet, null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable3() throws Throwable  {
        ImmutableEnumSet immutableEnumSet = ((ImmutableEnumSet) createInstance("com.google.common.collect.ImmutableEnumSet"));
        Object jumboEnumSet = createInstance("java.util.JumboEnumSet");
        setField(jumboEnumSet, "size", 9);
        long[] longArray = new long[0];
        setField(jumboEnumSet, "elements", longArray);
        setField(immutableEnumSet, "delegate", jumboEnumSet);
        Object entrySet = createInstance("com.google.common.collect.ImmutableMultiset$EntrySet");
        Class sparseImmutableTableClazz = Class.forName("com.google.common.collect.SparseImmutableTable");
        Class immutableListType = Class.forName("com.google.common.collect.ImmutableList");
        Class immutableEnumSetType = Class.forName("com.google.common.collect.ImmutableSet");
        Constructor sparseImmutableTableConstructor = sparseImmutableTableClazz.getDeclaredConstructor(immutableListType, immutableEnumSetType, immutableEnumSetType);
        sparseImmutableTableConstructor.setAccessible(true);
        java.lang.Object[] sparseImmutableTableConstructorArguments = new java.lang.Object[3];
        sparseImmutableTableConstructorArguments[0] = null;
        sparseImmutableTableConstructorArguments[1] = immutableEnumSet;
        sparseImmutableTableConstructorArguments[2] = entrySet;
        sparseImmutableTableConstructor.newInstance(sparseImmutableTableConstructorArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable4() throws Throwable  {
        Object inverseEntries = createInstance("com.google.common.collect.JdkBackedImmutableBiMap$InverseEntries");
        RegularImmutableSet regularImmutableSet = ((RegularImmutableSet) createInstance("com.google.common.collect.RegularImmutableSet"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Preconditions preconditions = ((Preconditions) createInstance("com.google.common.base.Preconditions"));
        objectArray[1] = ((Object) preconditions);
        objectArray[2] = ((Object) preconditions);
        objectArray[3] = ((Object) preconditions);
        objectArray[4] = ((Object) preconditions);
        objectArray[5] = ((Object) preconditions);
        objectArray[6] = ((Object) preconditions);
        objectArray[7] = ((Object) preconditions);
        objectArray[8] = ((Object) preconditions);
        setField(regularImmutableSet, "elements", objectArray);
        Class sparseImmutableTableClazz = Class.forName("com.google.common.collect.SparseImmutableTable");
        Class inverseEntriesType = Class.forName("com.google.common.collect.ImmutableList");
        Class regularImmutableSetType = Class.forName("com.google.common.collect.ImmutableSet");
        Constructor sparseImmutableTableConstructor = sparseImmutableTableClazz.getDeclaredConstructor(inverseEntriesType, regularImmutableSetType, regularImmutableSetType);
        sparseImmutableTableConstructor.setAccessible(true);
        java.lang.Object[] sparseImmutableTableConstructorArguments = new java.lang.Object[3];
        sparseImmutableTableConstructorArguments[0] = inverseEntries;
        sparseImmutableTableConstructorArguments[1] = regularImmutableSet;
        sparseImmutableTableConstructorArguments[2] = null;
        sparseImmutableTableConstructor.newInstance(sparseImmutableTableConstructorArguments);
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
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
