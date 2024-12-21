package practice;

class Co{
	public Object m1() {
		System.out.println("M1-CO");
		return null;
	}
	
	Number m2() {
		return 102;
	}
}

class Co1 extends Co{
	public String m1() {
		return "Co1 m1()";
	}
	
	Integer m2() {
		return 120;
	}
}

public class CoVarOvetrr {
	public static void main(String[] args) {
		Co1 c=new Co1();
		System.out.println(c.m1());
		
		Co1 c2=new Co1();
		System.out.println(c2.m2());
	}
}
