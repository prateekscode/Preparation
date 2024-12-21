package com.object;

import java.util.HashMap;

class Student {
	int id;
	String name;

	Student(int i, String n) {
		this.id = i;
		this.name = n;
	}

	public boolean equals(Student obj) {
		if (this.id == obj.id && this.name == obj.name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return id;
	}
	
//	public boolean equals(Student obj) {
//			return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return 111;
//	}
}

public class EqualHashcodeConstruct {
	public static void main(String[] args) {
		Student st = new Student(101, "ABC");
		Student st1 = new Student(101, "ABC");
		Student st2=new Student(101,"ABC");
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println();
		System.out.println(st.equals(st1));
		
		HashMap h=new HashMap();
		h.put(st, "a");
		h.put(st1, "b");
		h.put(st1, "b");
		h.put(st2, "c");
		System.out.println(h);
	}
}
