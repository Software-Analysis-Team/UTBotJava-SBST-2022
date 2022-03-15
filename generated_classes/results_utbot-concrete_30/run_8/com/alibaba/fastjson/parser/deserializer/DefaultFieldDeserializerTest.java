package com.alibaba.fastjson.serializer;

import org.junit.Test;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.ByteVector;
import com.alibaba.fastjson.serializer.ASMSerializerFactory.Context;
import com.alibaba.fastjson.serializer.ASMSerializerFactory;
import java.lang.reflect.Method;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import com.alibaba.fastjson.asm.Label;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

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
    public void test_int2() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfo, "field", field);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", true);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class intType = int.class;
        Class charType = char.class;
        Method _intMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_int", classType, methodVisitorType, fieldInfoType, contextType, intType, charType);
        _intMethod.setAccessible(true);
        java.lang.Object[] _intMethodArguments = new java.lang.Object[6];
        _intMethodArguments[0] = null;
        _intMethodArguments[1] = null;
        _intMethodArguments[2] = fieldInfo;
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
    public void test_long3() throws Throwable  {
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
    public void test_enum3() throws Throwable  {
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
    public void testGenerateWriteMethod1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoArrayType = Class.forName("[Lcom.alibaba.fastjson.util.FieldInfo;");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method generateWriteMethodMethod = aSMSerializerFactoryClazz.getDeclaredMethod("generateWriteMethod", classType, methodVisitorType, fieldInfoArrayType, contextType);
        generateWriteMethodMethod.setAccessible(true);
        java.lang.Object[] generateWriteMethodMethodArguments = new java.lang.Object[4];
        generateWriteMethodMethodArguments[0] = null;
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
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        setField(context, "writeDirect", false);
        
        FieldInfo initialFieldInfoArray0 = fieldInfoArray[0];
        FieldInfo initialFieldInfoArray1 = fieldInfoArray[1];
        FieldInfo initialFieldInfoArray2 = fieldInfoArray[2];
        FieldInfo initialFieldInfoArray3 = fieldInfoArray[3];
        FieldInfo initialFieldInfoArray4 = fieldInfoArray[4];
        FieldInfo initialFieldInfoArray5 = fieldInfoArray[5];
        FieldInfo initialFieldInfoArray6 = fieldInfoArray[6];
        FieldInfo initialFieldInfoArray7 = fieldInfoArray[7];
        FieldInfo initialFieldInfoArray8 = fieldInfoArray[8];
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class classType = Class.forName("java.lang.Class");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoArrayType = Class.forName("[Lcom.alibaba.fastjson.util.FieldInfo;");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method generateWriteMethodMethod = aSMSerializerFactoryClazz.getDeclaredMethod("generateWriteMethod", classType, methodVisitorType, fieldInfoArrayType, contextType);
        generateWriteMethodMethod.setAccessible(true);
        java.lang.Object[] generateWriteMethodMethodArguments = new java.lang.Object[4];
        generateWriteMethodMethodArguments[0] = null;
        generateWriteMethodMethodArguments[1] = null;
        generateWriteMethodMethodArguments[2] = ((Object) fieldInfoArray);
        generateWriteMethodMethodArguments[3] = context;
        try {
            generateWriteMethodMethod.invoke(aSMSerializerFactory, generateWriteMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void test_object3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 33);
        byte[] byteArray = new byte[33];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
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
        _objectMethodArguments[2] = fieldInfo;
        _objectMethodArguments[3] = context;
        try {
            _objectMethod.invoke(aSMSerializerFactory, _objectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object methodWriterCode = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeLength = getFieldValue(methodWriterCode, "length");
        Object methodWriterCode1 = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeData = getFieldValue(methodWriterCode1, "data");
        
        assertEquals(38, finalMethodWriterCodeLength);
        
    }
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Field field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(fieldInfo, "field", field);
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(fieldInfo, "method", method);
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        setField(context, "writeDirect", true);
        
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
        _decimalMethodArguments[2] = fieldInfo;
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
        setField(byteVector, "length", 33);
        byte[] byteArray = new byte[33];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
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
        _decimalMethodArguments[2] = fieldInfo;
        _decimalMethodArguments[3] = context;
        try {
            _decimalMethod.invoke(aSMSerializerFactory, _decimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object methodWriterCode = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeLength = getFieldValue(methodWriterCode, "length");
        Object methodWriterCode1 = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeData = getFieldValue(methodWriterCode1, "data");
        
        assertEquals(38, finalMethodWriterCodeLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_decimal4() throws Throwable  {
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
    public void test_string4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2147483313);
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
    public void test_list1() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        
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
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] typeArray = new java.lang.reflect.Type[1];
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        typeArray[0] = ((Type) wildcardTypeImpl);
        setField(parameterizedTypeImpl, "actualTypeArguments", typeArray);
        setField(fieldInfo, "fieldType", parameterizedTypeImpl);
        
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
        }}
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 15);
        byte[] byteArray = new byte[9];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _beforeMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_before", methodWriterType, contextType);
        _beforeMethod.setAccessible(true);
        java.lang.Object[] _beforeMethodArguments = new java.lang.Object[2];
        _beforeMethodArguments[0] = methodWriter;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 2147483646);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
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
    public void test_after4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 34);
        byte[] byteArray = new byte[33];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
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
    public void test_after5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", -2);
        byte[] byteArray = new byte[10];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        
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
    public void test_notWriteDefault3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        setField(context, "writeDirect", false);
        
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
        try {
            _notWriteDefaultMethod.invoke(aSMSerializerFactory, _notWriteDefaultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodVisitorType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodVisitorType, fieldInfoType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = null;
        _applyMethodArguments[1] = fieldInfo;
        _applyMethodArguments[2] = null;
        try {
            _applyMethod.invoke(aSMSerializerFactory, _applyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_apply4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 18);
        byte[] byteArray = new byte[18];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodWriterType, fieldInfoType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = methodWriter;
        _applyMethodArguments[1] = fieldInfo;
        _applyMethodArguments[2] = null;
        try {
            _applyMethod.invoke(aSMSerializerFactory, _applyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object methodWriterCode = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeLength = getFieldValue(methodWriterCode, "length");
        Object methodWriterCode1 = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeData = getFieldValue(methodWriterCode1, "data");
        
        assertEquals(23, finalMethodWriterCodeLength);
        
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void test_apply5() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 8);
        byte[] byteArray = new byte[1];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Method _applyMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_apply", methodWriterType, fieldInfoType, contextType);
        _applyMethod.setAccessible(true);
        java.lang.Object[] _applyMethodArguments = new java.lang.Object[3];
        _applyMethodArguments[0] = methodWriter;
        _applyMethodArguments[1] = fieldInfo;
        _applyMethodArguments[2] = null;
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
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
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
    public void test_processValue4() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 8);
        byte[] byteArray = new byte[1];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodWriterType, fieldInfoType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = methodWriter;
        _processValueMethodArguments[1] = fieldInfo;
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
        MethodWriter methodWriter = ((MethodWriter) createInstance("com.alibaba.fastjson.asm.MethodWriter"));
        ByteVector byteVector = ((ByteVector) createInstance("com.alibaba.fastjson.asm.ByteVector"));
        setField(byteVector, "length", 34);
        byte[] byteArray = new byte[34];
        setField(byteVector, "data", byteArray);
        setField(methodWriter, "code", byteVector);
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        Class class1 = Object.class;
        setField(fieldInfo, "fieldClass", class1);
        Label label = ((Label) createInstance("com.alibaba.fastjson.asm.Label"));
        
        Class aSMSerializerFactoryClazz = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory");
        Class methodWriterType = Class.forName("com.alibaba.fastjson.asm.MethodVisitor");
        Class fieldInfoType = Class.forName("com.alibaba.fastjson.util.FieldInfo");
        Class contextType = Class.forName("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context");
        Class labelType = Class.forName("com.alibaba.fastjson.asm.Label");
        Method _processValueMethod = aSMSerializerFactoryClazz.getDeclaredMethod("_processValue", methodWriterType, fieldInfoType, contextType, labelType);
        _processValueMethod.setAccessible(true);
        java.lang.Object[] _processValueMethodArguments = new java.lang.Object[4];
        _processValueMethodArguments[0] = methodWriter;
        _processValueMethodArguments[1] = fieldInfo;
        _processValueMethodArguments[2] = null;
        _processValueMethodArguments[3] = label;
        try {
            _processValueMethod.invoke(aSMSerializerFactory, _processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object methodWriterCode = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeLength = getFieldValue(methodWriterCode, "length");
        Object methodWriterCode1 = getFieldValue(methodWriter, "code");
        Object finalMethodWriterCodeData = getFieldValue(methodWriterCode1, "data");
        
        assertEquals(37, finalMethodWriterCodeLength);
        
    }
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
    public void test_processKey3() throws Throwable  {
        ASMSerializerFactory aSMSerializerFactory = ((ASMSerializerFactory) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory"));
        FieldInfo fieldInfo = ((FieldInfo) createInstance("com.alibaba.fastjson.util.FieldInfo"));
        ASMSerializerFactory.Context context = ((ASMSerializerFactory.Context) createInstance("com.alibaba.fastjson.serializer.ASMSerializerFactory$Context"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(context, "variants", linkedHashMap);
        
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
        
        Object initialContextVariants = getFieldValue(context, "variants");
        
        context.var(null, 0);
        
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
        
        Object initialContextVariants = getFieldValue(context, "variants");
        
        context.var(null);
        
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
        com.alibaba.fastjson.util.FieldInfo[] fieldInfoArray = new com.alibaba.fastjson.util.FieldInfo[9];
        SerializeBeanInfo serializeBeanInfo = ((SerializeBeanInfo) createInstance("com.alibaba.fastjson.serializer.SerializeBeanInfo"));
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
        ASMSerializerFactory.Context actual = new ASMSerializerFactory.Context(fieldInfoArray, serializeBeanInfo, string, false, true);
        
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
