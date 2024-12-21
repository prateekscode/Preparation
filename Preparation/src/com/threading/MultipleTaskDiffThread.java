package com.threading;

class VideoPlay implements Runnable{
	public void run() {
		System.out.println("Playing video "+Thread.currentThread().getName());
	}
}

class Volume implements Runnable{
	public void run() {
		System.out.println("Managing volume "+Thread.currentThread().getName());
	}
}

class ProgressBar implements Runnable{
	public void run() {
		System.out.println("Executing Progress Bar "+Thread.currentThread().getName());
	}
}

class Time implements Runnable{
	public void run() {
		System.out.println("Running Timer "+Thread.currentThread().getName());
	}
}
public class MultipleTaskDiffThread {
	public static void main(String[] args) {
		VideoPlay vp=new VideoPlay();
		Volume v=new Volume();
		ProgressBar pb=new ProgressBar();
		Time t=new Time();
		
		Thread t1=new Thread(vp);
		Thread t2=new Thread(v);
		Thread t3=new Thread(pb);
		Thread t4=new Thread(t);
		
//		Thread.currentThread().setName("Main wali thread");
		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().isAlive());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
