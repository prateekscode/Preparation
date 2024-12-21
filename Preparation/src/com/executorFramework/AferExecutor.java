package com.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AferExecutor implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<101;i++) {
			service.execute(new AferExecutor());
		}
		//we always have to shutdown if not program will continue its execution and pool is working as it is. 
		service.shutdownNow();
//		service.execute(new AferExecutor());  //java.util.concurrent.RejectedExecutionException
	}
}
