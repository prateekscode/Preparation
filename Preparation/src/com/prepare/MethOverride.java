package com.prepare;

class Ab {
	public int show(int a, int b) {
		return a + b;
	}

	String Disp(String n) {
		return n;
	}
	
	public Ab Game() {
		return new Ab();
	}

}

class Dd extends Ab{
	
}

class Cd extends Ab {
	public int show(int a, int b) {
		return a * b;
	}

	protected String Disp(String n) {
		return n;
	}
	
	public Ab Game() {
		return new Ab();
//		return new Dd();  //Valid from java 5
	}

}

public class MethOverride {
	public static void main(String[] args) {
		Ab a = new Ab();
		System.out.println(a.Disp("Joe"));
		System.out.println(a.show(25, 25));
		System.out.println();
		
		Cd c = new Cd();
		System.out.println(c.show(2, 3));
		System.out.println(c.Disp("Kevin"));
	}
}
