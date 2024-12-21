package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//In this if we don't pass any method then it is marker if only one then single valued annotation
//while the below is multivalued  annotation.

//By using @Target we define where to use this annotation (In class or method or constructor or field or
//local variable or parameter etc.)

//TYPE for using in class, interface and enum. METHOD for using in method also. FIELD for using in field.

//By using @Retention we can specify in which level annotation is available (source, class or runtime) 
//If we specify runtime then it will available in runtime on compiler and JVM both.

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	int MyValue() default 0;
	String Name() default "Prateek";
	String City() default "Kanpur";
	
	
}