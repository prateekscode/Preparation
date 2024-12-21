package com.prepare;

public class MethOver5 {
 void m1(int a) {
	 System.out.println("primitive");
 }
 
 void m1(Integer a) {
	 System.out.println("Warpper");
 }
 
 public static void main(String[] args) {
	MethOver5 mm=new MethOver5();
	mm.m1(23);
}
}
