package com.threading;

import java.util.ArrayList;

class EX implements Runnable {
	private int printNumberUpto = 20;
	static int number = 1;
	int remainder;

	static ArrayList lock = new ArrayList();

	public EX(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number <= printNumberUpto - 1) {
			synchronized (lock) {
				if (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {

					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}

public class PrintEvenOdd {
	public static void main(String[] args) {
		EX e1 = new EX(1);
		EX e2 = new EX(0);
		Thread t1 = new Thread(e1, "OddThread: ");
		Thread t2 = new Thread(e2, "EvenThread: ");
		t1.start();
		t2.start();
	}
}
