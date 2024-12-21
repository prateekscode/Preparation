package com.threading;

//daemon thread is a thread which run in the background of another thread.It provides service to the threads.

class Dae1 extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().isDaemon());
	}
}

public class DaemonThread {
	public static void main(String[] args) {
//		if we comment below line so nothing will print because Dae1 is daemon thread which depends on main thread.
		System.out.println(Thread.currentThread().getName());
		Dae1 d=new Dae1();
		//Always make a thread daemon before starting otherwise it throw Exception "IllegalThreadStateException".
		//life of daemon thread depends on another thread for which it was working in background.
		d.setDaemon(true);
		d.start();
	}
}
//We cannot make main thread as daemon because it is started by the JVM already so we cannot make after starting.