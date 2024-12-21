package com.prepare;

class Abs1 {
	public void show() {
		System.out.println("Hii");
	}
}

abstract class Abs2 extends Abs1 {
	public abstract void show();
}

class Abs3 extends Abs2 {
	@Override
	public void show() {
		System.out.println("Abs3 cls");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		Abs1 a = new Abs1();
		a.show();
		Abs3 a2 = new Abs3();
		a2.show();
		Abs2 a3=new Abs3();
		a3.show();
	}
}
