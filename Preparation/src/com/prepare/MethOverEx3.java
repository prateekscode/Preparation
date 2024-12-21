package com.prepare;

public class MethOverEx3 {
	void a1(int a) {
		System.out.println("a1(int a)");
	}
	
	void a1(int...a) {
		System.out.println("var-args");
	}
	
	public static void main(String[] args) {
		MethOverEx3 me=new MethOverEx3();
		me.a1();
		me.a1(26);
		me.a1(23,24);
	}
}
