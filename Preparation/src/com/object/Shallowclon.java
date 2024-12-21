package com.object;

class Std {
	public int n1;
	public int n2;
	public String name;
	
	public Std(int a,int b,String s) {
		this.n1=a;
		this.n2=b;
		this.name=s;
	}

}

class Clon1 implements Cloneable {
	int a = 5;
	int b = 25;
	Std s1=new Std(23,44,"James");

	protected Object clone() throws CloneNotSupportedException {
		Object ob = super.clone();
		return ob;
	}
}

public class Shallowclon {
	public static void main(String[] args) {
		Clon1 c = new Clon1();
		Clon1 cv = c;
		System.out.println(cv == c);

		System.out.println("Before updating fom clone object---");
		System.out.println(c.s1.n1);
		System.out.println(c.s1.n2);
		System.out.println(c.s1.name);
		System.out.println(c.a);
		System.out.println(c.b);
		
		try {
			Clon1 cm = (Clon1) c.clone();
			System.out.println(cm==c);
			cm.s1.n1=77;
			cm.s1.n2=88;
			cm.s1.name="Bond";
			cm.a=10;
			cm.b=20;
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After updating fom clone object---");
		System.out.println(c.s1.n1);
		System.out.println(c.s1.n2);
		System.out.println(c.s1.name);		
		System.out.println(c.a);
		System.out.println(c.b);
		
	}
}
