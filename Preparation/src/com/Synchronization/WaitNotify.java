package com.Synchronization;

class TotalEarnings extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <=  10; i++)
				total = total + i;
			this.notify();
		}
	}
}

public class WaitNotify {
	public static void main(String[] args) throws InterruptedException {
		TotalEarnings te = new TotalEarnings();
		te.start();
		synchronized (te) {
			te.wait();
		}
		System.out.println("Total earnings: " + te.total);
		
	}
}
