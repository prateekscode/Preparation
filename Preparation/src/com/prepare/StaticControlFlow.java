package com.prepare;

public class StaticControlFlow {
	static int a = 90;
	static {
		m1();
		System.out.println("Static block: "+a);
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Main method");
	}

	public static void m1() {
		System.out.println("Static method m1() called");
		System.out.println(j);
	}

	static {
		System.out.println("2nd static block");
	}

	static int j = 20;
}
