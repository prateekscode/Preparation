package com.prepare;

public class Array {
	public static void main(String[] args) {
		int a=0;
		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=a++;
		}
		for(int n:ar)
		System.out.println(n);
	}
}
