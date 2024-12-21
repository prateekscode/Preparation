package com.prepare;

public class Wrapper {
	public static void main(String[] args) {
		String s = "248";
		int n = Integer.parseInt(s);
		System.out.println(n + " " + (n + 1));

		int x = 234;
		String s1 = Integer.toString(x);
		System.out.println(s1);
		String s2 = String.valueOf(x);
		System.out.println(s2 + 1);

		int i = 90;
		Integer i1 = new Integer(i);
		System.out.println(i1);

		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);

		int a = i2.intValue();
		System.out.println(a);

		// Autoboxing after 1.5v
		Integer in = a;
		System.out.println(in);

		// Autounboxing after 1.5v
		int g = in;
		System.out.println(g);
		
	}
}