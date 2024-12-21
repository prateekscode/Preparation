package com.prepare;

public class VArArgs {
	public static void main(String[] args) {
		display(2,3,5,7,8,9,13);
	}
	static void display(int...a) {
		for(int i:a)
			System.out.println(i);
	}
}
