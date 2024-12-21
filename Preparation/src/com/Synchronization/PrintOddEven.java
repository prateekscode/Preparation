package com.Synchronization;

public class PrintOddEven implements Runnable{
	int counter=0;
	static int n;
	
	public void printOddNo() {
		while(counter<n) {
			if(counter%2!=0)
			System.out.println(Thread.currentThread().getName()+" "+counter);
			counter++;
		}
	}
	
	public void printEvenNo() {
		while(counter<=n) {
			if(counter%2==0)
			System.out.println(Thread.currentThread().getName()+" "+counter);
			counter++;
		}
	}
	
	@Override
	public void run() {
		printEvenNo();
		printOddNo();
	}
	
	public static void main(String[] args) {
		n=20;
		PrintOddEven poe=new PrintOddEven();
		Thread t1=new Thread(poe,"Thread-0");
		Thread t2=new Thread(poe,"Thread-1");
		t1.start();
		t2.start();
	}
}
