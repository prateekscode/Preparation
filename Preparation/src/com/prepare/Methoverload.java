package com.prepare;

public class Methoverload {
	public static void main(String[] args) {
		Cls1 cln = new Cls1();
		cln.show();
		System.out.println(cln.show("HEy!"));
		cln.show('a',22);
		System.out.println(cln.show(10,2,5));
		cln.show(100l);
	}
}
class Cls1{
	void show() {
		System.out.println("Hii!");
	}

	void show(long a, long b) {
		System.out.println(a +" "+ b);
	}

	int show(int c, int d, int f) {
		return c * d * f;
	}

	String show(String s) {
		return s;
	}
	
	void show(long l) {
		System.out.println(l);
	}
}