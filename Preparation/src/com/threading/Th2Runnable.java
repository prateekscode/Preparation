package com.threading;

class Thre implements Runnable {
	@Override
	public void run() {
		System.out.println("BY implementing Runnable interface.");
	}
}

public class Th2Runnable {
	public static void main(String[] args) {
		Thre th2 = new Thre();
		Thread t2 = new Thread(th2);
		t2.start();

		Thread th = new Thread(() -> {
			System.out.println("Lambda exp run()");
		});
		th.start();
		
		for(int i=0;i<3;i++)
			System.out.println("Main thread");
			
		// To get the no. of active threads
		int tc = Thread.activeCount();
		System.out.println(tc);

		// To get the names of active threads
		Thread[] threads = new Thread[tc];
		Thread.enumerate(threads);

		for (Thread t : threads) {
			if (t != null) {
				System.out.println(t.getName());
			}
		}

	}
}
