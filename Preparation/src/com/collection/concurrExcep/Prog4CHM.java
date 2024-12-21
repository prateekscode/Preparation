package com.collection.concurrExcep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Prog4CHM extends Thread{
	
	static HashMap hm=new HashMap();
		@Override
		public void run() {
		try {
			Thread.sleep(3000);	
		} catch (Exception e) {	}
			System.out.println("adding elements by child thread");
		}
			
	public static void main(String[] args) {
		hm.put(101, "AA");
		hm.put(102, "BB");
		hm.put(103, "CC");
		hm.put(104, "DD");
		
		Prog4CHM p=new Prog4CHM();
		p.start();
		
	}
}
