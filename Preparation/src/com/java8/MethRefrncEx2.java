package com.java8;

public class MethRefrncEx2 {
	public static void main(String[] args) {
		MethRefrnInterf m=Test::prin;
		m.display();

		//Using Lambda
//		MethRefrnInterf m=()->System.out.println("Using Lambda");
//		m.display();
	}
}

class Test{
	public static void prin() {
		System.out.println("Test method using refrence");
	}
}