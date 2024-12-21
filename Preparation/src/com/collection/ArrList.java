package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrList{
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(15);
		l.add(50);
	System.out.println(l);	
	Collections.sort(l);
	System.out.println(l);
	}
}
