package com.collec2;

import java.util.Enumeration;
import java.util.Stack;

public class Sk {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(23);
		s.add("Ab");
		s.add(24);
		s.add(55);

		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.push(90));
		System.out.println();
		
		
		Enumeration e = s.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
