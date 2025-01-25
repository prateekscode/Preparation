package com.designPatterns.Structural.Adapter;

class Volt{
	private int volts;
	
	public Volt(int v) {
		this.volts=v;
	}
	
	public int getVolts() {
		return volts;
	}
	
	public void setVolts(int volt) {
		this.volts=volt;
	}
}

class Socket{
	public Volt getvolt() {
		return new Volt(120);
	}
}
public class TestAdaptor {

}
