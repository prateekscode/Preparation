package com.threading;

class TJ extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Child Thread");
	}
}

public class ThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		TJ t = new TJ();
		t.start();
		t.join();

		for (int i = 0; i < 3; i++)
			System.out.println("Main thread");
	}
}
