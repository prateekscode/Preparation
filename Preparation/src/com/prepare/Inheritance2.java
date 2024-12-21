package com.prepare;

public class Inheritance2 {
	public static void main(String[] args) {
		new B2();
	}
}

class B1 {
	static int a=87;
	static{
		System.out.println("B1 static block "+a);
	}
}
class B2 extends B1{
	static int b=23;
	static{
		System.out.println("B2 static block "+b);
		System.out.println("B2 static block "+a);
	}
}