package com.object;
class D{
	int j;
}
class C implements Cloneable{
	int a;
	int b;
	D d;

	public C(int n, int m) {
		this.a = n;
		this.b = m;
	}

	public Object clone() throws CloneNotSupportedException {
		System.out.println("Clone meth");
		Object ob = super.clone();
		return ob;
	}

}

public class Clon {
	public static void main(String[] args) {
		C cc = new C(2, 4);
		C cn = cc;
		System.out.println(cn == cc);

		// cloning
		try {
			C n = (C) cc.clone();
			System.out.println(cc==n);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
