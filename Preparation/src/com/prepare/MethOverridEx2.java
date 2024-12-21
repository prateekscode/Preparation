package com.prepare;

//co-variant return type
//valid from 1.5v before that return type must be same only
class P {
	public Object m1() {
		return null;
	}
}

class C extends P {
	public String m1() {
		return null;
	}
}

class D{
	public Number n1() {
		return null;
	}
}

class E extends D{
	public Integer n1() {
		return null;
	}
}

public class MethOverridEx2 {

}
