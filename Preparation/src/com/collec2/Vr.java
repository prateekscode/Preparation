package com.collec2;

import java.util.Enumeration;
import java.util.Vector;

public class Vr {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(22);
		v.add("ABC");
		v.add("BCD");
		v.add(55);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		System.out.println(v.capacity());
		
	}
}
