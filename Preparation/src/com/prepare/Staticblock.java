package com.prepare;

public class Staticblock {
	public static void main(String[] args) {
		System.out.println("Main: "+St.a);
	}
}
class St{
	static int a;
	int b;
	static {
		 a=10;
		int c=23;
		System.out.println("Static block: "+(a+c));
	}
}
