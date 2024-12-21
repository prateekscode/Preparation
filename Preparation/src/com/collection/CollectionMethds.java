package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethds {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(23);
		l.add(24);
		l.add(25);
		l.add(26);
		
		List l1=new ArrayList();
		l1.add(33);
		l1.add(34);
		l1.add(35);
		l1.add(36);
		l1.add(26);
		
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(25));
		System.out.println(l1.toArray());
		System.out.println(l.remove(1));
		
		l.addAll(l1);
		System.out.println(l);
		l.containsAll(l1);
		System.out.println(l);
		l.removeAll(l1);
System.out.println(l);
		l.retainAll(l1);
		System.out.println(l);
		
	}
}
