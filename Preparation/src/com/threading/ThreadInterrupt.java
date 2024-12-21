package com.threading;

class TI extends Thread{
	@Override
	public void run() {
		try {
		for(int i=0;i<3;i++) {
			System.out.println("Child Thread");
			Thread.sleep(2000);
		}
		}catch (InterruptedException e) {
			System.out.println("Thread interrupted");
//			throw new RuntimeException();
		}
	}
}
public class ThreadInterrupt {
	public static void main(String[] args) {
		TI t=new TI();
		t.start();
		t.interrupt();
		System.out.println("End of main");
	}
}
