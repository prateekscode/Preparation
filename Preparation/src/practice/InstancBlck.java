package practice;

public class InstancBlck {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		InstancBlck in = new InstancBlck();
		InstancBlck in1 = new InstancBlck();
		InstancBlck in2 = new InstancBlck();

		System.out.println("Object Count: " + count);
	}
}