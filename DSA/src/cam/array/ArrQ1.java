package cam.array;

public class ArrQ1 {

	public static int largestElement(int[] ar) {
		int large = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (large < ar[i])
				large = ar[i];
		}
		return large;
	}

	public static void main(String[] args) {
		int arr[] = { 40, 50, 30, 10, 200, 90, 70, 55 };
		int largestElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largestElement < arr[i]) {
				largestElement = arr[i];
			}
		}
		int largeval=largestElement(arr);
		System.out.println("Largest value: "+largeval);
		System.out.println(largestElement);
	}
}

//O(n)