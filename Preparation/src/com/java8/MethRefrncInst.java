package com.java8;

interface In{
	public void m1(int i);
}

public class MethRefrncInst {
	public void m2(int i) {
		System.out.println("From method ref: "+i);
	}
	public static void main(String[] args) {
		In f=n->System.out.println("From lambda: "+n);
		f.m1(11);
		
		MethRefrncInst m=new MethRefrncInst();
		In i2=m::m2;
		i2.m1(55);
	}
}
