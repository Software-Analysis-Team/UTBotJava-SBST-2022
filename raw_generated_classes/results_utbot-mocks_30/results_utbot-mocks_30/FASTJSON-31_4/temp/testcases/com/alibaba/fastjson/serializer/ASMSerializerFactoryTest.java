package com.alibaba.fastjson.serializer;

import org.junit.Test;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Field;
import com.alibaba.fastjson.serializer.ASMSerializerFactory.Context;
import com.alibaba.fastjson.serializer.ASMSerializerFactory;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.annotation.JSONField;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.junit.Assert.assertEquals;

public class ASMSerializerFactoryTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_float1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _floatMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_float", class1Type, methodVisitorType, fieldInfoType, contextType);
        _floatMethod.setAccessible(true);
        java.lang.Object[] _floatMethodArguments = new java.lang.Object[4];
        _floatMethodArguments[0] = class1;
        _floatMethodArguments[1] = null;
        _floatMethodArguments[2] = null;
        _floatMethodArguments[3] = null;
        try {
            _floatMethod.invoke(aSMSerializerFactory, _floatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_float2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _floatMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_float", class1Type, methodVisitorType, fieldInfoType, contextType);
        _floatMethod.setAccessible(true);
        java.lang.Object[] _floatMethodArguments = new java.lang.Object[4];
        _floatMethodArguments[0] = class1;
        _floatMethodArguments[1] = null;
        _floatMethodArguments[2] = null;
        _floatMethodArguments[3] = null;
        try {
            _floatMethod.invoke(aSMSerializerFactory, _floatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", class1Type, methodVisitorType, fieldInfoType, contextType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = class1;
        _intMethodArguments[1] = null;
        _intMethodArguments[2] = null;
        _intMethodArguments[3] = null;
        _intMethodArguments[4] = 0;
        _intMethodArguments[5] = '\u0000';
        try {
            _intMethod.invoke(aSMSerializerFactory, _intMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", class1Type, methodVisitorType, fieldInfoMockType, contextMockType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = class1;
        _intMethodArguments[1] = null;
        _intMethodArguments[2] = fieldInfoMock;
        _intMethodArguments[3] = contextMock;
        _intMethodArguments[4] = 0;
        _intMethodArguments[5] = '\u0000';
        try {
            _intMethod.invoke(aSMSerializerFactory, _intMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", class1Type, methodVisitorType, fieldInfoType, contextType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = class1;
        _intMethodArguments[1] = null;
        _intMethodArguments[2] = null;
        _intMethodArguments[3] = null;
        _intMethodArguments[4] = 0;
        _intMethodArguments[5] = '\u0000';
        try {
            _intMethod.invoke(aSMSerializerFactory, _intMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", null);
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", classType, methodVisitorMockType, fieldInfoMockType, contextMockType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = null;
        _intMethodArguments[1] = methodVisitorMock;
        _intMethodArguments[2] = fieldInfoMock;
        _intMethodArguments[3] = contextMock;
        _intMethodArguments[4] = 0;
        _intMethodArguments[5] = '\u0000';
        try {
            _intMethod.invoke(aSMSerializerFactory, _intMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", class1Type, methodVisitorType, fieldInfoMockType, contextType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = class1;
        _intMethodArguments[1] = null;
        _intMethodArguments[2] = fieldInfoMock;
        _intMethodArguments[3] = null;
        _intMethodArguments[4] = 0;
        _intMethodArguments[5] = '\u0000';
        try {
            _intMethod.invoke(aSMSerializerFactory, _intMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_long1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", class1Type, methodVisitorType, fieldInfoType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = class1;
        _longMethodArguments[1] = null;
        _longMethodArguments[2] = null;
        _longMethodArguments[3] = null;
        try {
            _longMethod.invoke(aSMSerializerFactory, _longMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_long2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", class1Type, methodVisitorType, fieldInfoType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = class1;
        _longMethodArguments[1] = null;
        _longMethodArguments[2] = null;
        _longMethodArguments[3] = null;
        try {
            _longMethod.invoke(aSMSerializerFactory, _longMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_long3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", class1Type, methodVisitorMockType, fieldInfoMockType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = class1;
        _longMethodArguments[1] = methodVisitorMock;
        _longMethodArguments[2] = fieldInfoMock;
        _longMethodArguments[3] = null;
        try {
            _longMethod.invoke(aSMSerializerFactory, _longMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_long4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", null);
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", classType, methodVisitorMockType, fieldInfoMockType, contextMockType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = null;
        _longMethodArguments[1] = methodVisitorMock;
        _longMethodArguments[2] = fieldInfoMock;
        _longMethodArguments[3] = contextMock;
        try {
            _longMethod.invoke(aSMSerializerFactory, _longMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", class1Type, methodVisitorType, fieldInfoType, contextType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = class1;
        _enumMethodArguments[1] = null;
        _enumMethodArguments[2] = null;
        _enumMethodArguments[3] = null;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", class1Type, methodVisitorType, fieldInfoMockType, contextMockType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = class1;
        _enumMethodArguments[1] = null;
        _enumMethodArguments[2] = fieldInfoMock;
        _enumMethodArguments[3] = contextMock;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", class1Type, methodVisitorType, fieldInfoType, contextType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = class1;
        _enumMethodArguments[1] = null;
        _enumMethodArguments[2] = null;
        _enumMethodArguments[3] = null;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", null);
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", classType, methodVisitorMockType, fieldInfoMockType, contextMockType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = null;
        _enumMethodArguments[1] = methodVisitorMock;
        _enumMethodArguments[2] = fieldInfoMock;
        _enumMethodArguments[3] = contextMock;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", class1Type, methodVisitorType, fieldInfoMockType, contextType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = class1;
        _enumMethodArguments[1] = null;
        _enumMethodArguments[2] = fieldInfoMock;
        _enumMethodArguments[3] = null;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_enum6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.ASMUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.type(any());
            }).thenReturn(((String) null));
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.desc(org.mockito.ArgumentMatchers.any(Method.class));
            }).thenReturn(((String) null));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            Field field = ((Field) createInstance("java.lang.reflect.Field"));
            setField(fieldInfoMock, "field", field);
            Method method = ((Method) createInstance("java.lang.reflect.Method"));
            setField(method, "returnType", null);
            setField(method, "name", null);
            setField(method, "clazz", class1);
            setField(fieldInfoMock, "method", method);
            ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
            when(contextMock.var(anyString())).thenReturn(0);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class classType = Class.forName("java.lang.Class");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", classType, methodVisitorMockType, fieldInfoMockType, contextMockType);
            _enumMethod.setAccessible(true);
            java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
            _enumMethodArguments[0] = null;
            _enumMethodArguments[1] = methodVisitorMock;
            _enumMethodArguments[2] = fieldInfoMock;
            _enumMethodArguments[3] = contextMock;
            try {
                _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_string1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _stringMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_string", class1Type, methodVisitorType, fieldInfoType, contextType);
        _stringMethod.setAccessible(true);
        java.lang.Object[] _stringMethodArguments = new java.lang.Object[4];
        _stringMethodArguments[0] = class1;
        _stringMethodArguments[1] = null;
        _stringMethodArguments[2] = null;
        _stringMethodArguments[3] = null;
        try {
            _stringMethod.invoke(aSMSerializerFactory, _stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_string2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "name", string);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _stringMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_string", class1Type, methodVisitorType, fieldInfoMockType, contextMockType);
        _stringMethod.setAccessible(true);
        java.lang.Object[] _stringMethodArguments = new java.lang.Object[4];
        _stringMethodArguments[0] = class1;
        _stringMethodArguments[1] = null;
        _stringMethodArguments[2] = fieldInfoMock;
        _stringMethodArguments[3] = contextMock;
        try {
            _stringMethod.invoke(aSMSerializerFactory, _stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_list1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _listMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_list", class1Type, methodVisitorType, fieldInfoType, contextType);
        _listMethod.setAccessible(true);
        java.lang.Object[] _listMethodArguments = new java.lang.Object[4];
        _listMethodArguments[0] = class1;
        _listMethodArguments[1] = null;
        _listMethodArguments[2] = null;
        _listMethodArguments[3] = null;
        try {
            _listMethod.invoke(aSMSerializerFactory, _listMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_list2() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.TypeUtils.class);
            Class class1 = Object.class;
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(any());
            }).thenReturn(((java.lang.reflect.Type) class1));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("com.alibaba.fastjson.util.ParameterizedTypeImpl"));
            setField(fieldInfoMock, "fieldType", parameterizedTypeImpl);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class class1Type = Class.forName("java.lang.Class");
            Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Method _listMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_list", class1Type, methodVisitorType, fieldInfoMockType, contextType);
            _listMethod.setAccessible(true);
            java.lang.Object[] _listMethodArguments = new java.lang.Object[4];
            _listMethodArguments[0] = class1;
            _listMethodArguments[1] = null;
            _listMethodArguments[2] = fieldInfoMock;
            _listMethodArguments[3] = null;
            try {
                _listMethod.invoke(aSMSerializerFactory, _listMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_filters1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorType, fieldInfoType, contextType, labelType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = null;
        _filtersMethodArguments[1] = fieldInfo;
        _filtersMethodArguments[2] = context;
        _filtersMethodArguments[3] = label;
        try {
            _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_filters2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorType, fieldInfoType, contextType, labelType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = null;
        _filtersMethodArguments[1] = null;
        _filtersMethodArguments[2] = null;
        _filtersMethodArguments[3] = null;
        try {
            _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_filters3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        setField(fieldInfoMock, "fieldTransient", true);
        Label labelMock = mock(Label.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelMockType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorMockType, fieldInfoMockType, contextType, labelMockType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = methodVisitorMock;
        _filtersMethodArguments[1] = fieldInfoMock;
        _filtersMethodArguments[2] = null;
        _filtersMethodArguments[3] = labelMock;
        try {
            _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_filters4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        setField(fieldInfoMock, "fieldTransient", true);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorType, fieldInfoMockType, contextMockType, labelType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = null;
        _filtersMethodArguments[1] = fieldInfoMock;
        _filtersMethodArguments[2] = contextMock;
        _filtersMethodArguments[3] = null;
        try {
            _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_filters5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        setField(fieldInfoMock, "fieldTransient", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorType, fieldInfoMockType, contextType, labelType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = null;
        _filtersMethodArguments[1] = fieldInfoMock;
        _filtersMethodArguments[2] = null;
        _filtersMethodArguments[3] = null;
        _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_filters6() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        setField(fieldInfoMock, "fieldTransient", false);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _filtersMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_filters", methodVisitorType, fieldInfoMockType, contextType, labelType);
        _filtersMethod.setAccessible(true);
        java.lang.Object[] _filtersMethodArguments = new java.lang.Object[4];
        _filtersMethodArguments[0] = null;
        _filtersMethodArguments[1] = fieldInfoMock;
        _filtersMethodArguments[2] = null;
        _filtersMethodArguments[3] = null;
        try {
            _filtersMethod.invoke(aSMSerializerFactory, _filtersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_nameApply1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _nameApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_nameApply", methodVisitorType, fieldInfoType, contextType, labelType);
        _nameApplyMethod.setAccessible(true);
        java.lang.Object[] _nameApplyMethodArguments = new java.lang.Object[4];
        _nameApplyMethodArguments[0] = null;
        _nameApplyMethodArguments[1] = fieldInfo;
        _nameApplyMethodArguments[2] = context;
        _nameApplyMethodArguments[3] = label;
        try {
            _nameApplyMethod.invoke(aSMSerializerFactory, _nameApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_nameApply2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _nameApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_nameApply", methodVisitorType, fieldInfoType, contextType, labelType);
        _nameApplyMethod.setAccessible(true);
        java.lang.Object[] _nameApplyMethodArguments = new java.lang.Object[4];
        _nameApplyMethodArguments[0] = null;
        _nameApplyMethodArguments[1] = null;
        _nameApplyMethodArguments[2] = null;
        _nameApplyMethodArguments[3] = null;
        try {
            _nameApplyMethod.invoke(aSMSerializerFactory, _nameApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_nameApply3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Label labelMock = mock(Label.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelMockType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _nameApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_nameApply", methodVisitorType, fieldInfoType, contextType, labelMockType);
        _nameApplyMethod.setAccessible(true);
        java.lang.Object[] _nameApplyMethodArguments = new java.lang.Object[4];
        _nameApplyMethodArguments[0] = null;
        _nameApplyMethodArguments[1] = null;
        _nameApplyMethodArguments[2] = null;
        _nameApplyMethodArguments[3] = labelMock;
        try {
            _nameApplyMethod.invoke(aSMSerializerFactory, _nameApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_nameApply4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _nameApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_nameApply", methodVisitorType, fieldInfoMockType, contextType, labelType);
        _nameApplyMethod.setAccessible(true);
        java.lang.Object[] _nameApplyMethodArguments = new java.lang.Object[4];
        _nameApplyMethodArguments[0] = null;
        _nameApplyMethodArguments[1] = fieldInfoMock;
        _nameApplyMethodArguments[2] = null;
        _nameApplyMethodArguments[3] = null;
        _nameApplyMethod.invoke(aSMSerializerFactory, _nameApplyMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_labelApply1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _labelApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_labelApply", methodVisitorType, fieldInfoType, contextType, labelType);
        _labelApplyMethod.setAccessible(true);
        java.lang.Object[] _labelApplyMethodArguments = new java.lang.Object[4];
        _labelApplyMethodArguments[0] = null;
        _labelApplyMethodArguments[1] = fieldInfo;
        _labelApplyMethodArguments[2] = context;
        _labelApplyMethodArguments[3] = label;
        try {
            _labelApplyMethod.invoke(aSMSerializerFactory, _labelApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_labelApply2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _labelApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_labelApply", methodVisitorType, fieldInfoType, contextType, labelType);
        _labelApplyMethod.setAccessible(true);
        java.lang.Object[] _labelApplyMethodArguments = new java.lang.Object[4];
        _labelApplyMethodArguments[0] = null;
        _labelApplyMethodArguments[1] = null;
        _labelApplyMethodArguments[2] = null;
        _labelApplyMethodArguments[3] = null;
        try {
            _labelApplyMethod.invoke(aSMSerializerFactory, _labelApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_labelApply3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _labelApplyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_labelApply", methodVisitorMockType, fieldInfoType, contextType, labelType);
        _labelApplyMethod.setAccessible(true);
        java.lang.Object[] _labelApplyMethodArguments = new java.lang.Object[4];
        _labelApplyMethodArguments[0] = methodVisitorMock;
        _labelApplyMethodArguments[1] = null;
        _labelApplyMethodArguments[2] = null;
        _labelApplyMethodArguments[3] = null;
        try {
            _labelApplyMethod.invoke(aSMSerializerFactory, _labelApplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorType, fieldInfoType, contextType, labelType);
        _writeObjectMethod.setAccessible(true);
        java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
        _writeObjectMethodArguments[0] = null;
        _writeObjectMethodArguments[1] = fieldInfo;
        _writeObjectMethodArguments[2] = context;
        _writeObjectMethodArguments[3] = label;
        try {
            _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorType, fieldInfoType, contextType, labelType);
        _writeObjectMethod.setAccessible(true);
        java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
        _writeObjectMethodArguments[0] = null;
        _writeObjectMethodArguments[1] = null;
        _writeObjectMethodArguments[2] = null;
        _writeObjectMethodArguments[3] = null;
        try {
            _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        when(fieldInfoMock.getFormat()).thenReturn(((String) null));
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorType, fieldInfoMockType, contextMockType, labelType);
        _writeObjectMethod.setAccessible(true);
        java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
        _writeObjectMethodArguments[0] = null;
        _writeObjectMethodArguments[1] = fieldInfoMock;
        _writeObjectMethodArguments[2] = contextMock;
        _writeObjectMethodArguments[3] = null;
        try {
            _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        when(fieldInfoMock.getFormat()).thenReturn(string);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        Label labelMock = mock(Label.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelMockType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorType, fieldInfoMockType, contextType, labelMockType);
        _writeObjectMethod.setAccessible(true);
        java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
        _writeObjectMethodArguments[0] = null;
        _writeObjectMethodArguments[1] = fieldInfoMock;
        _writeObjectMethodArguments[2] = null;
        _writeObjectMethodArguments[3] = labelMock;
        try {
            _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject5() throws Throwable  {
        int prevProcessValue = ASMSerializerFactory.Context.processValue;
        try {
            ASMSerializerFactory.Context.processValue = 0;
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            when(fieldInfoMock.getFormat()).thenReturn(((String) null));
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
            Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorType, fieldInfoMockType, contextType, labelType);
            _writeObjectMethod.setAccessible(true);
            java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
            _writeObjectMethodArguments[0] = null;
            _writeObjectMethodArguments[1] = fieldInfoMock;
            _writeObjectMethodArguments[2] = null;
            _writeObjectMethodArguments[3] = null;
            try {
                _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            ASMSerializerFactory.Context.processValue = prevProcessValue;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeObject6() throws Throwable  {
        int prevProcessValue = ASMSerializerFactory.Context.processValue;
        try {
            ASMSerializerFactory.Context.processValue = 0;
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            when(fieldInfoMock.getFormat()).thenReturn(((String) null));
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
            Method _writeObjectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeObject", methodVisitorMockType, fieldInfoMockType, contextType, labelType);
            _writeObjectMethod.setAccessible(true);
            java.lang.Object[] _writeObjectMethodArguments = new java.lang.Object[4];
            _writeObjectMethodArguments[0] = methodVisitorMock;
            _writeObjectMethodArguments[1] = fieldInfoMock;
            _writeObjectMethodArguments[2] = null;
            _writeObjectMethodArguments[3] = null;
            try {
                _writeObjectMethod.invoke(aSMSerializerFactory, _writeObjectMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            ASMSerializerFactory.Context.processValue = prevProcessValue;
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_before1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _beforeMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_before", methodVisitorType, contextType);
        _beforeMethod.setAccessible(true);
        java.lang.Object[] _beforeMethodArguments = new java.lang.Object[2];
        _beforeMethodArguments[0] = null;
        _beforeMethodArguments[1] = context;
        try {
            _beforeMethod.invoke(aSMSerializerFactory, _beforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_before2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _beforeMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_before", methodVisitorType, contextType);
        _beforeMethod.setAccessible(true);
        java.lang.Object[] _beforeMethodArguments = new java.lang.Object[2];
        _beforeMethodArguments[0] = null;
        _beforeMethodArguments[1] = null;
        try {
            _beforeMethod.invoke(aSMSerializerFactory, _beforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_before3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _beforeMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_before", methodVisitorMockType, contextType);
        _beforeMethod.setAccessible(true);
        java.lang.Object[] _beforeMethodArguments = new java.lang.Object[2];
        _beforeMethodArguments[0] = methodVisitorMock;
        _beforeMethodArguments[1] = null;
        try {
            _beforeMethod.invoke(aSMSerializerFactory, _beforeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_after1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _afterMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_after", methodVisitorType, contextType);
        _afterMethod.setAccessible(true);
        java.lang.Object[] _afterMethodArguments = new java.lang.Object[2];
        _afterMethodArguments[0] = null;
        _afterMethodArguments[1] = context;
        try {
            _afterMethod.invoke(aSMSerializerFactory, _afterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_after2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _afterMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_after", methodVisitorType, contextType);
        _afterMethod.setAccessible(true);
        java.lang.Object[] _afterMethodArguments = new java.lang.Object[2];
        _afterMethodArguments[0] = null;
        _afterMethodArguments[1] = null;
        try {
            _afterMethod.invoke(aSMSerializerFactory, _afterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_after3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _afterMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_after", methodVisitorMockType, contextType);
        _afterMethod.setAccessible(true);
        java.lang.Object[] _afterMethodArguments = new java.lang.Object[2];
        _afterMethodArguments[0] = methodVisitorMock;
        _afterMethodArguments[1] = null;
        try {
            _afterMethod.invoke(aSMSerializerFactory, _afterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_notWriteDefault1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorType, fieldInfoType, contextType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = null;
        _notWriteDefaultMethodArguments[1] = fieldInfo;
        _notWriteDefaultMethodArguments[2] = context;
        _notWriteDefaultMethodArguments[3] = label;
        try {
            _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_notWriteDefault2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorType, fieldInfoType, contextType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = null;
        _notWriteDefaultMethodArguments[1] = null;
        _notWriteDefaultMethodArguments[2] = null;
        _notWriteDefaultMethodArguments[3] = null;
        _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_notWriteDefault3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorType, fieldInfoType, contextType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = null;
        _notWriteDefaultMethodArguments[1] = null;
        _notWriteDefaultMethodArguments[2] = null;
        _notWriteDefaultMethodArguments[3] = null;
        try {
            _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_notWriteDefault4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorType, fieldInfoType, contextMockType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = null;
        _notWriteDefaultMethodArguments[1] = null;
        _notWriteDefaultMethodArguments[2] = contextMock;
        _notWriteDefaultMethodArguments[3] = null;
        try {
            _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_notWriteDefault5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorMockType, fieldInfoType, contextMockType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = methodVisitorMock;
        _notWriteDefaultMethodArguments[1] = null;
        _notWriteDefaultMethodArguments[2] = contextMock;
        _notWriteDefaultMethodArguments[3] = null;
        try {
            _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_notWriteDefault11() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _notWriteDefaultMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_notWriteDefault", methodVisitorMockType, fieldInfoMockType, contextMockType, labelType);
        _notWriteDefaultMethod.setAccessible(true);
        java.lang.Object[] _notWriteDefaultMethodArguments = new java.lang.Object[4];
        _notWriteDefaultMethodArguments[0] = methodVisitorMock;
        _notWriteDefaultMethodArguments[1] = fieldInfoMock;
        _notWriteDefaultMethodArguments[2] = contextMock;
        _notWriteDefaultMethodArguments[3] = null;
        _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors5()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _notWriteDefault
    
    public void test_notWriteDefault_errors6()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_apply1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodVisitorType, fieldInfoType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = null;
        _applyMethodArguments[1] = fieldInfo;
        _applyMethodArguments[2] = context;
        try {
            _applyMethod.invoke(aSMSerializerFactory, _applyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_apply2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodVisitorType, fieldInfoType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = null;
        _applyMethodArguments[1] = null;
        _applyMethodArguments[2] = null;
        try {
            _applyMethod.invoke(aSMSerializerFactory, _applyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_apply3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodVisitorType, fieldInfoMockType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = null;
        _applyMethodArguments[1] = fieldInfoMock;
        _applyMethodArguments[2] = null;
        try {
            _applyMethod.invoke(aSMSerializerFactory, _applyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for _apply
    
    public void test_apply_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _apply
    
    public void test_apply_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _apply
    
    public void test_apply_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    
    ///region Errors report for _apply
    
    public void test_apply_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        Label label = new Label();
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorType, fieldInfoType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = null;
        _processValueMethodArguments[1] = fieldInfo;
        _processValueMethodArguments[2] = context;
        _processValueMethodArguments[3] = label;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorType, fieldInfoType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = null;
        _processValueMethodArguments[1] = null;
        _processValueMethodArguments[2] = null;
        _processValueMethodArguments[3] = null;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        Label labelMock = mock(Label.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelMockType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorType, fieldInfoMockType, contextMockType, labelMockType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = null;
        _processValueMethodArguments[1] = fieldInfoMock;
        _processValueMethodArguments[2] = contextMock;
        _processValueMethodArguments[3] = labelMock;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        String string = new String("");
        setField(fieldInfoMock, "name", string);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorMockType, fieldInfoMockType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = methodVisitorMock;
        _processValueMethodArguments[1] = fieldInfoMock;
        _processValueMethodArguments[2] = null;
        _processValueMethodArguments[3] = null;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorType, fieldInfoMockType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = null;
        _processValueMethodArguments[1] = fieldInfoMock;
        _processValueMethodArguments[2] = null;
        _processValueMethodArguments[3] = null;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processValue6() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodVisitorType, fieldInfoMockType, contextMockType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = null;
        _processValueMethodArguments[1] = fieldInfoMock;
        _processValueMethodArguments[2] = contextMock;
        _processValueMethodArguments[3] = null;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processKey1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _processKeyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processKey", methodVisitorType, fieldInfoType, contextType);
        _processKeyMethod.setAccessible(true);
        java.lang.Object[] _processKeyMethodArguments = new java.lang.Object[3];
        _processKeyMethodArguments[0] = null;
        _processKeyMethodArguments[1] = fieldInfo;
        _processKeyMethodArguments[2] = context;
        try {
            _processKeyMethod.invoke(aSMSerializerFactory, _processKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processKey2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _processKeyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processKey", methodVisitorType, fieldInfoType, contextMockType);
        _processKeyMethod.setAccessible(true);
        java.lang.Object[] _processKeyMethodArguments = new java.lang.Object[3];
        _processKeyMethodArguments[0] = null;
        _processKeyMethodArguments[1] = null;
        _processKeyMethodArguments[2] = contextMock;
        try {
            _processKeyMethod.invoke(aSMSerializerFactory, _processKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processKey3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _processKeyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processKey", methodVisitorType, fieldInfoType, contextType);
        _processKeyMethod.setAccessible(true);
        java.lang.Object[] _processKeyMethodArguments = new java.lang.Object[3];
        _processKeyMethodArguments[0] = null;
        _processKeyMethodArguments[1] = null;
        _processKeyMethodArguments[2] = null;
        try {
            _processKeyMethod.invoke(aSMSerializerFactory, _processKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_processKey4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _processKeyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processKey", methodVisitorMockType, fieldInfoType, contextMockType);
        _processKeyMethod.setAccessible(true);
        java.lang.Object[] _processKeyMethodArguments = new java.lang.Object[3];
        _processKeyMethodArguments[0] = methodVisitorMock;
        _processKeyMethodArguments[1] = null;
        _processKeyMethodArguments[2] = contextMock;
        try {
            _processKeyMethod.invoke(aSMSerializerFactory, _processKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_if_write_null1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodVisitorType, fieldInfoType, contextType);
        _if_write_nullMethod.setAccessible(true);
        java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
        _if_write_nullMethodArguments[0] = null;
        _if_write_nullMethodArguments[1] = fieldInfo;
        _if_write_nullMethodArguments[2] = context;
        try {
            _if_write_nullMethod.invoke(aSMSerializerFactory, _if_write_nullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_if_write_null2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodVisitorType, fieldInfoType, contextType);
        _if_write_nullMethod.setAccessible(true);
        java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
        _if_write_nullMethodArguments[0] = null;
        _if_write_nullMethodArguments[1] = null;
        _if_write_nullMethodArguments[2] = null;
        try {
            _if_write_nullMethod.invoke(aSMSerializerFactory, _if_write_nullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_if_write_null3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Class class1 = Object.class;
        setField(fieldInfoMock, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodVisitorType, fieldInfoMockType, contextType);
        _if_write_nullMethod.setAccessible(true);
        java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
        _if_write_nullMethodArguments[0] = null;
        _if_write_nullMethodArguments[1] = fieldInfoMock;
        _if_write_nullMethodArguments[2] = null;
        try {
            _if_write_nullMethod.invoke(aSMSerializerFactory, _if_write_nullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for _if_write_null
    
    public void test_if_write_null_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_if_write_null5() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(SerializerFeature.class);
            mockedStatic.when(() -> {
                SerializerFeature.of(any());
            }).thenReturn(0, 0);
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            JSONField jSONFieldMock = mock(JSONField.class);
            com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray = new com.alibaba.fastjson.serializer.SerializerFeature[9];
            when(jSONFieldMock.serialzeFeatures()).thenReturn(serializerFeatureArray);
            when(fieldInfoMock.getAnnotation()).thenReturn(jSONFieldMock);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodVisitorMockType, fieldInfoMockType, contextType);
            _if_write_nullMethod.setAccessible(true);
            java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
            _if_write_nullMethodArguments[0] = methodVisitorMock;
            _if_write_nullMethodArguments[1] = fieldInfoMock;
            _if_write_nullMethodArguments[2] = null;
            try {
                _if_write_nullMethod.invoke(aSMSerializerFactory, _if_write_nullMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    
    ///region Errors report for _if_write_null
    
    public void test_if_write_null_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // lateinit property resultModel has not been initialized
        // 
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeFieldName1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _writeFieldNameMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeFieldName", methodVisitorType, contextType);
        _writeFieldNameMethod.setAccessible(true);
        java.lang.Object[] _writeFieldNameMethodArguments = new java.lang.Object[2];
        _writeFieldNameMethodArguments[0] = null;
        _writeFieldNameMethodArguments[1] = context;
        try {
            _writeFieldNameMethod.invoke(aSMSerializerFactory, _writeFieldNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeFieldName2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _writeFieldNameMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeFieldName", methodVisitorType, contextType);
        _writeFieldNameMethod.setAccessible(true);
        java.lang.Object[] _writeFieldNameMethodArguments = new java.lang.Object[2];
        _writeFieldNameMethodArguments[0] = null;
        _writeFieldNameMethodArguments[1] = null;
        try {
            _writeFieldNameMethod.invoke(aSMSerializerFactory, _writeFieldNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeFieldName3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _writeFieldNameMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeFieldName", methodVisitorType, contextType);
        _writeFieldNameMethod.setAccessible(true);
        java.lang.Object[] _writeFieldNameMethodArguments = new java.lang.Object[2];
        _writeFieldNameMethodArguments[0] = null;
        _writeFieldNameMethodArguments[1] = null;
        try {
            _writeFieldNameMethod.invoke(aSMSerializerFactory, _writeFieldNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeFieldName4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _writeFieldNameMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeFieldName", methodVisitorType, contextMockType);
        _writeFieldNameMethod.setAccessible(true);
        java.lang.Object[] _writeFieldNameMethodArguments = new java.lang.Object[2];
        _writeFieldNameMethodArguments[0] = null;
        _writeFieldNameMethodArguments[1] = contextMock;
        try {
            _writeFieldNameMethod.invoke(aSMSerializerFactory, _writeFieldNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_writeFieldName5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _writeFieldNameMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_writeFieldName", methodVisitorType, contextMockType);
        _writeFieldNameMethod.setAccessible(true);
        java.lang.Object[] _writeFieldNameMethodArguments = new java.lang.Object[2];
        _writeFieldNameMethodArguments[0] = null;
        _writeFieldNameMethodArguments[1] = contextMock;
        try {
            _writeFieldNameMethod.invoke(aSMSerializerFactory, _writeFieldNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_seperator1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _seperatorMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_seperator", methodVisitorType, contextType);
        _seperatorMethod.setAccessible(true);
        java.lang.Object[] _seperatorMethodArguments = new java.lang.Object[2];
        _seperatorMethodArguments[0] = null;
        _seperatorMethodArguments[1] = context;
        try {
            _seperatorMethod.invoke(aSMSerializerFactory, _seperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_seperator2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _seperatorMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_seperator", methodVisitorType, contextType);
        _seperatorMethod.setAccessible(true);
        java.lang.Object[] _seperatorMethodArguments = new java.lang.Object[2];
        _seperatorMethodArguments[0] = null;
        _seperatorMethodArguments[1] = null;
        try {
            _seperatorMethod.invoke(aSMSerializerFactory, _seperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_seperator3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _seperatorMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_seperator", methodVisitorMockType, contextType);
        _seperatorMethod.setAccessible(true);
        java.lang.Object[] _seperatorMethodArguments = new java.lang.Object[2];
        _seperatorMethodArguments[0] = methodVisitorMock;
        _seperatorMethodArguments[1] = null;
        try {
            _seperatorMethod.invoke(aSMSerializerFactory, _seperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_seperator4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _seperatorMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_seperator", methodVisitorMockType, contextMockType);
        _seperatorMethod.setAccessible(true);
        java.lang.Object[] _seperatorMethodArguments = new java.lang.Object[2];
        _seperatorMethodArguments[0] = methodVisitorMock;
        _seperatorMethodArguments[1] = contextMock;
        _seperatorMethod.invoke(aSMSerializerFactory, _seperatorMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getListFieldItemSer1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class class1Type = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextType, methodVisitorType, fieldInfoType, class1Type);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = null;
        _getListFieldItemSerMethodArguments[1] = null;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = class1;
        try {
            _getListFieldItemSerMethod.invoke(aSMSerializerFactory, _getListFieldItemSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getListFieldItemSer2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class class1Type = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextMockType, methodVisitorMockType, fieldInfoType, class1Type);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = contextMock;
        _getListFieldItemSerMethodArguments[1] = methodVisitorMock;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = class1;
        try {
            _getListFieldItemSerMethod.invoke(aSMSerializerFactory, _getListFieldItemSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getFieldSer1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getFieldSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getFieldSer", contextType, methodVisitorType, fieldInfoType);
        _getFieldSerMethod.setAccessible(true);
        java.lang.Object[] _getFieldSerMethodArguments = new java.lang.Object[3];
        _getFieldSerMethodArguments[0] = context;
        _getFieldSerMethodArguments[1] = null;
        _getFieldSerMethodArguments[2] = fieldInfo;
        try {
            _getFieldSerMethod.invoke(aSMSerializerFactory, _getFieldSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getFieldSer2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getFieldSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getFieldSer", contextType, methodVisitorType, fieldInfoType);
        _getFieldSerMethod.setAccessible(true);
        java.lang.Object[] _getFieldSerMethodArguments = new java.lang.Object[3];
        _getFieldSerMethodArguments[0] = null;
        _getFieldSerMethodArguments[1] = null;
        _getFieldSerMethodArguments[2] = null;
        try {
            _getFieldSerMethod.invoke(aSMSerializerFactory, _getFieldSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getFieldSer3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getFieldSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getFieldSer", contextType, methodVisitorMockType, fieldInfoType);
        _getFieldSerMethod.setAccessible(true);
        java.lang.Object[] _getFieldSerMethodArguments = new java.lang.Object[3];
        _getFieldSerMethodArguments[0] = null;
        _getFieldSerMethodArguments[1] = methodVisitorMock;
        _getFieldSerMethodArguments[2] = null;
        try {
            _getFieldSerMethod.invoke(aSMSerializerFactory, _getFieldSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateWriteAsArray1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoArrayType = Class.forName("[Lcom.alibaba.fastjson.util.FieldInfo;");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method generateWriteAsArrayMethod = aSMSerializerFactoryClazz.getDeclaredMethod("generateWriteAsArray", class1Type, methodVisitorType, fieldInfoArrayType, contextType);
        generateWriteAsArrayMethod.setAccessible(true);
        java.lang.Object[] generateWriteAsArrayMethodArguments = new java.lang.Object[4];
        generateWriteAsArrayMethodArguments[0] = class1;
        generateWriteAsArrayMethodArguments[1] = null;
        generateWriteAsArrayMethodArguments[2] = ((Object) fieldInfoArray);
        generateWriteAsArrayMethodArguments[3] = null;
        try {
            generateWriteAsArrayMethod.invoke(aSMSerializerFactory, generateWriteAsArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateWriteMethod1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoArrayType = Class.forName("[Lcom.alibaba.fastjson.util.FieldInfo;");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method generateWriteMethodMethod = aSMSerializerFactoryClazz.getDeclaredMethod("generateWriteMethod", class1Type, methodVisitorType, fieldInfoArrayType, contextType);
        generateWriteMethodMethod.setAccessible(true);
        java.lang.Object[] generateWriteMethodMethodArguments = new java.lang.Object[4];
        generateWriteMethodMethodArguments[0] = class1;
        generateWriteMethodMethodArguments[1] = null;
        generateWriteMethodMethodArguments[2] = null;
        generateWriteMethodMethodArguments[3] = null;
        try {
            generateWriteMethodMethod.invoke(aSMSerializerFactory, generateWriteMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGenerateWriteMethod2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoArrayType = Class.forName("[Lcom.alibaba.fastjson.util.FieldInfo;");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method generateWriteMethodMethod = aSMSerializerFactoryClazz.getDeclaredMethod("generateWriteMethod", class1Type, methodVisitorType, fieldInfoArrayType, contextType);
        generateWriteMethodMethod.setAccessible(true);
        java.lang.Object[] generateWriteMethodMethodArguments = new java.lang.Object[4];
        generateWriteMethodMethodArguments[0] = class1;
        generateWriteMethodMethodArguments[1] = null;
        generateWriteMethodMethodArguments[2] = ((Object) fieldInfoArray);
        generateWriteMethodMethodArguments[3] = null;
        try {
            generateWriteMethodMethod.invoke(aSMSerializerFactory, generateWriteMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_object1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", class1Type, methodVisitorType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = class1;
        _objectMethodArguments[1] = null;
        _objectMethodArguments[2] = null;
        _objectMethodArguments[3] = null;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_object2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", class1Type, methodVisitorType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = class1;
        _objectMethodArguments[1] = null;
        _objectMethodArguments[2] = null;
        _objectMethodArguments[3] = null;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_object3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        Class class1 = Object.class;
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", class1Type, methodVisitorMockType, fieldInfoMockType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = class1;
        _objectMethodArguments[1] = methodVisitorMock;
        _objectMethodArguments[2] = fieldInfoMock;
        _objectMethodArguments[3] = null;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_object4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfoMock, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", null);
        setField(fieldInfoMock, "method", method);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", classType, methodVisitorMockType, fieldInfoMockType, contextMockType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = null;
        _objectMethodArguments[1] = methodVisitorMock;
        _objectMethodArguments[2] = fieldInfoMock;
        _objectMethodArguments[3] = contextMock;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = new ASMSerializerFactory();
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorType, contextType, fieldInfoType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = null;
        _getMethodArguments[1] = context;
        _getMethodArguments[2] = fieldInfo;
        try {
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorType, contextType, fieldInfoType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = null;
        _getMethodArguments[1] = null;
        _getMethodArguments[2] = null;
        try {
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorType, contextType, fieldInfoMockType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = null;
        _getMethodArguments[1] = null;
        _getMethodArguments[2] = fieldInfoMock;
        try {
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorType, contextMockType, fieldInfoMockType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = null;
        _getMethodArguments[1] = contextMock;
        _getMethodArguments[2] = fieldInfoMock;
        try {
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
        ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
        when(contextMock.var(anyString())).thenReturn(0);
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(method, "clazz", null);
        setField(fieldInfoMock, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorMockType, contextMockType, fieldInfoMockType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = methodVisitorMock;
        _getMethodArguments[1] = contextMock;
        _getMethodArguments[2] = fieldInfoMock;
        try {
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get6() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.ASMUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.type(any());
            }).thenReturn(((String) null));
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.desc(org.mockito.ArgumentMatchers.any(Method.class));
            }).thenReturn(((String) null));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
            when(contextMock.var(anyString())).thenReturn(0);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            Method method = ((Method) createInstance("java.lang.reflect.Method"));
            setField(method, "returnType", null);
            setField(method, "name", null);
            setField(method, "clazz", class1);
            setField(fieldInfoMock, "method", method);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorMockType, contextMockType, fieldInfoMockType);
            _getMethod.setAccessible(true);
            java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
            _getMethodArguments[0] = methodVisitorMock;
            _getMethodArguments[1] = contextMock;
            _getMethodArguments[2] = fieldInfoMock;
            try {
                _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_get7() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.ASMUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.type(any());
            }).thenReturn(((String) null));
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.desc(org.mockito.ArgumentMatchers.any(Method.class));
            }).thenReturn(((String) null));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
            when(contextMock.var(anyString())).thenReturn(0);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            Method method = ((Method) createInstance("java.lang.reflect.Method"));
            setField(method, "returnType", class1);
            setField(method, "name", null);
            setField(method, "clazz", class1);
            setField(fieldInfoMock, "method", method);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorMockType, contextMockType, fieldInfoMockType);
            _getMethod.setAccessible(true);
            java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
            _getMethodArguments[0] = methodVisitorMock;
            _getMethodArguments[1] = contextMock;
            _getMethodArguments[2] = fieldInfoMock;
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void test_get8() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.ASMUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.type(any());
            }).thenReturn(((String) null), ((String) null));
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.desc(org.mockito.ArgumentMatchers.any(Method.class));
            }).thenReturn(((String) null));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
            when(contextMock.var(anyString())).thenReturn(0);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            Method method = ((Method) createInstance("java.lang.reflect.Method"));
            setField(method, "returnType", class1);
            setField(method, "name", null);
            setField(method, "clazz", class1);
            setField(fieldInfoMock, "method", method);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorMockType, contextMockType, fieldInfoMockType);
            _getMethod.setAccessible(true);
            java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
            _getMethodArguments[0] = methodVisitorMock;
            _getMethodArguments[1] = contextMock;
            _getMethodArguments[2] = fieldInfoMock;
            _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_get9() throws Throwable  {
        org.mockito.MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(com.alibaba.fastjson.util.ASMUtils.class);
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.type(any());
            }).thenReturn(((String) null));
            mockedStatic.when(() -> {
                com.alibaba.fastjson.util.ASMUtils.desc(org.mockito.ArgumentMatchers.any(Method.class));
            }).thenReturn(((String) null));
            ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
            MethodVisitor methodVisitorMock = mock(MethodVisitor.class);
            ASMSerializerFactory.Context contextMock = mock(ASMSerializerFactory.Context.class);
            when(contextMock.var(anyString())).thenReturn(0);
            FieldInfo fieldInfoMock = mock(FieldInfo.class);
            Class class1 = Object.class;
            setField(fieldInfoMock, "fieldClass", class1);
            Method method = ((Method) createInstance("java.lang.reflect.Method"));
            setField(method, "returnType", null);
            setField(method, "name", null);
            setField(method, "clazz", class1);
            setField(fieldInfoMock, "method", method);
            
            Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
            Class methodVisitorMockType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
            Class contextMockType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
            Class fieldInfoMockType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
            Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorMockType, contextMockType, fieldInfoMockType);
            _getMethod.setAccessible(true);
            java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
            _getMethodArguments[0] = methodVisitorMock;
            _getMethodArguments[1] = contextMock;
            _getMethodArguments[2] = fieldInfoMock;
            try {
                _getMethod.invoke(aSMSerializerFactory, _getMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }} finally {
            mockedStatic.close();
        }
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testASMSerializerFactory1() {
        ASMSerializerFactory actual = new ASMSerializerFactory();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar1() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        String string = new String();
        
        context.var(string, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar2() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "variants", null);
        
        context.var(null, 0);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar3() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        String string = new String();
        
        context.var(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar4() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "variants", null);
        
        context.var(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldOrinal1() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        String string = new String();
        
        context.getFieldOrinal(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal2() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        setField(context, "getters", fieldInfoArray);
        
        int actual = context.getFieldOrinal(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldOrinal3() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        setField(context, "getters", fieldInfoArray);
        
        context.getFieldOrinal(null);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal4() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "name", string);
        fieldInfoArray[0] = fieldInfoMock;
        setField(context, "getters", fieldInfoArray);
        
        int actual = context.getFieldOrinal(string);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal5() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[1];
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "name", string);
        fieldInfoArray[0] = fieldInfoMock;
        setField(context, "getters", fieldInfoArray);
        
        int actual = context.getFieldOrinal(null);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal6() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[1];
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("\u0000");
        setField(fieldInfoMock, "name", string);
        fieldInfoArray[0] = fieldInfoMock;
        setField(context, "getters", fieldInfoArray);
        String string1 = new String("");
        
        int actual = context.getFieldOrinal(string1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal7() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        FieldInfo fieldInfoMock = mock(FieldInfo.class);
        String string = new String("");
        setField(fieldInfoMock, "name", string);
        fieldInfoArray[0] = fieldInfoMock;
        setField(context, "getters", fieldInfoArray);
        String string1 = new String("");
        
        int actual = context.getFieldOrinal(string1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testContext1() throws Throwable  {
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        String string = new String();
        new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfo, string, false, false);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContext2() throws Throwable  {
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        SerializeBeanInfo serializeBeanInfoMock = mock(SerializeBeanInfo.class);
        String string = new String("");
        ASMSerializerFactory.Context actual = new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfoMock, string, false, true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContext3() throws Throwable  {
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        SerializeBeanInfo serializeBeanInfoMock = mock(SerializeBeanInfo.class);
        Class class1 = Object.class;
        setField(serializeBeanInfoMock, "beanType", class1);
        String string = new String("");
        ASMSerializerFactory.Context actual = new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfoMock, string, false, false);
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
