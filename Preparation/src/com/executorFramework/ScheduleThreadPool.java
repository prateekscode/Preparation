package com.executorFramework;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		for(int i=0;i<50;i++) {
		//task to run after 10 seconds delay
		service.schedule(new ScheduleThreadPool(), 10, TimeUnit.SECONDS);
		
		//task to run repeatedly every 10 seconds
//		service.scheduleAtFixedRate(new ScheduleThreadPool(), 15, 10, TimeUnit.SECONDS);
		
		//task to run repeatedly 10 seconds after previous task completes
//		service.scheduleWithFixedDelay(new ScheduleThreadPool(), 15, 10, TimeUnit.SECONDS);
		}
		service.shutdown();
	}
}
