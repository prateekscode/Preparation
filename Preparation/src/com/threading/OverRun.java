package com.threading;

class Thh2 extends Thread{
	public void run() {
	System.out.println("aBC");
	System.out.println(Thread.currentThread().getName());
	}
}
public class OverRun {
	public static void main(String[] args) {
		Thh2 ta=new Thh2();
		ta.run();
		System.out.println(Thread.currentThread().getName());
	}
}
