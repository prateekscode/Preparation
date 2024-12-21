package com.collection.hashmap;

import java.util.HashMap;

public class Case2 {
	public static void main(String[] args) {
		Emp2 e1=new Emp2(101,"Aman");
		Emp2 e2=new Emp2(101,"Aman");
		
		//entry added in new indx because both objects give different hashcode value.
		HashMap h1=new HashMap();
		h1.put(e1,"C-A");
		h1.put(e1,"C-B");
		h1.put(e2,"C-C");
		
		System.out.println(h1);
		
	}
	
}
class Emp2{
	int id;
	String name;
	
	public Emp2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}