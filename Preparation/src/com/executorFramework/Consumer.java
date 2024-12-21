package com.executorFramework;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<String> blockingQueue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.blockingQueue=queue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String element=this.blockingQueue.take();
				System.out.println("Consumed: "+element);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
