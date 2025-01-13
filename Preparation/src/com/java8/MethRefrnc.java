package com.java8;

public class MethRefrnc {
	public static void main(String[] args) {
		Runnable r=MethRefrnc::m1;
		
		Thread t=new Thread(r);
		t.start();

		for(int i=0;i<6;i++)
			System.out.println("Main thread");

	}
	
	public static void m1() {
		for(int i=0;i<6;i++)
			System.out.println("child thread");
	}
}
