package com.collection.concurrExcep;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Prog3 {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();

		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			String val = (String) iterator.next();
			if(val.equals("B"))
				iterator.remove();	//java.lang.UnsupportedOperationException
		}
	}
}