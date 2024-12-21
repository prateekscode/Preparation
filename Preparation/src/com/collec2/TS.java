package com.collec2;

import java.util.TreeSet;

public class TS {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(98);
//	ts.add("ACV");		::ClassCastException
	ts.add(55);
	ts.add(22);
	ts.add(98);
//	ts.add(null);		::NullPointerException
	
	System.out.println(ts);
}
}
