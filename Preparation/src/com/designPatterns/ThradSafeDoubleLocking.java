package com.designPatterns;

public class ThradSafeDoubleLocking {
	public static void main(String[] args) {

		// We get diff. hashcode means diff. instances createdwithout synchronized
		// keyword
		Runnable r1 = () -> {
			ThreSaf1 i1 = ThreSaf1.getInstance();
			System.out.println(i1.hashCode());
		};

		Runnable r2 = () -> {
			ThreSaf1 i2 = ThreSaf1.getInstance();
			System.out.println(i2.hashCode());
		};

		Thread t = new Thread(r1);
		Thread t2 = new Thread(r2);
		t.start();
		t2.start();

	}
}

class ThreSaf1 {
	private static ThreSaf1 instance;

	private ThreSaf1() {
	}

//	solving using synchronized block because of extra overhead at method level
	public static ThreSaf1 getInstance() {
		if (instance == null) {
			synchronized (ThreSaf1.class) {
				if (instance == null) {
					instance = new ThreSaf1();
				}
			}
		}
		return instance;
	}
}
