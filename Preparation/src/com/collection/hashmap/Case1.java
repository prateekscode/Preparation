package com.collection.hashmap;

import java.util.HashMap;

public class Case1 {
	public static void main(String[] args) {
		Emp1 e1=new Emp1(101,"Aman");
		Emp1 e2=new Emp1(101,"Aman");
		
		//replaced
		HashMap h1=new HashMap();
		h1.put(e1,"C-A");
		h1.put(e1,"C-B");
		
		System.out.println(h1);
		
	}
	
}
class Emp1{
	int id;
	String name;
	
	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}