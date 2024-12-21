package com.executorFramework;

public class BeforeExecutor implements Runnable{
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());	
	}
	
	public static void main(String[] args) {
//		BeforeExecutor b=new BeforeExecutor();
		for(int i=0;i<101;i++) {
		Thread t=new Thread(new BeforeExecutor());
		t.start();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
