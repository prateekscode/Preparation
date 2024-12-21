package com.object;

class K1{}
class K2 extends K1{
	void sho() {
		System.out.println("Hellow-sow()");
	}
}
public class GetCls {
	public static void main(String[] args) {
		K2 k=new K2();
		k.sho();
		System.out.println(k.getClass());
		Class cl=k.getClass();
		System.out.println(cl.getName());
		System.out.println(cl.getSuperclass());
	}
}
