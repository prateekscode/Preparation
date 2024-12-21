package com.executorFramework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue1 {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq=new ArrayBlockingQueue<String>(3);
		
		bq.put("1st element");
		bq.put("2nd element");
		bq.put("3rd element");
		
		String e1=bq.take();
		String e2=bq.take();
		String e3=bq.take();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
