package com.collection.concurrExcep;

import java.util.ArrayList;
import java.util.Iterator;

public class Prog1 extends Thread{
	static ArrayList al = new ArrayList();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {}
		System.out.println("Child thread updating list.");
		al.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException {
		al.add("A");
		al.add("B");
		al.add("C");

		Prog1 p=new Prog1();
		p.start();
		
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			String val = (String) iterator.next();
			System.out.println("Main thread iterating and curr. obj is "+val);
			Thread.sleep(3000);
		}
	}
}