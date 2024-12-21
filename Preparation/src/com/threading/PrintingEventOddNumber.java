package com.threading;

class Printer implements Runnable {

	static int counter = 1;
	int remainder;
	static Object lock = new Object();

	Printer(int remainder) {
		this.remainder = remainder;
	}

	public void printer() {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			synchronized (lock) {
				while (counter % 2 != remainder)
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				printer();
				lock.notifyAll();
			}
		}
	}

}

public class PrintingEventOddNumber {
	public static void main(String[] args) {
		Printer pEven = new Printer(0);
		Printer pOdd = new Printer(1);

		Thread t1 = new Thread(pEven, "EvenThread");
		Thread t2 = new Thread(pOdd, "OddThread");

		t1.start();
		t2.start();
	}
}
