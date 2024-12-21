package com.collec2;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LHM {
	public static void main(String[] args) {
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(31, "E");
		lh.put(35, "B");
		lh.put(33, "C");
		lh.put(30, "A");
		lh.put(30, "A");
		lh.put(40,null);
		lh.put(null,40);
		
		System.out.println(lh);
		
		Iterator iterator = lh.keySet().iterator();
		while(iterator.hasNext()) {
				Object ne = iterator.next();
				System.out.println(ne+" "+lh.get(ne));
		}
	}
}
