package com.object;

class E1 {
	int a;
	int b;

	public E1(int n1, int n2) {
		this.a = n1;
		this.b = n2;
	}
}

class E2 {
	float f;
	float f1;

	public E2(float s1, float s2) {
		this.f = s1;
		this.f1 = s2;
	}

	public boolean equals(E2 obj) {
		boolean b = this.f == obj.f && this.f1 == obj.f1;
		return b;
	}
}

public class Equlas {
	public static void main(String[] args) {
		E1 e = new E1(23, 21);
		E1 e2 = new E1(23, 21);

		boolean b = e.equals(e2);
		System.out.println(b);

		System.out.println(e2 == e);

		E2 ee = new E2(11, 22);
		E2 ef = new E2(11, 22);
		boolean m = ee.equals(ef);

		System.out.println(m);
	}
}
