package com.threading;

class Th extends Thread{
		public void run() {
			System.out.println("Run method executed.");
			System.out.println(Thread.currentThread().getName());
		}
}
public class RThread1 {
	public static void main(String[] args) {
		Th t=new Th();
		Th ta=new Th();
		ta.start();
		t.start();
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<2;i++)
			System.out.println("MAinnn thread");
	}
}
