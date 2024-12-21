package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparbleCls implements Comparable<ComparbleCls> {
	int id;
	String name;

	public ComparbleCls(int i, String n) {
		this.id = i;
		this.name = n;
	}

	@Override
	public int compareTo(ComparbleCls o) {
//		  if (this.id > o.id) {
//	            return 1;
//	        } else if (this.id < o.id) {
//	            return -1;
//	        } else {
//	            return 0;
//	        }
		return this.name.compareTo(o.name);
	    }

	public static void main(String[] args) {
		List<ComparbleCls> s=new ArrayList<ComparbleCls>();
		s.add(new ComparbleCls(101, "Raman"));
		s.add(new ComparbleCls(103, "Aman"));
		s.add(new ComparbleCls(105, "Caman"));
		s.add(new ComparbleCls(102, "Baman"));
		s.add(new ComparbleCls(104, "Eaman"));
		
		Collections.sort(s);
		for (ComparbleCls c : s)
			System.out.println(c.id + " " + c.name);
	}


}