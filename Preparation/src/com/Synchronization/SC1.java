package com.Synchronization;

class Abc extends Thread{
	synchronized void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println("m1 "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	synchronized void m2() {
		for(int i=0;i<=7;i++) {
			System.out.println("m2 "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}

class A implements Runnable{
	Abc a=null;
	A(Abc a,String name){
		this.a=a;
		Thread t1=new Thread(this,name);
		t1.start();
		System.out.println(t1.getThreadGroup().getName());
	}

	public void run() {
		a.m1();
	}
}

class B implements Runnable{
	Abc a=null;
	B(Abc a,String name){
		this.a=a;
		Thread t2=new Thread(this,name);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}

	public void run() {
		a.m2();
	}
	
}

public class SC1 {
	public static void main(String[] args) {
//		Abc aa=new Abc();
//		new A(aa,"A");
//		new B(aa,"B");
		
		Abc aa=new Abc();
		Abc bb=new Abc();
		new A(aa,"A");
		new B(bb,"B");
		
	}
}
