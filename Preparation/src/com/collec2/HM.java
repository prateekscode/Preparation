package com.collec2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HM {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("C", "ABC");
		hm.put("B", 123);
		hm.put("111", "D");
		hm.put("A", "YY");

		System.out.println(hm);

		Set k = hm.keySet();
		System.out.println(k);

		System.out.println(hm.containsKey(21));
		System.out.println(hm.containsValue(123));

		hm.replace("B", 102);

		Set s = hm.entrySet();
		System.out.println(s);

		Iterator it = hm.keySet().iterator();
		while (it.hasNext()) {
			Object k1 = it.next();
			System.out.println(k1+"--- "+hm.get(k1));
		}
	}
}
