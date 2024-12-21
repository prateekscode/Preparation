package com.prepare;

public class MethOverEx {
	public void m1(int i) {
		System.out.println("int-args "+i);
	}
	public void m1(float f) {
		System.out.println("Float-args "+f);
	}
	public void m2(String m) {
		System.out.println("String m2: "+m);
	}
	public void m2(Object m) {
		System.out.println("Object m2");
	}
	
	public static void main(String[] args) {
		MethOverEx me=new MethOverEx();
		me.m1(20l);
		me.m1('a');
		me.m1(1.5f);
		me.m1('*');
		me.m1(101l);
		me.m2(new Object());
		me.m2("xyz");
		//if sub class is available then it will give precedence to sub class here 
		//string is subclass of object
		me.m2(null);
	}
}
