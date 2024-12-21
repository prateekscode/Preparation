package com.prepare;

public class Super {
	public static void main(String[] args) {
		new BB1();
	}
}

class BB {
	int a = 10;

	BB() {
		System.out.println("Super class constructor");
	}

	void disp() {
		System.out.println("BB disp()");
	}
}

class BB1 extends BB {
	{
		System.out.println(super.a);
		super.disp();
	}

	BB1() {
		super();
	}
}