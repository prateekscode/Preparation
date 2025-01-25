package com.ReflApi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("com.ReflApi.EmpRef");
		
		Constructor[] constructors=c.getDeclaredConstructors();
		
		for(Constructor constructor: constructors) {
			System.out.println("Cons. Name: "+constructor);
			System.out.println("Cons. Para: "+constructor.getParameterCount());
		
			Parameter[] parameters=constructor.getParameters();
			for(Parameter parameter:parameters) {
				System.out.println("Constructor parameters: "+parameter);
			}
			System.out.println();
		}
		System.out.println();
		
		//Meth. array
		
		Method[] methods=c.getDeclaredMethods();
		System.out.println("Method Length: "+methods.length);
		
		for(Method method:methods) {
			System.out.println("Method name: \t"+method);
			System.out.println("Method Return type: \t"+method.getReturnType());
			System.out.println("Method para. count: \t"+method.getParameterCount());
			System.out.println();
			
			Parameter[] parameters=method.getParameters();
			for(Parameter parameter:parameters) {
				System.out.println("Method's Parameter : "+parameter);
			}
			System.out.println();
		}
		System.out.println();
		
//		classes
		Class[] classes=c.getDeclaredClasses();
		for(Class class1:classes) {
			System.out.println("class: "+class1);
			System.out.println("Name of the class: "+class1.getName());
		}
		System.out.println();
		
//		Annoatations
		Annotation[] annotations=c.getDeclaredAnnotations();
		for(Annotation annotation:annotations) {
			System.out.println("Annotation: "+annotation);
		}
	}
}
