package com.prepare;

public class Inheritance3 {
public static void main(String[] args) {
	new AA2();
}
}
class AA{
	AA(){
		System.out.println("AA constructor");
	}
}
class AA1 extends AA{
	AA1(){
		System.out.println("AA1 constructor");
	}
}
class AA2 extends AA1{
	AA2(){
		System.out.println("AA2 constructor");
	}
}