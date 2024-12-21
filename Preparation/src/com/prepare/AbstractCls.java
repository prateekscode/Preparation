package com.prepare;

abstract class Abs {
	int a;
	String name;

	void show() {
		System.out.println("show-method");
	}

	abstract void display();

	Abs(int a, String n) {
		this.a = a;
		this.name = n;
	}
}

class AbsN extends Abs {
	AbsN() {
		super(20, "Man");
		System.out.println("AbsN constructor");
	}

	@Override
	void display() {
		System.out.println(a + " | " + name);
	}
}

public class AbstractCls {
	public static void main(String[] args) {
		AbsN a=new AbsN();
		a.show();
		a.display();
	}
}
