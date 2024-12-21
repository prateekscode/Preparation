package com.threading;

public class PrintT1T2T3 {
	public static void main(String[] args) {
		PrintSequentialNumber r1 = new PrintSequentialNumber(1);
		PrintSequentialNumber r2 = new PrintSequentialNumber(2);
		PrintSequentialNumber r3 = new PrintSequentialNumber(0);

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		Thread t3 = new Thread(r3, "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class PrintSequentialNumber implements Runnable {

	private int printNumUpto = 20;
	static int number = 1;
	int remainder;
	static Object ob = new Object();

	public PrintSequentialNumber(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < printNumUpto - 1) {
			synchronized (ob) {
				while (number % 3 != remainder) {
					try {
						ob.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				ob.notifyAll();
			}
		}

	}
}