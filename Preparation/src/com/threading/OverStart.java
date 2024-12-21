package com.threading;

class Thh3 extends Thread{
	/*
	 * public void start() { System.out.println("Start method"); }
	 */
	public void run() {
		System.out.println("Run method executed");
	}
}

public class OverStart {
	public static void main(String[] args) {
		Thh3 ta2=new Thh3();
		ta2.start();
	}
}
