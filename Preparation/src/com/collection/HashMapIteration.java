package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap();
		h.put(101, "Abc");
		h.put(102, "Cbc");
		h.put(103, "Ebc");
		h.put(104, "Dbc");
		h.put(105, "Kbc");
		h.put(106, "Mbc");

//		System.out.println(("Classic iterator method:"));
//		Iterator<Entry<Integer, String>> iterator = h.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry<Integer, String> entry = iterator.next();
//			System.out.println(entry.getKey() + "  " + entry.getValue());
//		}

//		System.out.println("for each method");
//		for (Map.Entry<Integer, String> entry : h.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

//		System.out.println("Using keyset");
//		Iterator<Integer> iterator = h.keySet().iterator();
//		while(iterator.hasNext()) {
//			Integer key = iterator.next();
//			System.out.println(key+"  "+h.get(key));
//		}
		
//		System.out.println("Using lambda expres.");
//		h.forEach((key,value)->{
//			System.out.println(key);
//			System.out.println(value);
//		});
		
		System.out.println("Using stream API");
		h.entrySet().stream().forEach((entry)->{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		});
	}
}
