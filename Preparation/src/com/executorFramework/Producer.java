package com.executorFramework;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<String> blockingQueue = null;

	public Producer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			long timeMillis = System.currentTimeMillis();
			try {
				this.blockingQueue.put("" + timeMillis);
			} catch (Exception e) {
				System.out.println("Producer interrupted");
			}
			sleep(1000);
		}
	}

	private void sleep(long timeMillis) {
		try {
			Thread.sleep(timeMillis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
