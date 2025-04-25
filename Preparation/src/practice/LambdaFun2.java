package practice;

interface L2{
	public int add(int a, int b);	
}

public class LambdaFun2 {
	public static void main(String[] args) {
		L2 l=(a,b)->a+b;
		System.out.println(l.add(5, 10));
	}
}
