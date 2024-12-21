package com.threading;

class Test implements Runnable {
	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

}

public class ThrdGrup {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		
		Test t = new Test();
		ThreadGroup tg = new ThreadGroup("ThrdGrupName");
		Thread t1 = new Thread(tg, t, "Thread-1");
		Thread t2 = new Thread(tg, t, "Thread-2");
		Thread t3 = new Thread(tg, t, "Thread-3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("ThreadGroup Name: "+tg.getName());
		tg.list();
		
		System.out.println("-----------------------------------");
		ThreadGroup tg1 = new ThreadGroup("ThrdGrup2");
		Thread t4 = new Thread(tg1, t, "Thread-4");
		Thread t5 = new Thread(tg1, t, "Thread-5");
		Thread t6 = new Thread(tg1, t, "Thread-6");		
		t4.start();
		t5.start();
		t6.start();
		System.out.println("ThreadGroup Name: "+tg1.getName());
		tg1.list();
	}
}