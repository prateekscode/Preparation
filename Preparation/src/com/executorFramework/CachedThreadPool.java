package com.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++)
			service.execute(new CachedThreadPool());
		service.shutdown();
	}
}
//in this there is no concept of blocking queue here is synchronous queue which hold only one task
//if all thread are busy, then create new thread for the task and place in the pool
//Lifecycle:: if thread is idle for 60sec(no task to execute) then kill the thread.