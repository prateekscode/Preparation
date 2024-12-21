package practice;

class Stat{
	static int a=10;
	static int b=5;
}
public class StaticMethod {
	public static void main(String[] args) {
		System.out.println(Stat.a);
		System.out.println(Stat.b);

		Stat s=new Stat();
		System.out.println(s.a);
		System.out.println(s.b);
		
		Stat s1=null;
		System.out.println(s1.a);
		System.out.println(s1.b);
	}
}
