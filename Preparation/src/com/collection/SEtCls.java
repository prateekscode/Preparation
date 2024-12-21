package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SEtCls {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(3);
		s.add(2);
		s.add(1);
		System.out.println(s.add(1));
		s.add("G");
		s.add(null);
		s.add(null);
		s.add(4);
		System.out.println(s);
		
		Set ls=new LinkedHashSet();
		ls.add(25);
		ls.add(23);
		ls.add(25);
		ls.add(10);
		ls.add(null);
		ls.add(null);
		ls.add("H");
		System.out.println(ls);
		
		Set ts=new TreeSet();
		ts.add(12);
//		ts.add("A");
		ts.add(11);
		ts.add(15);
		ts.add(12);
//		ts.add(null);
		System.out.println(ts);
		
		List l=new ArrayList(ts);
		System.out.println(ts);
	}
}
