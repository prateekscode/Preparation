package com.threading;

class Yiel extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Child Thread "+Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class ThrYield {
	public static void main(String[] args) {
		Yiel y=new Yiel();
		y.start();
		
		for(int i=0;i<5;i++)
			System.out.println("Thread "+Thread.currentThread().getName());
	}
}
