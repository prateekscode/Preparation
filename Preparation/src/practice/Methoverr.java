package practice;

class G{
	void m1() {
		System.out.println("Hii G");
	}
}

class H extends G{
	void m1() {
		System.out.println("Hii H");
	}
}
public class Methoverr {
public static void main(String[] args) {
	H h=new H();
	h.m1();
	
	G g=new H();
	g.m1();
}
}