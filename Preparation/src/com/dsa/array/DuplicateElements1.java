package com.dsa.array;

public class DuplicateElements1 {
	public static void findDuplicates(int[] arr) {
		System.out.print("Duplicates: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			// To avoid printing same element multiple times
			boolean alreadyPrinted = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					alreadyPrinted = true;
					break;
				}
			}
			if (isDuplicate && !alreadyPrinted) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 5, 3, 1, 6, 2 };
		findDuplicates(arr);
	}
}
