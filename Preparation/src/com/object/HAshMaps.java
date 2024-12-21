package com.object;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HAshMaps {
	public static void main(String[] args) {
		Student s=new Student(11, "HEy");
		HashMap h=new HashMap();
		h.put(21, 1);
		h.put(22, 2);
		h.put(22, 2);
		h.put("A", 'a');
		h.put(null, 1);
		h.put(null, 1);
		System.out.println(h);
		
		LinkedHashMap lh=new LinkedHashMap();
		lh.put("A",'a');
		lh.put("A",'a');
		lh.put("C", 'c');
		lh.put("B", 'b');
		lh.put(1, 101);
		System.out.println(lh);
		
		TreeMap tm=new TreeMap();
		tm.put("A",'a');
		tm.put("A",'a');
		tm.put("C", 'c');
		tm.put("B", 'b');
//		tm.put(1, 101);
		System.out.println(tm);
	}
}
