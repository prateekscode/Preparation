package com.threading;

class Thh1 implements Runnable{
	@Override
	public void run() {
		System.out.println("run method executed");	
		System.out.println(Thread.currentThread().getName());
	}
}
public class Rthread2 {
	public static void main(String[] args) {
		Thh1 t1=new Thh1();
//		Runnable r=new Thh1();
		Thread a=new Thread(t1);
		a.start();
	}
}
