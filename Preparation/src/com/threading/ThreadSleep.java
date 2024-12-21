package com.threading;

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("TS-" + i);
			Thread.sleep(5000);
		}
	}
}
