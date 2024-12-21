package com.collection.hashmap;

import java.util.HashMap;

public class Case4 {
	public static void main(String[] args) {
		Emp4 e1 = new Emp4(101, "Aman");
		Emp4 e2 = new Emp4(101, "Aman");

		/* In this we override both hashcode and equals method so whenever same hashcode
		 * and content replacement happens and we cannot add same object with same content again.
		*/
		HashMap h1 = new HashMap();
		h1.put(e1, "C-A");
		h1.put(e1, "C-B");

		System.out.println(h1);

	}

}

class Emp4 {
	int id;
	String name;

	public Emp4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Emp4 e = (Emp4) obj;
		if (this.id == e.id && e.name.equals(this.name))
			return true;
		else 
			return false;
	}
}