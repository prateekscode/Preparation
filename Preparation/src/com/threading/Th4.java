package com.threading;

class Thr2 extends Thread{
	
}

public class Th4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thr2 t=new Thr2();
		t.start();
		System.out.println(t.getName());
		Thread.currentThread().setName("Popye");
		System.out.println(Thread.currentThread().getName());
	}
}
