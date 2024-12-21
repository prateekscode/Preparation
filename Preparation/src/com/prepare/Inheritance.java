package com.prepare;

public class Inheritance {
	public static void main(String[] args) {
	A2 a=new A2();
	a.m1();
	a.m2();
	A3 a1=new A3();
	a1.m1();
	a1.a=5;
	a1.b=5;
	a1.m3();
	}
}
class A1{
	int a=5;
	int b=10;
	void m1() {
		System.out.println("A1");
	}
}
class A2 extends A1{
	void m2() {
		System.out.println("A2 "+(a+b));
	}
}

class A3 extends A2{
	void m3() {
		System.out.println("A3 "+(a*b));
	}
}