package com.threading;

class TP extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("Child thread");
	}
}
public class ThrePrio {
	public static void main(String[] args) {
		TP t=new TP();
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<3;i++)
			System.out.println("Main THread");
	}
}
