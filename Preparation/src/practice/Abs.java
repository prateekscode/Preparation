package practice;

abstract class Abst {
	int n;
	int k;

	public Abst(int a, int b) {
		this.n = a;
		this.k = b;
	}

	abstract void display();

	void show() {
		System.out.println("Normal method: " + n);
		System.out.println("Normal method: " + k);
	}
}

public class Abs extends Abst {

	public Abs() {
		super(2, 3);
	}

	@Override
	void display() {
		System.out.println("Abst method of Abst");
	}

	public static void main(String[] args) {
		Abst a = new Abs();
		a.display();
		a.show();
	}
}
