package com.java8;

import java.util.function.Supplier;

public class Suplir {
	public static void main(String[] args) {
		Supplier<String> s=()->{
			String[] a= {"a","c","e","g"};
			int x=(int)(Math.random());
			return a[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
