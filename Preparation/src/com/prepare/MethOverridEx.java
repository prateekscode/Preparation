package com.prepare;

class M1{
	void h() {
		System.out.println("Parent H()");
	}
	
	void j() {
		System.out.println("Parent J()");
	}
	
}

class M2 extends M1{
	void j() {
		System.out.println("child J()");
	}
}

public class MethOverridEx {
	public static void main(String[] args) {
		M1 m=new M1();
		m.h();
		m.j();
		
		M2 mm=new M2();
		mm.j();
		mm.h();
		
		M1 mn=new M2();
		mn.h();
		mn.j();
	}
}
