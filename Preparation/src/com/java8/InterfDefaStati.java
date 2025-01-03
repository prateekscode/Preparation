package com.java8;

interface interf{
	void M1();
	default void M2() {
		System.out.println("inside interf method");
	}
	
	static void M3() {
		System.out.println("static meth insio");
	}
}
public class InterfDefaStati implements interf{
	public void M1() {
		System.out.println("M1 from interface");
	}
	
	public static void main(String[] args) {
		interf.M3();
		interf i=new InterfDefaStati();
		i.M1();
		i.M2();
	}

}
