package com.java8;

import java.util.function.Consumer;

public class Cnsumr {
	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("\"c_o_n_s_u_m_e_r\"");
	}
}
