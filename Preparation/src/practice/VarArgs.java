package practice;

public class VarArgs {
	static void print(int... a) {
		for(int n:a)
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		print(2,3,4,5,6,7);
	}
}
