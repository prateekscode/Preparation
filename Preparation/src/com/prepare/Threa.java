package com.prepare;

class Q{
	public int a=10;
}
class T extends Q implements Runnable{
	public void run() {
		int a=25;
		System.out.println("Thread 1 "+a);
	}
}

class T1 extends Q implements Runnable{
	public void run() {
		int a=45;
		System.out.println("Thread 2 "+a);
	}
}

public class Threa {
	public static void main(String[] args) {
		T t=new T();
		T1 t1=new T1();
		Thread th=new Thread(t);
		Thread th1=new Thread(t1);
		th1.start();
		th.start();;
		
	}
}
