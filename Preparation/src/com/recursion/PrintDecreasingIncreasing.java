package com.recursion;

public class PrintDecreasingIncreasing {
	public static void main(String[] args) {
		printDecreIncre(5);
	}
	
	public static void printDecreIncre(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printDecreIncre(n-1);
		System.out.println(n);
	}
}