package com.Synchronization;

class Syn {
	public synchronized void display() {
		System.out.println(Thread.currentThread().getName() + " Synchronized method");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " Synchronized method complete");
	}

	public void show() {
		System.out.println(Thread.currentThread().getName() + " Non-Synchronized method");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " Non-Synchronized method complete");

	}
}

public class SC2 {
	public static void main(String[] args) {
		Syn s = new Syn();
		Thread t1 = new Thread(() -> {
			s.display();
		});

		Thread t2 = new Thread(() -> {
			s.show();
		});

		t1.start();
		t2.start();
	}

}
