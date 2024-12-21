package com.prepare;

class Hide{
	static void e() {
		System.out.println("Parent hide");
	}
}
class Hide2 extends Hide{
	static void e() {
		System.out.println("child hide");
	}
}
public class MethodHiding {
	public static void main(String[] args) {
		Hide h=new Hide();
		h.e();
		Hide2 h2=new Hide2();
		h2.e();
		Hide hn=new Hide2();
		hn.e();
	}
}
