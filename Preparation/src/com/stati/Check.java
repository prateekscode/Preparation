package com.stati;

public class Check {
	public static int a=10;
	public static String name="Keir Starmer";
	protected static int n=3;
	 public static void main(String[] args) {
		Check.display();
		System.out.println(Check.a);
		System.out.println(Check.name);
	}
	 public static void display() {
		 System.out.println("Static method");
	 }
	 
	 protected void show() {
		 System.out.println("Show from Check");
	 }
}
