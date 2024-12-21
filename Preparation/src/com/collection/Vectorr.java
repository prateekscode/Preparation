package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorr {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(21);
		v.addElement(45);
		v.add("ABC");
		System.out.println(v);
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			Object ob=e.nextElement();
			System.out.println(ob);
		}
	}
}
