package com.threading;

public class Print123usingThreeThreads {

	private int number;
	private int noOfThreads;
	private int totaNumbersInSequence;

	public Print123usingThreeThreads(int noOfThreads, int totaNumbersInSequence) {
		super();
		this.noOfThreads = noOfThreads;
		this.totaNumbersInSequence = totaNumbersInSequence;
	}

	public void printNumber(int result) {
		synchronized (this) {
			while (number < totaNumbersInSequence - 1) {
				while(number  % noOfThreads!=result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" "+number++);
				notifyAll();
			}
		}
	}
}
