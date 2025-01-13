package com.java8;

@FunctionalInterface
public interface MethRefrnInterf {
	public void display();
	
	public static void show() {
		System.out.println("Show");
	}
	
	default void Disp() {
		System.out.println("Disp");
	}
}
