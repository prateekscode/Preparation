package com.collec2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NM {
	public static void main(String[] args) {
		NavigableMap<Integer, Character> n=new TreeMap<Integer, Character>();
		n.put(1, 'a');
		n.put(3, 'c');
		n.put(5, 'e');
		n.put(4, 'd');
		n.put(2, 'b');
		
		System.out.println(n);
		
		System.out.println(n.higherKey(3));
		System.out.println(n.descendingKeySet());
		System.out.println(n.pollLastEntry());
	}
}
