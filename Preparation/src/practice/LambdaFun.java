package practice;

interface L1{
	public int getLength(String s);
}
public class LambdaFun {
	public static void main(String[] args) {
		L1 l=(s)->s.length();
		System.out.println(l.getLength("Spelling"));
	}
}
