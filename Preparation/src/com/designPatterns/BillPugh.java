package com.designPatterns;

public class BillPugh {
	public static void main(String[] args) {
		BillPughSing b=BillPughSing.getInstance();
		BillPughSing b1=BillPughSing.getInstance();
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
	}
}

class BillPughSing{
	private BillPughSing() {}
	
	private static class InnerCls{
		private static final BillPughSing instance=new BillPughSing();
	}
	
	public static BillPughSing getInstance() {
		return InnerCls.instance;
	}
}