package com.collec2;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(45);
		h.add("ABC");
		h.add(45);
		h.add(44);
		h.add("BCD");
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		
		Iterator i= h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
