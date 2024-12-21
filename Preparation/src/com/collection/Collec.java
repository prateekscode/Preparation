package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collec {
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add(20);
	c.add(22);
	c.add(23);
	c.add(24);
	c.add(25);
	
	Collection c1=new ArrayList();
	c1.add(23);
////	c1.addAll(c);
	c1.add(22);
	c1.add(100);
////	c1.retainAll(c);
////	c1.clear();
	System.out.println(c1.contains(100));
	System.out.println(c1.containsAll(c));
	System.out.println(c1);
	System.out.println(c1.isEmpty());
	System.out.println(c1.size());
	System.out.println(c1);
}
}
