package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Prdecate {

	public static void main(String[] args) {
		int[] x = { 0, 8, 6, 24, 45, 67, 88, 9, 87, 67, 55, 43 };

		Predicate<Integer> p = I -> I > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(20));

		System.out.println("---------------------");
		Predicate<String> p1 = s -> s.length() > 7;
		System.out.println(p1.test("ARAMBH"));
		System.out.println(p1.test("TERMINATOR"));

		System.out.println("''''''''''''''''''''''");
		List<Integer> l = new ArrayList<Integer>();
		l.add(55);
		Predicate<Collection> p2 = t -> t.isEmpty();
		System.out.println(p2.test(l));

		Predicate<Integer> p3 = n -> n % 2 == 0;

		System.out.println("No greater than 10---");
		m1(p,x);
		
		System.out.println("No. less than 10===");
		m1(p.negate(),x);
		
		System.out.println("Even nos.---");
		m1(p3, x);

		System.out.println("Odd nos.---");
		m1(p3.negate(), x);

		System.out.println("No greater than 10 and even---");
		m1(p.and(p3),x);
		
		System.out.println("No greater than 10 or even---");
		m1(p.or(p3),x);

	}

	public static void m1(Predicate<Integer> p, int[] n) {
		for (int a : n) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}
	}
}
