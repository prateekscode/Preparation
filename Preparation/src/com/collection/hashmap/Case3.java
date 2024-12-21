package com.collection.hashmap;

import java.util.HashMap;

public class Case3 {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1(101, "Aman");
		Emp1 e2 = new Emp1(101, "Aman");

		/* hash collision occurs entry added in the same indx in the form of linked list 
		 * because we override the hashcode and return id.
		*/
		HashMap h1 = new HashMap();
		h1.put(e1, "C-A");
		h1.put(e1, "C-B");
		h1.put(e2, "C-C");
		
		System.out.println(h1);

	}

}

class Emp3 {
	int id;
	String name;

	public Emp3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id;
	}
}