package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCls {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(12);
		l.add(null);
		l.add(12);
		l.add("ABC");
		l.add(1.2f);
		l.add(null);
		System.out.println(l);
		
		LinkedList al=new LinkedList();
		al.add(12);
		al.add("W");
		al.add('C');
		al.add(99);
		al.add(65);
		System.out.println(al);
		
	
		List l2=new LinkedList();
		l2.add(10);
		l2.add(30);
		l2.add(78);
		l2.add(99);
		l2.add(100);
		
		l2.addAll(2, al);
		System.out.println(l2);
		System.out.println(l2.get(9));
		l2.remove(5); l2.remove(6);
		System.out.println(l2);
		System.out.println(l2.set(5, 'D'));
		System.out.println(l2);
		System.out.println(l2.indexOf(99));
		System.out.println(l2.lastIndexOf('C'));
		System.out.println();
	
		Vector v=new Vector();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);	//till 10 elements capacity 10
		v.add(1);	//after any addition it doubles and becomes 20
		Enumeration e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		System.out.println(v.capacity());
	}
}
