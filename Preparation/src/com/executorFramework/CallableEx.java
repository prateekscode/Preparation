package com.executorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//If we want to return something we do not return in run method of Runnable because its return type
//is void so instead of using Runnable we use callable if we have such req. of returning something.


public class CallableEx implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		Thread.sleep(3000);
		return new Random().nextInt();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(10);

		// submit task for execution
		List<Future> allFutures = new ArrayList<Future>();
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = service.submit(new CallableEx());
			allFutures.add(future);
		}

		// 100 futures, with 100 placeholders

		// perform some unrelated operations

		// 100sec

		for (int i = 0; i < 100; i++) {
			Future<Integer> future = allFutures.get(i);
			Integer Result = future.get(); // blocking
			System.out.println("Result of future #"+i+"="+Result);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}
	}

}
