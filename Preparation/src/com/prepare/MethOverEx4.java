package com.prepare;

class Animal {

}

class Monkey extends Animal {

}

public class MethOverEx4 {
	void d1(Animal a) {
		System.out.println("Animal obj");
	}

	void d1(Monkey m) {
		System.out.println("Monkey obj");
	}

	public static void main(String[] args) {
		MethOverEx4 m = new MethOverEx4();
		Animal a = new Animal();
		m.d1(a);
		Monkey mn=new Monkey();
		m.d1(mn);
		
		Animal an=new Monkey();
		m.d1(an);;
	}
}
