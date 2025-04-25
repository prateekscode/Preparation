package com.prepare;

public class OverloadedMethds {
	public static void m1(int a) {
		System.out.println("Normal method");
	}
	
	public static void m1(int... a) {
		System.out.println("Var_ args");
	}
	
	public static void main(String[] args) {
		m1();
		m1(3);
		m1(3,4,5);
	}
}
