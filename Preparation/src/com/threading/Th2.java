package com.threading;

public class Th2 extends Thread{
	
	public void start() {
		super.start();
		System.out.println("Start()-Th2");
	}
	
	@Override
	public void run() {
	for(int i=0;i<3;i++)
		System.out.println("Child Thread");
	}
	
	public static void main(String[] args) {
	Th2 t=new Th2();
	t.start();
//	t.start();		//java.lang.IllegalThreadStateException
		for(int i=0;i<3;i++)
			System.out.println("Main Thread");
	}
}
