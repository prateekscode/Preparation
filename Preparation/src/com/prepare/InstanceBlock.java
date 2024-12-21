package com.prepare;

class Ins{
	int a=10;
	int b=30;
	{
		System.out.println(a+b);
	}
}
public class InstanceBlock {
	public static void main(String[] args) {
		System.out.println("Main: "+"hello");
		new Ins();
	}
}
