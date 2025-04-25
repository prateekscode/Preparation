package practice;

interface L3{
	public void print();
}
public class LambdaFun3 {
public static void main(String[] args) {
	L3 l=()->System.out.println("Hey!");
	l.print();
}
}
