package com.threading;

public class Th1 extends Thread{
	@Override
	public void run() {
	for(int i=0;i<3;i++)
		System.out.println("Child Thread");
	}
	
//	@Override
//	public synchronized void start() {
//		System.out.println("Start method");
//	}
	
	public static void main(String[] args) {
		Th1 t=new Th1();
//		t.run();
		t.start();
		for(int i=0;i<3;i++)
			System.out.println("Main Thread");
	}
}
