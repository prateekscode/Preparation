package com.threading;

class TY extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Child Thread");
		Thread.yield();
	}
}
public class ThreYield {
	public static void main(String[] args) {
		TY t=new TY();
		t.start();
		
		for(int i=0;i<3;i++)
			System.out.println("Main thread");
	}
}
