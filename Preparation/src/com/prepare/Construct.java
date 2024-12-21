package com.prepare;

class ConsA{
	ConsA(){
		System.out.println("Constructor ConsA");
	}
}
class ConsB extends ConsA{
	ConsB(){
		super();
		System.out.println("Constructor ConsB");
	}
}

public class Construct {
	Construct(){
		System.out.println("Hii");
	}
	public static void main(String[] args) {
		new Construct();
		ConsB b=new ConsB();
	}
}
