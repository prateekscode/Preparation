package com.threading;

class TJ2 extends Thread {
	static Thread mt;

	@Override
	public void run() {
	try {
		mt.join();
	}catch (Exception e) {}
	
	for(int i=0;i<3;i++)
		System.out.println("Child Thread");
	}
}

public class ThreadJoin2 {
	public static void main(String[] args) throws InterruptedException {
		TJ2.mt = Thread.currentThread();
		TJ2 t = new TJ2();
		t.start();
//		t.join();	//stucked deadlock like condition both threads are waiting for each other.

		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}