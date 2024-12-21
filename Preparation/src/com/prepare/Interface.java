package com.prepare;

interface I1 {
	int a = 80;

	void show();
}

interface I2{
	int a=11;
	
	void show();
}

class In implements I1,I2 {

	@Override
	public void show() {
		System.out.println("In class: "+I2.a);
	}	
}

public class Interface {

	public static void main(String[] args) {
		I2 i = new In();
		i.show();
	}

}
