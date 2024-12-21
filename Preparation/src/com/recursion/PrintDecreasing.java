package com.recursion;

public class PrintDecreasing {
	public static void main(String[] args) {
		printDecre(5);
	}
	
	public static void printDecre(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printDecre(n-1);
	}
}
