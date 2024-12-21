package com.collection.concurrExcep;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Prog2COWAL extends Thread{
	static CopyOnWriteArrayList cowal=new CopyOnWriteArrayList();
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("Adding element using child thread");
		cowal.add("N");
	}
	
	public static void main(String[] args) throws InterruptedException {
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		cowal.add("D");
		
		Prog2COWAL p=new Prog2COWAL();
		p.start();
		System.out.println("Main thread started iterating");
		
		Iterator iterator = cowal.iterator();
		while(iterator.hasNext()) {
			String res=(String)iterator.next();
			System.out.println(res);
			Thread.sleep(5000);
		}
	}
}
