package spoon.support.compiler.jdt;

import org.junit.Test;
import spoon.compiler.builder.JDTBuilder;
import spoon.reflect.factory.FactoryImpl;
import sun.security.util.Debug;
import java.lang.reflect.Method;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblem;
import spoon.support.compiler.FilteringFolder;
import java.util.LinkedHashSet;
import spoon.support.StandardEnvironment;
import spoon.reflect.factory.Factory;
import spoon.compiler.builder.JDTBuilderImpl;
import spoon.support.compiler.VirtualFolder;
import spoon.reflect.cu.CompilationUnit;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public class JDTSnippetCompilerTest {
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuild1() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        jDTSnippetCompiler.build(((JDTBuilder) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuild2() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        setField(jDTSnippetCompiler, "factory", null);
        
        jDTSnippetCompiler.build(((JDTBuilder) null));
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuild3() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        setField(jDTSnippetCompiler, "sources", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(jDTSnippetCompiler, "factory", factoryImpl);
        
        jDTSnippetCompiler.build(((JDTBuilder) null));
    }
    ///endregion
    
    
    ///region Errors report for build
    
    public void testBuild_errors()
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
    public void testBuild5() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        jDTSnippetCompiler.build();
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuild6() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        setField(jDTSnippetCompiler, "factory", null);
        
        jDTSnippetCompiler.build();
    }
    ///endregion
    
    
    ///region Errors report for build
    
    public void testBuild_errors1()
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
    public void testReport1() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class environmentType = Class.forName("spoon.compiler.Environment");
        Class categorizedProblemType = Class.forName("org.eclipse.jdt.core.compiler.CategorizedProblem");
        Method reportMethod = jDTSnippetCompilerClazz.getDeclaredMethod("report", environmentType, categorizedProblemType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[2];
        reportMethodArguments[0] = null;
        reportMethodArguments[1] = null;
        try {
            reportMethod.invoke(jDTSnippetCompiler, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReport2() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class environmentType = Class.forName("spoon.compiler.Environment");
        Class categorizedProblemType = Class.forName("org.eclipse.jdt.core.compiler.CategorizedProblem");
        Method reportMethod = jDTSnippetCompilerClazz.getDeclaredMethod("report", environmentType, categorizedProblemType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[2];
        reportMethodArguments[0] = null;
        reportMethodArguments[1] = null;
        try {
            reportMethod.invoke(jDTSnippetCompiler, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testReport3() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        DefaultProblem defaultProblem = ((DefaultProblem) createInstance("org.eclipse.jdt.internal.compiler.problem.DefaultProblem"));
        setField(defaultProblem, "severity", 1);
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class environmentType = Class.forName("spoon.compiler.Environment");
        Class defaultProblemType = Class.forName("org.eclipse.jdt.core.compiler.CategorizedProblem");
        Method reportMethod = jDTSnippetCompilerClazz.getDeclaredMethod("report", environmentType, defaultProblemType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[2];
        reportMethodArguments[0] = null;
        reportMethodArguments[1] = defaultProblem;
        try {
            reportMethod.invoke(jDTSnippetCompiler, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testReport4() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        DefaultProblem defaultProblem = ((DefaultProblem) createInstance("org.eclipse.jdt.internal.compiler.problem.DefaultProblem"));
        setField(defaultProblem, "severity", 0);
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class environmentType = Class.forName("spoon.compiler.Environment");
        Class defaultProblemType = Class.forName("org.eclipse.jdt.core.compiler.CategorizedProblem");
        Method reportMethod = jDTSnippetCompilerClazz.getDeclaredMethod("report", environmentType, defaultProblemType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[2];
        reportMethodArguments[0] = null;
        reportMethodArguments[1] = defaultProblem;
        reportMethod.invoke(jDTSnippetCompiler, reportMethodArguments);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuildSources1() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class jDTBuilderType = Class.forName("spoon.compiler.builder.JDTBuilder");
        Method buildSourcesMethod = jDTSnippetCompilerClazz.getDeclaredMethod("buildSources", jDTBuilderType);
        buildSourcesMethod.setAccessible(true);
        java.lang.Object[] buildSourcesMethodArguments = new java.lang.Object[1];
        buildSourcesMethodArguments[0] = null;
        try {
            buildSourcesMethod.invoke(jDTSnippetCompiler, buildSourcesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    
    ///region Errors report for buildSources
    
    public void testBuildSources_errors()
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
    public void testBuildSources3() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        FilteringFolder filteringFolder = ((FilteringFolder) createInstance("spoon.support.compiler.FilteringFolder"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer integer = 0;
        linkedHashSet.add(integer);
        linkedHashSet.add(integer);
        setField(filteringFolder, "files", linkedHashSet);
        setField(jDTSnippetCompiler, "sources", filteringFolder);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        java.lang.String[] stringArray = new java.lang.String[9];
        setField(standardEnvironment, "sourceClasspath", stringArray);
        setField(factoryImpl, "environment", standardEnvironment);
        setField(jDTSnippetCompiler, "factory", factoryImpl);
        
        Factory factory = jDTSnippetCompiler.factory;
        Object factoryFactoryEnvironment = getFieldValue(factory, "environment");
        Object factoryFactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factoryFactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath0 = get(factoryFactoryEnvironmentFactoryEnvironmentSourceClasspath, 0);
        Factory factory1 = jDTSnippetCompiler.factory;
        Object factory1FactoryEnvironment = getFieldValue(factory1, "environment");
        Object factory1FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory1FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath1 = get(factory1FactoryEnvironmentFactoryEnvironmentSourceClasspath, 1);
        Factory factory2 = jDTSnippetCompiler.factory;
        Object factory2FactoryEnvironment = getFieldValue(factory2, "environment");
        Object factory2FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory2FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath2 = get(factory2FactoryEnvironmentFactoryEnvironmentSourceClasspath, 2);
        Factory factory3 = jDTSnippetCompiler.factory;
        Object factory3FactoryEnvironment = getFieldValue(factory3, "environment");
        Object factory3FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory3FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath3 = get(factory3FactoryEnvironmentFactoryEnvironmentSourceClasspath, 3);
        Factory factory4 = jDTSnippetCompiler.factory;
        Object factory4FactoryEnvironment = getFieldValue(factory4, "environment");
        Object factory4FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory4FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath4 = get(factory4FactoryEnvironmentFactoryEnvironmentSourceClasspath, 4);
        Factory factory5 = jDTSnippetCompiler.factory;
        Object factory5FactoryEnvironment = getFieldValue(factory5, "environment");
        Object factory5FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory5FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath5 = get(factory5FactoryEnvironmentFactoryEnvironmentSourceClasspath, 5);
        Factory factory6 = jDTSnippetCompiler.factory;
        Object factory6FactoryEnvironment = getFieldValue(factory6, "environment");
        Object factory6FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory6FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath6 = get(factory6FactoryEnvironmentFactoryEnvironmentSourceClasspath, 6);
        Factory factory7 = jDTSnippetCompiler.factory;
        Object factory7FactoryEnvironment = getFieldValue(factory7, "environment");
        Object factory7FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory7FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath7 = get(factory7FactoryEnvironmentFactoryEnvironmentSourceClasspath, 7);
        Factory factory8 = jDTSnippetCompiler.factory;
        Object factory8FactoryEnvironment = getFieldValue(factory8, "environment");
        Object factory8FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory8FactoryEnvironment, "sourceClasspath");
        Object initialJDTSnippetCompilerFactoryEnvironmentSourceClasspath8 = get(factory8FactoryEnvironmentFactoryEnvironmentSourceClasspath, 8);
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class jDTBuilderType = Class.forName("spoon.compiler.builder.JDTBuilder");
        Method buildSourcesMethod = jDTSnippetCompilerClazz.getDeclaredMethod("buildSources", jDTBuilderType);
        buildSourcesMethod.setAccessible(true);
        java.lang.Object[] buildSourcesMethodArguments = new java.lang.Object[1];
        buildSourcesMethodArguments[0] = null;
        try {
            buildSourcesMethod.invoke(jDTSnippetCompiler, buildSourcesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Factory factory9 = jDTSnippetCompiler.factory;
        Object factory9FactoryEnvironment = getFieldValue(factory9, "environment");
        Object factory9FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory9FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath0 = get(factory9FactoryEnvironmentFactoryEnvironmentSourceClasspath, 0);
        Factory factory10 = jDTSnippetCompiler.factory;
        Object factory10FactoryEnvironment = getFieldValue(factory10, "environment");
        Object factory10FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory10FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath1 = get(factory10FactoryEnvironmentFactoryEnvironmentSourceClasspath, 1);
        Factory factory11 = jDTSnippetCompiler.factory;
        Object factory11FactoryEnvironment = getFieldValue(factory11, "environment");
        Object factory11FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory11FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath2 = get(factory11FactoryEnvironmentFactoryEnvironmentSourceClasspath, 2);
        Factory factory12 = jDTSnippetCompiler.factory;
        Object factory12FactoryEnvironment = getFieldValue(factory12, "environment");
        Object factory12FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory12FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath3 = get(factory12FactoryEnvironmentFactoryEnvironmentSourceClasspath, 3);
        Factory factory13 = jDTSnippetCompiler.factory;
        Object factory13FactoryEnvironment = getFieldValue(factory13, "environment");
        Object factory13FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory13FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath4 = get(factory13FactoryEnvironmentFactoryEnvironmentSourceClasspath, 4);
        Factory factory14 = jDTSnippetCompiler.factory;
        Object factory14FactoryEnvironment = getFieldValue(factory14, "environment");
        Object factory14FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory14FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath5 = get(factory14FactoryEnvironmentFactoryEnvironmentSourceClasspath, 5);
        Factory factory15 = jDTSnippetCompiler.factory;
        Object factory15FactoryEnvironment = getFieldValue(factory15, "environment");
        Object factory15FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory15FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath6 = get(factory15FactoryEnvironmentFactoryEnvironmentSourceClasspath, 6);
        Factory factory16 = jDTSnippetCompiler.factory;
        Object factory16FactoryEnvironment = getFieldValue(factory16, "environment");
        Object factory16FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory16FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath7 = get(factory16FactoryEnvironmentFactoryEnvironmentSourceClasspath, 7);
        Factory factory17 = jDTSnippetCompiler.factory;
        Object factory17FactoryEnvironment = getFieldValue(factory17, "environment");
        Object factory17FactoryEnvironmentFactoryEnvironmentSourceClasspath = getFieldValue(factory17FactoryEnvironment, "sourceClasspath");
        Object finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath8 = get(factory17FactoryEnvironmentFactoryEnvironmentSourceClasspath, 8);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath0);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath1);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath2);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath3);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath4);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath5);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath6);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath7);
        
        assertNull(finalJDTSnippetCompilerFactoryEnvironmentSourceClasspath8);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuildSources4() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        setField(jDTSnippetCompiler, "sources", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
        setField(jDTSnippetCompiler, "factory", factoryImpl);
        JDTBuilderImpl jDTBuilderImpl = ((JDTBuilderImpl) createInstance("spoon.compiler.builder.JDTBuilderImpl"));
        
        Factory factory = jDTSnippetCompiler.factory;
        Object initialJDTSnippetCompilerFactoryEnvironment = getFieldValue(factory, "environment");
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class jDTBuilderImplType = Class.forName("spoon.compiler.builder.JDTBuilder");
        Method buildSourcesMethod = jDTSnippetCompilerClazz.getDeclaredMethod("buildSources", jDTBuilderImplType);
        buildSourcesMethod.setAccessible(true);
        java.lang.Object[] buildSourcesMethodArguments = new java.lang.Object[1];
        buildSourcesMethodArguments[0] = jDTBuilderImpl;
        try {
            buildSourcesMethod.invoke(jDTSnippetCompiler, buildSourcesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Factory factory1 = jDTSnippetCompiler.factory;
        Object finalJDTSnippetCompilerFactoryEnvironment = getFieldValue(factory1, "environment");
        
        assertFalse(initialJDTSnippetCompilerFactoryEnvironment == finalJDTSnippetCompilerFactoryEnvironment);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000, expected = Throwable.class)
    public void testBuildSources5() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        VirtualFolder virtualFolder = ((VirtualFolder) createInstance("spoon.support.compiler.VirtualFolder"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(virtualFolder, "files", linkedHashSet);
        setField(jDTSnippetCompiler, "sources", virtualFolder);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        StandardEnvironment standardEnvironment = ((StandardEnvironment) createInstance("spoon.support.StandardEnvironment"));
        setField(standardEnvironment, "sourceClasspath", null);
        setField(factoryImpl, "environment", standardEnvironment);
        setField(jDTSnippetCompiler, "factory", factoryImpl);
        JDTBuilderImpl jDTBuilderImpl = ((JDTBuilderImpl) createInstance("spoon.compiler.builder.JDTBuilderImpl"));
        
        Class jDTSnippetCompilerClazz = Class.forName("spoon.support.compiler.jdt.JDTSnippetCompiler");
        Class jDTBuilderImplType = Class.forName("spoon.compiler.builder.JDTBuilder");
        Method buildSourcesMethod = jDTSnippetCompilerClazz.getDeclaredMethod("buildSources", jDTBuilderImplType);
        buildSourcesMethod.setAccessible(true);
        java.lang.Object[] buildSourcesMethodArguments = new java.lang.Object[1];
        buildSourcesMethodArguments[0] = jDTBuilderImpl;
        try {
            buildSourcesMethod.invoke(jDTSnippetCompiler, buildSourcesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }}
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSnippetCompilationUnit1() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        
        CompilationUnit actual = jDTSnippetCompiler.getSnippetCompilationUnit();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testGetSnippetCompilationUnit2() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        setField(jDTSnippetCompiler, "snippetCompilationUnit", null);
        
        CompilationUnit actual = jDTSnippetCompiler.getSnippetCompilationUnit();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region
    
    @Test(timeout = 10000)
    public void testJDTSnippetCompiler1() {
        String string = new String();
        JDTSnippetCompiler actual = new JDTSnippetCompiler(null, string);
    }
    ///endregion
    
    
    ///region Errors report for <init>
    
    public void testJDTSnippetCompiler_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field security is not found in class java.lang.System
        // 
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
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws Exception {
        java.lang.reflect.Field field;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + clazz);
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
