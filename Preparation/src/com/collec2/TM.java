package com.collec2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TM {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap();
		tm.put(101, "AB");
		tm.put(104, "102");
		tm.put(103, "CC");
		tm.put(106, "DD");
		tm.put(102, "EE");
		
		System.out.println(tm);
		
		for(Map.Entry<Integer,String> en:tm.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}
}
