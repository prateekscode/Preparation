package com.collec2;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(21);
		ll.add(22);
		ll.add(53);
		ll.add("ABC");
		ll.add(22);
		
		Iterator i=ll.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		Iterator i1=ll.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	}
}
