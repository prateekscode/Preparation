package com.designPatterns;

public class ThreadSafeSing {
public static void main(String[] args) {

	//We get diff. hashcode means diff. instances createdwithout synchronized keyword
	Runnable r1=()->{
		ThreSaf i1= ThreSaf.getInstance();
		System.out.println(i1.hashCode());
	};

	Runnable r2=()->{
		ThreSaf i2= ThreSaf.getInstance();		
		System.out.println(i2.hashCode());
	};
	
	Thread t=new Thread(r1);
	Thread t2=new Thread(r2);
	t.start();
	t2.start();
	
	
}
}

class ThreSaf{
	private static ThreSaf instance;
	
	private ThreSaf() {}

//	solving using synchronized keyword
	public static synchronized ThreSaf getInstance() {
		if(instance==null)
			instance=new ThreSaf();
		return instance;
	}
}