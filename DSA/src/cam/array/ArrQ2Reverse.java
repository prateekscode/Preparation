package cam.array;

public class ArrQ2Reverse {

	public static void reverse(int ar[]) {
		for (int i = 0; i < ar.length / 2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = temp;
		}
	}

	public static int[] reverseAr(int ar[]) {
		int[] temp = new int[ar.length];
		for (int i = ar.length - 1; i >= 0; i--) {
			temp[temp.length - i - 1] = ar[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 40, 50, 70, 80, 90 };
		reverse(arr);
		for (int x : arr)
			System.out.print(x + "\t");
		System.out.println();
		
		
		int rev[]=reverseAr(arr);
		for(int a:rev)
			System.out.print(a+"\t");
	}
}
//O(n)