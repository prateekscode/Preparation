package com.collec2;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(2);
	al.add("ABc");
	al.add('a');
	System.out.println(al);
	
	Iterator i=al.iterator();
	while(i.hasNext())
		System.out.println(i.next());
}
}
