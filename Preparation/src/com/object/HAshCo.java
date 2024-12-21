package com.object;

class H{
	void sho() {
		System.out.println("Hello");
	}
}

public class HAshCo {
	public static void main(String[] args) {
		H hi=new H();
		hi.sho();
		
		System.out.println(hi.hashCode());
	
		H he=new H();
		he.sho();
		
		System.out.println(he.hashCode());
	
	}
}
