package com.pattern;

public class Pt9 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
}
/*
 * Check by matrix
 * if sum of i and j is even printed 1 otherwise 0
 * 
 1
 01
 101
 0101
 10101
 */
