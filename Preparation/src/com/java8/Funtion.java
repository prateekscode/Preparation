package com.java8;

import java.util.function.Function;

public class Funtion {
	public static void main(String[] args) {
		Function<String, Integer> f=p->p.length();
		System.out.println(f.apply("ACDFRE"));
		
		Function<Integer, Integer> f1=p->p*p;
		System.out.println(f1.apply(5));
		
		
	}
}
