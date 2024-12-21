package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrList1 {
	public static void main(String[] args) {

		ArrayList<Character> al=new ArrayList<Character>();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		
		Iterator i= al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		ListIterator li= al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println();
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}
