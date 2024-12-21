package com.annotations;

import java.lang.annotation.Annotation;

public class MainExample {
	public static void main(String[] args) {
		Demo d=new Demo();
		Class c=d.getClass();
		System.out.println(c.getName());
		
		MyAnno ann = (MyAnno)c.getAnnotation(MyAnno.class);
		System.out.println(ann.MyValue());
		System.out.println(ann.Name());
		System.out.println(ann.City());
	}
}
