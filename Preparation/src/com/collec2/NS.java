package com.collec2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NS {
	public static void main(String[] args) {
		NavigableSet ns=new TreeSet();
		ns.add(80);
		ns.add(55);
		ns.add(10);
		ns.add(54);
		ns.add(95);
		ns.add(100);
		
		System.out.println(ns);
		System.out.println(ns.ceiling(50));
		System.out.println(ns.floor(100));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns.higher(50));
	}
}
