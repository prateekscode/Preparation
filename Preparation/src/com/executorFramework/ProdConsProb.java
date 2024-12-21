package com.executorFramework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsProb {
	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue=new ArrayBlockingQueue<String>(3);
		
		Producer producer=new Producer(blockingQueue);
		Consumer consumer=new Consumer(blockingQueue);
		
		Thread prodThread=new Thread(producer);
		Thread consThread=new Thread(consumer);
		
		prodThread.start();
		consThread.start();
		
	}
}
