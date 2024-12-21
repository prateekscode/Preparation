package com.threading;

public class PrintEvenOddNum{
	int start, max;

	public PrintEvenOddNum(int start, int max) {
		this.start = start;
		this.max = max;
	}

	public void printEven() {
		while (this.start <= this.max) {
			synchronized (this) {
				if (this.start % 2 == 0) {
					System.out.println(Thread.currentThread().getName()+" "+ start);
					start++;
					this.notify();
				} else {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void printOdd() {
		while (this.start <= this.max) {
			synchronized (this) {
				if (this.start % 2 != 0) {
					System.out.println(Thread.currentThread().getName()+" "+ start);
					start++;
					this.notify();
				} else {
					try {
						this.wait();
					} catch (Exception e) {
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		PrintEvenOddNum peo = new PrintEvenOddNum(1, 20);
		Thread t1=new Thread(()->{
			peo.printEven();
		});
		
		Thread t2=new Thread(()->{
			peo.printOdd();
		});
		t1.start();
		t2.start();
	}
}

