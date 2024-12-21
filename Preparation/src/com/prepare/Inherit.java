package com.prepare;

class J {
	void n1() {
		System.out.println("D-n1()");
	}

}
class K extends J{
	void n2() {
		System.out.println("E-n2()");
	}
}
public class Inherit {
	public static void main(String[] args) {
		K e=new K();
		e.n2();
		e.n1();
		
		J j=new K();
		j.n1();
	}
}
