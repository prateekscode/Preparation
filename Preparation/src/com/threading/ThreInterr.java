package com.threading;

class ThrIr extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Child");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("I am intrrupted");
			throw new RuntimeException();
		}
	}
}

public class ThreInterr {
	public static void main(String[] args) {
		ThrIr th = new ThrIr();
		th.start();
		th.interrupt();
		System.out.println("main End");
	}
}
