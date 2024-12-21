package com.threading;

class TJo extends Thread{
	public void run() {
		for(int i=0;i<3;i++)
		System.out.println("SEcond thread");
	}
}
public class ThrJoin {
	public static void main(String[] args) throws InterruptedException {
		TJo t=new TJo();
		t.start();
		t.join();
		
		for(int i=0;i<3;i++)
			System.out.println("first thread");
	}
}
