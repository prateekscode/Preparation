package com.threading;

class Thr1{
	void display() {
		System.out.println("Thr1-display");
	}
}

interface Hey{
	void show();
	int a=10;
}

class Thr extends Thr1 implements Runnable,Hey{
	@Override
	public void run() {
		System.out.println("Thr run()");
	}
	
	@Override
	public void show() {
		System.out.println("Hey interface show() and value of a="+a);
	}
}


public class Th3 {
	public static void main(String[] args) {
		Thr t=new Thr();
		Thread th=new Thread(t);
		th.start();
		t.display();
		t.show();
	}
}
