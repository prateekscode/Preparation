package com.prepare;

public class MethOverEx2 {
	void m1(String s1) {
		System.out.println("String s1");
	}
	void m1(StringBuffer s1) {
		System.out.println("StringBuffer s1");
	}
	
	void m2(int x,float y) {
		System.out.println("int-float");
	}
	void m2(float y,int x) {
		System.out.println("float-int");
	}
	
	public static void main(String[] args) {
	MethOverEx2 ma=new MethOverEx2();
	ma.m1("xyz");
	ma.m1(new StringBuffer());
	ma.m2(23, 24f);
	ma.m2(2.2f, 45);
//	ambiguous
//	ma.m1(null);
//	ma.m2(22, 23);
//	Not applicable
//	ma.m2(2.3f, 20.3f);
	}
}
