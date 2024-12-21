package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Compart {
	int age;
	String name;
	int sal;

	public Compart(int a, String n, int s) {
		this.age = a;
		this.name = n;
		this.sal = s;
	}

	@Override
	public String toString() {
		return "["+"age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		Compart c = new Compart(10, "De", 2000);
		Compart c1 = new Compart(13, "Ae", 4000);
		Compart c2 = new Compart(15, "Fe", 3000);
		Compart c3 = new Compart(17, "He", 7000);
		Compart c4 = new Compart(16, "Ne", 1000);

		TreeSet<Compart> l = new TreeSet<Compart>(new AgeComp());
		l.add(c);
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		System.out.println(l);
		System.out.println();
		
		TreeSet<Compart> l1 = new TreeSet<Compart>(new NameComp());
		l1.add(c);
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		System.out.println(l1);
		System.out.println();
		
		TreeSet<Compart> l2 = new TreeSet<Compart>(new SalComp());
		l2.add(c);
		l2.add(c1);
		l2.add(c2);
		l2.add(c3);
		l2.add(c4);
		System.out.println(l2);
		
	}
}

class NameComp implements Comparator<Compart> {
	@Override
	public int compare(Compart o1, Compart o2) {
		return o1.name.compareTo(o2.name);
	}
}

class AgeComp implements Comparator<Compart> {
	@Override
	public int compare(Compart o1, Compart o2) {
		return o1.age - o2.age;
	}
}

class SalComp implements Comparator<Compart> {
	@Override
	public int compare(Compart o1, Compart o2) {
		return o1.sal - o2.sal;
	}
}