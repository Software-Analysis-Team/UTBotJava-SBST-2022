package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.ByteVector;
import com.alibaba.fastjson.serializer.ASMSerializerFactory.Context;
import com.alibaba.fastjson.serializer.ASMSerializerFactory;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Field;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import com.alibaba.fastjson.asm.Label;
import java.util.LinkedHashMap;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class ASMSerializerFactoryTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_int1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", classType, methodWriterType, fieldInfoType, contextType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = null;
        _intMethodArguments[1] = methodWriter;
        _intMethodArguments[2] = null;
        _intMethodArguments[3] = context;
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
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", classType, methodVisitorType, fieldInfoType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = null;
        _longMethodArguments[1] = null;
        _longMethodArguments[2] = null;
        _longMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", classType, methodWriterType, fieldInfoType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = null;
        _longMethodArguments[1] = methodWriter;
        _longMethodArguments[2] = null;
        _longMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2);
        byte[] byteArray = new byte[0];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _longMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_long", classType, methodWriterType, fieldInfoType, contextType);
        _longMethod.setAccessible(true);
        java.lang.Object[] _longMethodArguments = new java.lang.Object[4];
        _longMethodArguments[0] = null;
        _longMethodArguments[1] = methodWriter;
        _longMethodArguments[2] = null;
        _longMethodArguments[3] = context;
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
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", true);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", classType, methodVisitorType, fieldInfoType, contextType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = null;
        _enumMethodArguments[1] = null;
        _enumMethodArguments[2] = null;
        _enumMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _enumMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_enum", classType, methodWriterType, fieldInfoType, contextType);
        _enumMethod.setAccessible(true);
        java.lang.Object[] _enumMethodArguments = new java.lang.Object[4];
        _enumMethodArguments[0] = null;
        _enumMethodArguments[1] = methodWriter;
        _enumMethodArguments[2] = null;
        _enumMethodArguments[3] = context;
        try {
            _enumMethod.invoke(aSMSerializerFactory, _enumMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_object1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", classType, methodVisitorType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = null;
        _objectMethodArguments[1] = null;
        _objectMethodArguments[2] = null;
        _objectMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2);
        byte[] byteArray = new byte[0];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", classType, methodWriterType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = null;
        _objectMethodArguments[1] = methodWriter;
        _objectMethodArguments[2] = null;
        _objectMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", classType, methodWriterType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = null;
        _objectMethodArguments[1] = methodWriter;
        _objectMethodArguments[2] = null;
        _objectMethodArguments[3] = context;
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfo, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfo, "method", method);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", true);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _objectMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_object", classType, methodVisitorType, fieldInfoType, contextType);
        _objectMethod.setAccessible(true);
        java.lang.Object[] _objectMethodArguments = new java.lang.Object[4];
        _objectMethodArguments[0] = null;
        _objectMethodArguments[1] = null;
        _objectMethodArguments[2] = fieldInfo;
        _objectMethodArguments[3] = context;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
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
    public void test_decimal1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _decimalMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_decimal", classType, methodVisitorType, fieldInfoType, contextType);
        _decimalMethod.setAccessible(true);
        java.lang.Object[] _decimalMethodArguments = new java.lang.Object[4];
        _decimalMethodArguments[0] = null;
        _decimalMethodArguments[1] = null;
        _decimalMethodArguments[2] = null;
        _decimalMethodArguments[3] = context;
        try {
            _decimalMethod.invoke(aSMSerializerFactory, _decimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_decimal2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _decimalMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_decimal", classType, methodWriterType, fieldInfoType, contextType);
        _decimalMethod.setAccessible(true);
        java.lang.Object[] _decimalMethodArguments = new java.lang.Object[4];
        _decimalMethodArguments[0] = null;
        _decimalMethodArguments[1] = methodWriter;
        _decimalMethodArguments[2] = null;
        _decimalMethodArguments[3] = context;
        try {
            _decimalMethod.invoke(aSMSerializerFactory, _decimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_decimal3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2);
        byte[] byteArray = new byte[0];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _decimalMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_decimal", classType, methodWriterType, fieldInfoType, contextType);
        _decimalMethod.setAccessible(true);
        java.lang.Object[] _decimalMethodArguments = new java.lang.Object[4];
        _decimalMethodArguments[0] = null;
        _decimalMethodArguments[1] = methodWriter;
        _decimalMethodArguments[2] = null;
        _decimalMethodArguments[3] = context;
        try {
            _decimalMethod.invoke(aSMSerializerFactory, _decimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_string1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _stringMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_string", classType, methodVisitorType, fieldInfoType, contextType);
        _stringMethod.setAccessible(true);
        java.lang.Object[] _stringMethodArguments = new java.lang.Object[4];
        _stringMethodArguments[0] = null;
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "name", string);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        setField(serializeBeanInfo, "typeKey", string);
        setField(context, "beanInfo", serializeBeanInfo);
        
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
        _stringMethodArguments[2] = fieldInfo;
        _stringMethodArguments[3] = context;
        try {
            _stringMethod.invoke(aSMSerializerFactory, _stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_string3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -1069547520);
        byte[] byteArray = new byte[0];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "name", string);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        setField(serializeBeanInfo, "typeKey", string);
        setField(context, "beanInfo", serializeBeanInfo);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _stringMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_string", classType, methodWriterType, fieldInfoType, contextType);
        _stringMethod.setAccessible(true);
        java.lang.Object[] _stringMethodArguments = new java.lang.Object[4];
        _stringMethodArguments[0] = null;
        _stringMethodArguments[1] = methodWriter;
        _stringMethodArguments[2] = fieldInfo;
        _stringMethodArguments[3] = context;
        try {
            _stringMethod.invoke(aSMSerializerFactory, _stringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_string4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "name", string);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        setField(serializeBeanInfo, "typeKey", string);
        setField(context, "beanInfo", serializeBeanInfo);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _stringMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_string", classType, methodWriterType, fieldInfoType, contextType);
        _stringMethod.setAccessible(true);
        java.lang.Object[] _stringMethodArguments = new java.lang.Object[4];
        _stringMethodArguments[0] = null;
        _stringMethodArguments[1] = methodWriter;
        _stringMethodArguments[2] = fieldInfo;
        _stringMethodArguments[3] = context;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _listMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_list", class1Type, methodWriterType, fieldInfoType, contextType);
        _listMethod.setAccessible(true);
        java.lang.Object[] _listMethodArguments = new java.lang.Object[4];
        _listMethodArguments[0] = class1;
        _listMethodArguments[1] = methodWriter;
        _listMethodArguments[2] = null;
        _listMethodArguments[3] = context;
        try {
            _listMethod.invoke(aSMSerializerFactory, _listMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_list2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[9];
        Object wildcardTypeImpl = createInstance("com.sun.beans.WildcardTypeImpl");
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        
        Type type = fieldInfo.fieldType;
        Object typeFieldTypeActualTypeArguments = getFieldValue(type, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments1 = get(typeFieldTypeActualTypeArguments, 1);
        Type type1 = fieldInfo.fieldType;
        Object type1FieldTypeActualTypeArguments = getFieldValue(type1, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments2 = get(type1FieldTypeActualTypeArguments, 2);
        Type type2 = fieldInfo.fieldType;
        Object type2FieldTypeActualTypeArguments = getFieldValue(type2, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments3 = get(type2FieldTypeActualTypeArguments, 3);
        Type type3 = fieldInfo.fieldType;
        Object type3FieldTypeActualTypeArguments = getFieldValue(type3, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments4 = get(type3FieldTypeActualTypeArguments, 4);
        Type type4 = fieldInfo.fieldType;
        Object type4FieldTypeActualTypeArguments = getFieldValue(type4, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments5 = get(type4FieldTypeActualTypeArguments, 5);
        Type type5 = fieldInfo.fieldType;
        Object type5FieldTypeActualTypeArguments = getFieldValue(type5, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments6 = get(type5FieldTypeActualTypeArguments, 6);
        Type type6 = fieldInfo.fieldType;
        Object type6FieldTypeActualTypeArguments = getFieldValue(type6, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments7 = get(type6FieldTypeActualTypeArguments, 7);
        Type type7 = fieldInfo.fieldType;
        Object type7FieldTypeActualTypeArguments = getFieldValue(type7, "actualTypeArguments");
        Object initialFieldInfoFieldTypeActualTypeArguments8 = get(type7FieldTypeActualTypeArguments, 8);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _listMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_list", classType, methodVisitorType, fieldInfoType, contextType);
        _listMethod.setAccessible(true);
        java.lang.Object[] _listMethodArguments = new java.lang.Object[4];
        _listMethodArguments[0] = null;
        _listMethodArguments[1] = null;
        _listMethodArguments[2] = fieldInfo;
        _listMethodArguments[3] = null;
        try {
            _listMethod.invoke(aSMSerializerFactory, _listMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Type type8 = fieldInfo.fieldType;
        Object type8FieldTypeActualTypeArguments = getFieldValue(type8, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments1 = get(type8FieldTypeActualTypeArguments, 1);
        Type type9 = fieldInfo.fieldType;
        Object type9FieldTypeActualTypeArguments = getFieldValue(type9, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments2 = get(type9FieldTypeActualTypeArguments, 2);
        Type type10 = fieldInfo.fieldType;
        Object type10FieldTypeActualTypeArguments = getFieldValue(type10, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments3 = get(type10FieldTypeActualTypeArguments, 3);
        Type type11 = fieldInfo.fieldType;
        Object type11FieldTypeActualTypeArguments = getFieldValue(type11, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments4 = get(type11FieldTypeActualTypeArguments, 4);
        Type type12 = fieldInfo.fieldType;
        Object type12FieldTypeActualTypeArguments = getFieldValue(type12, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments5 = get(type12FieldTypeActualTypeArguments, 5);
        Type type13 = fieldInfo.fieldType;
        Object type13FieldTypeActualTypeArguments = getFieldValue(type13, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments6 = get(type13FieldTypeActualTypeArguments, 6);
        Type type14 = fieldInfo.fieldType;
        Object type14FieldTypeActualTypeArguments = getFieldValue(type14, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments7 = get(type14FieldTypeActualTypeArguments, 7);
        Type type15 = fieldInfo.fieldType;
        Object type15FieldTypeActualTypeArguments = getFieldValue(type15, "actualTypeArguments");
        Object finalFieldInfoFieldTypeActualTypeArguments8 = get(type15FieldTypeActualTypeArguments, 8);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments1);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments2);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments3);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments4);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments5);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments6);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments7);
        
        assertNull(finalFieldInfoFieldTypeActualTypeArguments8);
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _afterMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_after", methodWriterType, contextType);
        _afterMethod.setAccessible(true);
        java.lang.Object[] _afterMethodArguments = new java.lang.Object[2];
        _afterMethodArguments[0] = methodWriter;
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
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", true);
        
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
        _notWriteDefaultMethodArguments[2] = context;
        _notWriteDefaultMethodArguments[3] = null;
        _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodWriterType, fieldInfoType, contextType);
        _if_write_nullMethod.setAccessible(true);
        java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
        _if_write_nullMethodArguments[0] = methodWriter;
        _if_write_nullMethodArguments[1] = null;
        _if_write_nullMethodArguments[2] = context;
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _if_write_nullMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_if_write_null", methodVisitorType, fieldInfoType, contextType);
        _if_write_nullMethod.setAccessible(true);
        java.lang.Object[] _if_write_nullMethodArguments = new java.lang.Object[3];
        _if_write_nullMethodArguments[0] = null;
        _if_write_nullMethodArguments[1] = fieldInfo;
        _if_write_nullMethodArguments[2] = null;
        try {
            _if_write_nullMethod.invoke(aSMSerializerFactory, _if_write_nullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", true);
        
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
    public void test_seperator3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 21);
        byte[] byteArray = new byte[32];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _seperatorMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_seperator", methodWriterType, contextType);
        _seperatorMethod.setAccessible(true);
        java.lang.Object[] _seperatorMethodArguments = new java.lang.Object[2];
        _seperatorMethodArguments[0] = methodWriter;
        _seperatorMethodArguments[1] = null;
        try {
            _seperatorMethod.invoke(aSMSerializerFactory, _seperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object methodWriterCode = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeLength = getFieldValue(methodWriterCode, "length");
        Object methodWriterCode1 = getFieldValue(methodWriter, "code");
        Object methodWriterCode1CodeData = getFieldValue(methodWriterCode1, "data");
        Object finalMethodWriterCodeData21 = get(methodWriterCode1CodeData, 21);
        Object methodWriterCode2 = getFieldValue(methodWriter, "code");
        Object methodWriterCode2CodeData = getFieldValue(methodWriterCode2, "data");
        Object finalMethodWriterCodeData22 = get(methodWriterCode2CodeData, 22);
        
        assertEquals(23, finalMethodWriterCodeLength);
        
        assertEquals((byte) 16, finalMethodWriterCodeData21);
        
        assertEquals((byte) 44, finalMethodWriterCodeData22);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getListFieldItemSer1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class classType = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextType, methodVisitorType, fieldInfoType, classType);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = null;
        _getListFieldItemSerMethodArguments[1] = null;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = null;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class classType = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextType, methodWriterType, fieldInfoType, classType);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = null;
        _getListFieldItemSerMethodArguments[1] = methodWriter;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = null;
        try {
            _getListFieldItemSerMethod.invoke(aSMSerializerFactory, _getListFieldItemSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getListFieldItemSer3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 8);
        byte[] byteArray = new byte[1];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class classType = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextType, methodWriterType, fieldInfoType, classType);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = null;
        _getListFieldItemSerMethodArguments[1] = methodWriter;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = null;
        try {
            _getListFieldItemSerMethod.invoke(aSMSerializerFactory, _getListFieldItemSerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_getListFieldItemSer4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 18);
        byte[] byteArray = new byte[17];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class classType = Class.forName("java.lang.Class");
        Method _getListFieldItemSerMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_getListFieldItemSer", contextType, methodWriterType, fieldInfoType, classType);
        _getListFieldItemSerMethod.setAccessible(true);
        java.lang.Object[] _getListFieldItemSerMethodArguments = new java.lang.Object[4];
        _getListFieldItemSerMethodArguments[0] = null;
        _getListFieldItemSerMethodArguments[1] = methodWriter;
        _getListFieldItemSerMethodArguments[2] = null;
        _getListFieldItemSerMethodArguments[3] = null;
        try {
            _getListFieldItemSerMethod.invoke(aSMSerializerFactory, _getListFieldItemSerMethodArguments);
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodWriterType, contextType, fieldInfoType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = methodWriter;
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfo, "method", method);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Method _getMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_get", methodVisitorType, contextType, fieldInfoType);
        _getMethod.setAccessible(true);
        java.lang.Object[] _getMethodArguments = new java.lang.Object[3];
        _getMethodArguments[0] = null;
        _getMethodArguments[1] = null;
        _getMethodArguments[2] = fieldInfo;
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
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfo, "method", method);
        
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
    
    @Test(timeout = 10000)
    public void testASMSerializerFactory1() {
        ASMSerializerFactory actual = new ASMSerializerFactory();
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testASMSerializerFactory_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
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
        String string = new String("");
        
        Object initialContextVariants = getFieldValue(context, "variants");
        
        context.var(string, 0);
        
        Object finalContextVariants = getFieldValue(context, "variants");
        
        assertNull(finalContextVariants);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testVar3() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        String string = new String("");
        
        int actual = context.var(string, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar4() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        String string = new String();
        
        context.var(string);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testVar5() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "variants", null);
        String string = new String("");
        
        Object initialContextVariants = getFieldValue(context, "variants");
        
        context.var(string);
        
        Object finalContextVariants = getFieldValue(context, "variants");
        
        assertNull(finalContextVariants);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testVar6() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        String string = new String("");
        
        int actual = context.var(string);
        
        assertEquals(0, actual);
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
        String string = new String("");
        
        int actual = context.getFieldOrinal(string);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testGetFieldOrinal3() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        setField(context, "getters", fieldInfoArray);
        
        Object contextGetters = getFieldValue(context, "getters");
        Object initialContextGetters0 = get(contextGetters, 0);
        Object contextGetters1 = getFieldValue(context, "getters");
        Object initialContextGetters1 = get(contextGetters1, 1);
        Object contextGetters2 = getFieldValue(context, "getters");
        Object initialContextGetters2 = get(contextGetters2, 2);
        Object contextGetters3 = getFieldValue(context, "getters");
        Object initialContextGetters3 = get(contextGetters3, 3);
        Object contextGetters4 = getFieldValue(context, "getters");
        Object initialContextGetters4 = get(contextGetters4, 4);
        Object contextGetters5 = getFieldValue(context, "getters");
        Object initialContextGetters5 = get(contextGetters5, 5);
        Object contextGetters6 = getFieldValue(context, "getters");
        Object initialContextGetters6 = get(contextGetters6, 6);
        Object contextGetters7 = getFieldValue(context, "getters");
        Object initialContextGetters7 = get(contextGetters7, 7);
        Object contextGetters8 = getFieldValue(context, "getters");
        Object initialContextGetters8 = get(contextGetters8, 8);
        
        context.getFieldOrinal(null);
        
        Object contextGetters9 = getFieldValue(context, "getters");
        Object finalContextGetters0 = get(contextGetters9, 0);
        Object contextGetters10 = getFieldValue(context, "getters");
        Object finalContextGetters1 = get(contextGetters10, 1);
        Object contextGetters11 = getFieldValue(context, "getters");
        Object finalContextGetters2 = get(contextGetters11, 2);
        Object contextGetters12 = getFieldValue(context, "getters");
        Object finalContextGetters3 = get(contextGetters12, 3);
        Object contextGetters13 = getFieldValue(context, "getters");
        Object finalContextGetters4 = get(contextGetters13, 4);
        Object contextGetters14 = getFieldValue(context, "getters");
        Object finalContextGetters5 = get(contextGetters14, 5);
        Object contextGetters15 = getFieldValue(context, "getters");
        Object finalContextGetters6 = get(contextGetters15, 6);
        Object contextGetters16 = getFieldValue(context, "getters");
        Object finalContextGetters7 = get(contextGetters16, 7);
        Object contextGetters17 = getFieldValue(context, "getters");
        Object finalContextGetters8 = get(contextGetters17, 8);
        
        assertNull(finalContextGetters0);
        
        assertNull(finalContextGetters1);
        
        assertNull(finalContextGetters2);
        
        assertNull(finalContextGetters3);
        
        assertNull(finalContextGetters4);
        
        assertNull(finalContextGetters5);
        
        assertNull(finalContextGetters6);
        
        assertNull(finalContextGetters7);
        
        assertNull(finalContextGetters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal4() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "name", string);
        fieldInfoArray[0] = fieldInfo;
        setField(context, "getters", fieldInfoArray);
        
        Object contextGetters = getFieldValue(context, "getters");
        Object initialContextGetters1 = get(contextGetters, 1);
        Object contextGetters1 = getFieldValue(context, "getters");
        Object initialContextGetters2 = get(contextGetters1, 2);
        Object contextGetters2 = getFieldValue(context, "getters");
        Object initialContextGetters3 = get(contextGetters2, 3);
        Object contextGetters3 = getFieldValue(context, "getters");
        Object initialContextGetters4 = get(contextGetters3, 4);
        Object contextGetters4 = getFieldValue(context, "getters");
        Object initialContextGetters5 = get(contextGetters4, 5);
        Object contextGetters5 = getFieldValue(context, "getters");
        Object initialContextGetters6 = get(contextGetters5, 6);
        Object contextGetters6 = getFieldValue(context, "getters");
        Object initialContextGetters7 = get(contextGetters6, 7);
        Object contextGetters7 = getFieldValue(context, "getters");
        Object initialContextGetters8 = get(contextGetters7, 8);
        
        int actual = context.getFieldOrinal(string);
        
        assertEquals(0, actual);
        
        Object contextGetters8 = getFieldValue(context, "getters");
        Object finalContextGetters1 = get(contextGetters8, 1);
        Object contextGetters9 = getFieldValue(context, "getters");
        Object finalContextGetters2 = get(contextGetters9, 2);
        Object contextGetters10 = getFieldValue(context, "getters");
        Object finalContextGetters3 = get(contextGetters10, 3);
        Object contextGetters11 = getFieldValue(context, "getters");
        Object finalContextGetters4 = get(contextGetters11, 4);
        Object contextGetters12 = getFieldValue(context, "getters");
        Object finalContextGetters5 = get(contextGetters12, 5);
        Object contextGetters13 = getFieldValue(context, "getters");
        Object finalContextGetters6 = get(contextGetters13, 6);
        Object contextGetters14 = getFieldValue(context, "getters");
        Object finalContextGetters7 = get(contextGetters14, 7);
        Object contextGetters15 = getFieldValue(context, "getters");
        Object finalContextGetters8 = get(contextGetters15, 8);
        
        assertNull(finalContextGetters1);
        
        assertNull(finalContextGetters2);
        
        assertNull(finalContextGetters3);
        
        assertNull(finalContextGetters4);
        
        assertNull(finalContextGetters5);
        
        assertNull(finalContextGetters6);
        
        assertNull(finalContextGetters7);
        
        assertNull(finalContextGetters8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetFieldOrinal5() throws Throwable  {
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[1];
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        String string = new String("");
        setField(fieldInfo, "name", string);
        fieldInfoArray[0] = fieldInfo;
        setField(context, "getters", fieldInfoArray);
        
        int actual = context.getFieldOrinal(null);
        
        assertEquals(-1, actual);
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
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[0];
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        String string = new String("");
        ASMSerializerFactory.Context actual = new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfo, string, false, true);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testContext3() throws Throwable  {
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
        Class class1 = Object.class;
        setField(serializeBeanInfo, "beanType", class1);
        String string = new String("");
        
        FieldInfo initialFieldInfoArray0 = fieldInfoArray[0];
        FieldInfo initialFieldInfoArray1 = fieldInfoArray[1];
        FieldInfo initialFieldInfoArray2 = fieldInfoArray[2];
        FieldInfo initialFieldInfoArray3 = fieldInfoArray[3];
        FieldInfo initialFieldInfoArray4 = fieldInfoArray[4];
        FieldInfo initialFieldInfoArray5 = fieldInfoArray[5];
        FieldInfo initialFieldInfoArray6 = fieldInfoArray[6];
        FieldInfo initialFieldInfoArray7 = fieldInfoArray[7];
        FieldInfo initialFieldInfoArray8 = fieldInfoArray[8];
        ASMSerializerFactory.Context actual = new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfo, string, false, false);
        
        FieldInfo finalFieldInfoArray0 = fieldInfoArray[0];
        FieldInfo finalFieldInfoArray1 = fieldInfoArray[1];
        FieldInfo finalFieldInfoArray2 = fieldInfoArray[2];
        FieldInfo finalFieldInfoArray3 = fieldInfoArray[3];
        FieldInfo finalFieldInfoArray4 = fieldInfoArray[4];
        FieldInfo finalFieldInfoArray5 = fieldInfoArray[5];
        FieldInfo finalFieldInfoArray6 = fieldInfoArray[6];
        FieldInfo finalFieldInfoArray7 = fieldInfoArray[7];
        FieldInfo finalFieldInfoArray8 = fieldInfoArray[8];
        
        assertNull(finalFieldInfoArray0);
        
        assertNull(finalFieldInfoArray1);
        
        assertNull(finalFieldInfoArray2);
        
        assertNull(finalFieldInfoArray3);
        
        assertNull(finalFieldInfoArray4);
        
        assertNull(finalFieldInfoArray5);
        
        assertNull(finalFieldInfoArray6);
        
        assertNull(finalFieldInfoArray7);
        
        assertNull(finalFieldInfoArray8);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
