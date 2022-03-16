package spoon.support.compiler.jdt;

import org.junit.Test;
import spoon.compiler.builder.JDTBuilder;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.compiler.VirtualFolder;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblem;
import spoon.compiler.builder.JDTBuilderImpl;
import spoon.reflect.cu.CompilationUnit;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

import static org.junit.Assert.assertNull;

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
    public void testBuild8() throws Throwable  {
        JDTSnippetCompiler jDTSnippetCompiler = ((JDTSnippetCompiler) createInstance("spoon.support.compiler.jdt.JDTSnippetCompiler"));
        VirtualFolder virtualFolder = ((VirtualFolder) createInstance("spoon.support.compiler.VirtualFolder"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setField(virtualFolder, "files", linkedHashSet);
        setField(jDTSnippetCompiler, "sources", virtualFolder);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(jDTSnippetCompiler, "factory", factoryImpl);
        
        jDTSnippetCompiler.build();
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
        setField(jDTSnippetCompiler, "sources", null);
        FactoryImpl factoryImpl = ((FactoryImpl) createInstance("spoon.reflect.factory.FactoryImpl"));
        setField(factoryImpl, "environment", null);
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
    private static sun.misc.Unsafe getUnsafeInstance() throws Exception {
        java.lang.reflect.Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (sun.misc.Unsafe) f.get(null);
    }
}
