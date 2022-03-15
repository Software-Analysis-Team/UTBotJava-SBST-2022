package com.google.common.collect;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import sun.net.www.http.ChunkedInputStream;
import java.text.AttributedCharacterIterator.Attribute;
import java.text.AttributedCharacterIterator;
import java.text.CollationElementIterator;
import com.google.common.collect.Table.Cell;
import com.google.common.collect.Table;
import java.text.MessageFormat.Field;
import java.text.MessageFormat;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractMap;
import com.google.common.cache.RemovalNotification;
import java.util.LinkedHashMap;
import java.io.InvalidClassException;
import com.google.common.collect.Tables.ImmutableCell;
import com.google.common.collect.Tables;
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

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.Assert.assertTrue;

public class SparseImmutableTableTest {
    ///region
    
    @Test(timeout = 10000)
    public void testSize1() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        
        int actual = sparseImmutableTable.size();
        
        assertEquals(9, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testRowMap1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ImmutableMap.class);
            mockedStatic.when(() -> {
                ImmutableMap.copyOf(any(Map.class));
            }).thenReturn(((ImmutableMap) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            setField(sparseImmutableTable, "rowMap", immutableMapMock);
            
            ImmutableMap actual = sparseImmutableTable.rowMap();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testColumnMap1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ImmutableMap.class);
            mockedStatic.when(() -> {
                ImmutableMap.copyOf(any(Map.class));
            }).thenReturn(((ImmutableMap) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            setField(sparseImmutableTable, "columnMap", immutableMapMock);
            
            ImmutableMap actual = sparseImmutableTable.columnMap();
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm1() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        try {
            mockedStatic = mockStatic(ImmutableMap.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            when(immutableMapMock.keySet()).thenReturn(((ImmutableSet) null));
            mockedStatic.when(() -> {
                ImmutableMap.copyOf(any(Map.class));
            }).thenReturn(immutableMapMock);
            mockedStatic1 = mockStatic(Maps.class);
            mockedStatic1.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            setField(sparseImmutableTable, "cellSet", linkedHashSet);
            ImmutableMap immutableMapMock1 = mock(ImmutableMap.class);
            setField(sparseImmutableTable, "columnMap", immutableMapMock1);
            
            sparseImmutableTable.createSerializedForm();
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(ImmutableMap.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            when(immutableMapMock.keySet()).thenReturn(((ImmutableSet) null));
            mockedStatic.when(() -> {
                ImmutableMap.copyOf(any(Map.class));
            }).thenReturn(immutableMapMock);
            mockedStatic1 = mockStatic(Maps.class);
            mockedStatic1.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic2 = mockStatic(ImmutableSet.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            mockedStatic2.when(ImmutableSet::of).thenReturn(immutableSetMock);
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            setField(sparseImmutableTable, "cellSet", null);
            int[] intArray = new int[0];
            setField(sparseImmutableTable, "cellRowIndices", intArray);
            ImmutableMap immutableMapMock1 = mock(ImmutableMap.class);
            setField(sparseImmutableTable, "columnMap", immutableMapMock1);
            
            Object initialSparseImmutableTableCellSet = getFieldValue(sparseImmutableTable, "cellSet");
            
            sparseImmutableTable.createSerializedForm();
            
            Object finalSparseImmutableTableCellSet = getFieldValue(sparseImmutableTable, "cellSet");
            
            assertFalse(initialSparseImmutableTableCellSet == finalSparseImmutableTableCellSet);
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testCreateSerializedForm3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        org.mockito.MockedStatic mockedStatic1 = null;
        org.mockito.MockedStatic mockedStatic2 = null;
        try {
            mockedStatic = mockStatic(ImmutableMap.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            when(immutableMapMock.keySet()).thenReturn(((ImmutableSet) null));
            mockedStatic.when(() -> {
                ImmutableMap.copyOf(any(Map.class));
            }).thenReturn(immutableMapMock);
            mockedStatic1 = mockStatic(Maps.class);
            mockedStatic1.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic2 = mockStatic(ImmutableSet.class);
            mockedStatic2.when(ImmutableSet::of).thenReturn(((ImmutableSet) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            setField(sparseImmutableTable, "cellSet", null);
            int[] intArray = new int[0];
            setField(sparseImmutableTable, "cellRowIndices", intArray);
            ImmutableMap immutableMapMock1 = mock(ImmutableMap.class);
            when(immutableMapMock1.copyOf(any(Map.class))).thenReturn(immutableMapMock);
            setField(sparseImmutableTable, "columnMap", immutableMapMock1);
            
            sparseImmutableTable.createSerializedForm();
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
        }
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
        
        sparseImmutableTable.getValue(134217728);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[1];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        when(immutableListMock.get(anyInt())).thenReturn(((Object) abortPolicyArray));
        when(immutableCollectionMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        when(immutableCollectionMock.asList()).thenReturn(((ImmutableList) null));
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue5() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        when(immutableMapMock.values()).thenReturn(((ImmutableCollection) null));
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue6() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[32];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[33];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        when(immutableListMock.get(anyInt())).thenReturn(null);
        when(immutableCollectionMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(32);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue7() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        when(immutableListMock.get(anyInt())).thenReturn(null);
        when(immutableCollectionMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetValue8() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableList immutableListMock1 = mock(ImmutableList.class);
        when(immutableListMock1.asList()).thenReturn(((ImmutableList) null));
        setField(immutableSortedMap, "valueList", immutableListMock1);
        when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableSortedMap));
        when(immutableCollectionMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getValue(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetValue9() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableCollection immutableCollectionMock = mock(ImmutableCollection.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableList immutableListMock1 = mock(ImmutableList.class);
        ImmutableList immutableListMock2 = mock(ImmutableList.class);
        when(immutableListMock2.get(anyInt())).thenReturn(((Object) immutableSortedMap), null);
        when(immutableListMock1.asList()).thenReturn(immutableListMock2);
        setField(immutableSortedMap, "valueList", immutableListMock1);
        when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableSortedMap), null);
        when(immutableCollectionMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.values()).thenReturn(immutableCollectionMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        Object actual = sparseImmutableTable.getValue(0);
        
        assertNull(actual);
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
        
        sparseImmutableTable.getCell(134217728);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell3() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[17];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        when(immutableListMock.get(anyInt())).thenReturn(((Object) abortPolicyArray));
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell4() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        when(immutableSetMock.asList()).thenReturn(((ImmutableList) null));
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell5() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        when(immutableMapMock.entrySet()).thenReturn(((ImmutableSet) null));
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell6() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        when(immutableListMock.get(anyInt())).thenReturn(null);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell7() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        setField(attributeEntry, "value", abortPolicyArray);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell8() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[33];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        setField(attributeEntry, "value", null);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(32);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell9() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        setField(attributeEntry, "value", null);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell10() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
        when(immutableSetMock1.asList()).thenReturn(((ImmutableList) null));
        setField(immutableSortedMap, "entrySet", immutableSetMock1);
        setField(attributeEntry, "value", immutableSortedMap);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(immutableMapMock, "entrySet", null);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell11() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
        ImmutableList immutableListMock1 = mock(ImmutableList.class);
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        when(immutableListMock1.get(anyInt())).thenReturn(attributeEntry, ((Object) abortPolicyArray));
        when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
        setField(immutableSortedMap, "entrySet", immutableSetMock1);
        setField(attributeEntry, "value", immutableSortedMap);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry, ((Object) abortPolicyArray));
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(immutableMapMock, "entrySet", null);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell12() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
        ImmutableList immutableListMock1 = mock(ImmutableList.class);
        when(immutableListMock1.get(anyInt())).thenReturn(attributeEntry, null);
        when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
        setField(immutableSortedMap, "entrySet", immutableSetMock1);
        setField(attributeEntry, "value", immutableSortedMap);
        setField(attributeEntry, "key", null);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry, null);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(immutableMapMock, "entrySet", null);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell13() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        ImmutableEntry immutableEntry = ((ImmutableEntry) createInstance("com.google.common.collect.ImmutableEntry"));
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        setField(immutableEntry, "value", abortPolicyArray);
        when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableEntry));
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell14() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        Object inverse = createInstance("com.google.common.collect.RegularImmutableBiMap$Inverse");
        ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
        when(immutableSetMock1.asList()).thenReturn(((ImmutableList) null));
        setField(inverse, "entrySet", immutableSetMock1);
        setField(attributeEntry, "value", inverse);
        when(immutableListMock.get(anyInt())).thenReturn(attributeEntry);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(immutableMapMock, "entrySet", null);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell15() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
        int[] intArray1 = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray1);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        ImmutableEntry immutableEntry = ((ImmutableEntry) createInstance("com.google.common.collect.ImmutableEntry"));
        ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
        ImmutableList immutableListMock1 = mock(ImmutableList.class);
        when(immutableListMock1.get(anyInt())).thenReturn(((Object) immutableEntry), null);
        when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
        setField(immutableSortedMap, "entrySet", immutableSetMock1);
        setField(immutableEntry, "value", immutableSortedMap);
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        setField(immutableEntry, "key", abortPolicyArray);
        when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableEntry), null);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(immutableMapMock, "entrySet", null);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCell16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ImmutableTable.class);
            mockedStatic.when(() -> {
                ImmutableTable.cellOf(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
            }).thenReturn(((Table.Cell) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            int[] intArray = new int[9];
            setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
            int[] intArray1 = new int[9];
            setField(sparseImmutableTable, "cellRowIndices", intArray1);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            ImmutableEntry immutableEntry = ((ImmutableEntry) createInstance("com.google.common.collect.ImmutableEntry"));
            ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            ImmutableList immutableListMock1 = mock(ImmutableList.class);
            Object attributeEntry = createInstance("java.text.AttributeEntry");
            sun.net.www.http.ChunkedInputStream[] chunkedInputStreamArray = new sun.net.www.http.ChunkedInputStream[0];
            setField(attributeEntry, "value", chunkedInputStreamArray);
            AttributedCharacterIterator.Attribute attribute = ((AttributedCharacterIterator.Attribute) createInstance("java.text.AttributedCharacterIterator$Attribute"));
            setField(attributeEntry, "key", attribute);
            when(immutableListMock1.get(anyInt())).thenReturn(attributeEntry);
            when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
            setField(immutableSortedMap, "entrySet", immutableSetMock1);
            setField(immutableEntry, "value", immutableSortedMap);
            java.text.CollationElementIterator[] collationElementIteratorArray = new java.text.CollationElementIterator[0];
            setField(immutableEntry, "key", collationElementIteratorArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableEntry));
            when(immutableSetMock.asList()).thenReturn(immutableListMock);
            when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
            setField(immutableMapMock, "entrySet", null);
            setField(sparseImmutableTable, "rowMap", immutableMapMock);
            
            Table.Cell actual = sparseImmutableTable.getCell(0);
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCell17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ImmutableTable.class);
            mockedStatic.when(() -> {
                ImmutableTable.cellOf(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
            }).thenReturn(((Table.Cell) null));
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            int[] intArray = new int[1];
            setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
            int[] intArray1 = new int[9];
            setField(sparseImmutableTable, "cellRowIndices", intArray1);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            Object attributeEntry = createInstance("java.text.AttributeEntry");
            Object inverse = createInstance("com.google.common.collect.RegularImmutableBiMap$Inverse");
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            ImmutableList immutableListMock1 = mock(ImmutableList.class);
            ImmutableEntry immutableEntry = ((ImmutableEntry) createInstance("com.google.common.collect.ImmutableEntry"));
            java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
            setField(immutableEntry, "value", abortPolicyArray);
            sun.net.www.http.ChunkedInputStream[] chunkedInputStreamArray = new sun.net.www.http.ChunkedInputStream[0];
            setField(immutableEntry, "key", chunkedInputStreamArray);
            when(immutableListMock1.get(anyInt())).thenReturn(attributeEntry, ((Object) immutableEntry));
            when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
            setField(inverse, "entrySet", immutableSetMock1);
            setField(attributeEntry, "value", inverse);
            MessageFormat.Field field = ((MessageFormat.Field) createInstance("java.text.MessageFormat$Field"));
            setField(attributeEntry, "key", field);
            when(immutableListMock.get(anyInt())).thenReturn(attributeEntry, ((Object) immutableEntry));
            when(immutableSetMock.asList()).thenReturn(immutableListMock);
            when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
            setField(immutableMapMock, "entrySet", null);
            setField(sparseImmutableTable, "rowMap", immutableMapMock);
            
            Table.Cell actual = sparseImmutableTable.getCell(0);
            
            assertNull(actual);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetCell18() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(ImmutableTable.class);
            Table.Cell cellMock = mock(Table.Cell.class);
            mockedStatic.when(() -> {
                ImmutableTable.cellOf(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
            }).thenReturn(cellMock);
            SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
            int[] intArray = new int[9];
            setField(sparseImmutableTable, "cellColumnInRowIndices", intArray);
            setField(sparseImmutableTable, "cellRowIndices", intArray);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            Object attributeEntry = createInstance("java.text.AttributeEntry");
            ImmutableSortedMap immutableSortedMap = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            ImmutableList immutableListMock1 = mock(ImmutableList.class);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = ((AbstractMap.SimpleImmutableEntry) createInstance("java.util.AbstractMap$SimpleImmutableEntry"));
            java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
            setField(simpleImmutableEntry, "value", abortPolicyArray);
            setField(simpleImmutableEntry, "key", abortPolicyArray);
            when(immutableListMock1.get(anyInt())).thenReturn(attributeEntry, ((Object) simpleImmutableEntry));
            when(immutableSetMock1.asList()).thenReturn(immutableListMock1);
            setField(immutableSortedMap, "entrySet", immutableSetMock1);
            setField(attributeEntry, "value", immutableSortedMap);
            setField(attributeEntry, "key", null);
            when(immutableListMock.get(anyInt())).thenReturn(attributeEntry, ((Object) simpleImmutableEntry));
            when(immutableSetMock.asList()).thenReturn(immutableListMock);
            when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
            setField(immutableMapMock, "entrySet", null);
            setField(sparseImmutableTable, "rowMap", immutableMapMock);
            
            Table.Cell actual = sparseImmutableTable.getCell(0);
            
            
            // Current deep equals depth exceeds max depth 0
            assertTrue(deepEquals(cellMock, actual));
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell19() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        RemovalNotification removalNotification = ((RemovalNotification) createInstance("com.google.common.cache.RemovalNotification"));
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        setField(removalNotification, "value", abortPolicyArray);
        when(immutableListMock.get(anyInt())).thenReturn(((Object) removalNotification));
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
        sparseImmutableTable.getCell(0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetCell20() throws Throwable  {
        SparseImmutableTable sparseImmutableTable = ((SparseImmutableTable) createInstance("com.google.common.collect.SparseImmutableTable"));
        int[] intArray = new int[9];
        setField(sparseImmutableTable, "cellRowIndices", intArray);
        ImmutableMap immutableMapMock = mock(ImmutableMap.class);
        ImmutableSet immutableSetMock = mock(ImmutableSet.class);
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object node = createInstance("java.util.concurrent.ConcurrentHashMap$Node");
        java.util.concurrent.ThreadPoolExecutor.AbortPolicy[] abortPolicyArray = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy[0];
        setField(node, "val", abortPolicyArray);
        when(immutableListMock.get(anyInt())).thenReturn(node);
        when(immutableSetMock.asList()).thenReturn(immutableListMock);
        when(immutableMapMock.entrySet()).thenReturn(immutableSetMock);
        setField(sparseImmutableTable, "rowMap", immutableMapMock);
        
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
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null));
            new SparseImmutableTable(null, null, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable3() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            when(immutableSetMock.iterator()).thenReturn(((UnmodifiableIterator) null));
            new SparseImmutableTable(null, immutableSetMock, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable4() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(linkedHashMap, ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, null);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, ((UnmodifiableIterator) null));
            new SparseImmutableTable(null, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(Integer.MIN_VALUE);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(null, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, Integer.MIN_VALUE);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(linkedHashMap, linkedHashMap);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, 9, 1);
            when(immutableListMock.get(anyInt())).thenReturn(null);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable10() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, 9, 1);
            InvalidClassException invalidClassException = ((InvalidClassException) createInstance("java.io.InvalidClassException"));
            when(immutableListMock.get(anyInt())).thenReturn(((Object) invalidClassException));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable11() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, 9, -2147483647);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable12() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, true);
            when(unmodifiableIteratorMock.next()).thenReturn(null);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock, unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable13() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(((ImmutableMap) null));
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, 10, 268435456);
            Tables.ImmutableCell immutableCell = ((Tables.ImmutableCell) createInstance("com.google.common.collect.Tables$ImmutableCell"));
            java.lang.Object[] workerArray = createArray("java.util.concurrent.ThreadPoolExecutor$Worker", 0);
            setField(immutableCell, "value", workerArray);
            setField(immutableCell, "columnKey", workerArray);
            java.lang.Object[] nonfairSyncArray = createArray("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync", 0);
            setField(immutableCell, "rowKey", nonfairSyncArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableCell));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false, false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable14() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(true);
            when(unmodifiableIteratorMock.next()).thenReturn(null);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable15() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            short[][] shortArray = new short[0][];
            when(immutableMapMock.get(org.mockito.ArgumentMatchers.any())).thenReturn(((Object) shortArray));
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), linkedHashMap);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(0, 1, 1024);
            Tables.ImmutableCell immutableCell = ((Tables.ImmutableCell) createInstance("com.google.common.collect.Tables$ImmutableCell"));
            java.lang.Object[] type6Array = createArray("[[[Lsun.nio.ch.MembershipKeyImpl$Type6;", 0);
            setField(immutableCell, "value", type6Array);
            ClassNotFoundException classNotFoundException = ((ClassNotFoundException) createInstance("java.lang.ClassNotFoundException"));
            setField(immutableCell, "columnKey", classNotFoundException);
            java.lang.Object[] checkedRandomAccessListArray = createArray("java.util.Collections$CheckedRandomAccessList", 0);
            setField(immutableCell, "rowKey", checkedRandomAccessListArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableCell));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock1 = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock1.hasNext()).thenReturn(false);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock1);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable16() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            when(immutableMapMock.get(org.mockito.ArgumentMatchers.any())).thenReturn(null);
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(linkedHashMap, linkedHashMap);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(8, 16, 1);
            Tables.ImmutableCell immutableCell = ((Tables.ImmutableCell) createInstance("com.google.common.collect.Tables$ImmutableCell"));
            java.lang.Object[] workerArray = createArray("java.util.concurrent.ThreadPoolExecutor$Worker", 0);
            setField(immutableCell, "value", workerArray);
            setField(immutableCell, "columnKey", workerArray);
            java.lang.Object[] nonfairSyncArray = createArray("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync", 0);
            setField(immutableCell, "rowKey", nonfairSyncArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableCell));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock1 = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock1.hasNext()).thenReturn(false);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock1);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable17() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            Integer integer = 0;
            when(immutableMapMock.get(org.mockito.ArgumentMatchers.any())).thenReturn(((Object) integer));
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), linkedHashMap);
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(0, 12, 1);
            Tables.ImmutableCell immutableCell = ((Tables.ImmutableCell) createInstance("com.google.common.collect.Tables$ImmutableCell"));
            java.lang.Object[] workerArray = createArray("java.util.concurrent.ThreadPoolExecutor$Worker", 0);
            setField(immutableCell, "value", workerArray);
            setField(immutableCell, "columnKey", workerArray);
            java.lang.Object[] nonfairSyncArray = createArray("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync", 0);
            setField(immutableCell, "rowKey", nonfairSyncArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableCell));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock1 = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock1.hasNext()).thenReturn(false);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock1);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testSparseImmutableTable18() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Maps.class);
            ImmutableMap immutableMapMock = mock(ImmutableMap.class);
            Integer integer = 0;
            when(immutableMapMock.get(org.mockito.ArgumentMatchers.any())).thenReturn(((Object) integer));
            mockedStatic.when(() -> {
                Maps.indexMap(org.mockito.ArgumentMatchers.any());
            }).thenReturn(immutableMapMock);
            mockedStatic.when(Maps::newLinkedHashMap).thenReturn(((LinkedHashMap) null), ((LinkedHashMap) null));
            ImmutableList immutableListMock = mock(ImmutableList.class);
            when(immutableListMock.size()).thenReturn(9, 9, 1);
            Tables.ImmutableCell immutableCell = ((Tables.ImmutableCell) createInstance("com.google.common.collect.Tables$ImmutableCell"));
            java.lang.Object[] workerArray = createArray("java.util.concurrent.ThreadPoolExecutor$Worker", 0);
            setField(immutableCell, "value", workerArray);
            setField(immutableCell, "columnKey", workerArray);
            java.lang.Object[] nonfairSyncArray = createArray("java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync", 0);
            setField(immutableCell, "rowKey", nonfairSyncArray);
            when(immutableListMock.get(anyInt())).thenReturn(((Object) immutableCell));
            ImmutableSet immutableSetMock = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock.hasNext()).thenReturn(false);
            when(immutableSetMock.iterator()).thenReturn(unmodifiableIteratorMock);
            ImmutableSet immutableSetMock1 = mock(ImmutableSet.class);
            UnmodifiableIterator unmodifiableIteratorMock1 = mock(UnmodifiableIterator.class);
            when(unmodifiableIteratorMock1.hasNext()).thenReturn(false);
            when(immutableSetMock1.iterator()).thenReturn(unmodifiableIteratorMock1);
            new SparseImmutableTable(immutableListMock, immutableSetMock, immutableSetMock1);
        } finally {
            mockedStatic.close();
        }
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
