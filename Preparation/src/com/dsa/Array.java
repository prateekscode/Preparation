package com.dsa;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[11];
		for (int i = 1; i < 11; i++)
			arr[i] = i*2;
		
		String[] ar1= {"A","B","C","D","E","F"};
		
		String[] arn=new String[ar1.length];
		for(int i=0;i<ar1.length;i++)
			arn[i]=ar1[i];
		
		for(String h:arn)
			System.out.println(h);
		System.out.println();
		
		
		for (int i : arr)
			System.out.println(i);
		System.out.println();
		
		for(String t:ar1) {
			System.out.println(t);
		}
	}
}
