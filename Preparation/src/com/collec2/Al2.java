package com.collec2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Al2 {
	public static void main(String[] args) {
		ArrayList all = new ArrayList();
		all.add(23);
		all.add("abv");
		all.add("We");
		all.add(100);
		all.add(null);

		System.out.println(all);
		System.out.println();
		System.out.println(all.indexOf("We"));
		all.set(4, "Last");
		all.remove(3);
		System.out.println();

		ListIterator li = all.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println();
		while (li.hasPrevious())
			System.out.println(li.previous());
		System.out.println();

		Iterator iterator = all.iterator();
		while (iterator.hasNext()) {
			Object ob = iterator.next();
			if (ob instanceof String) {
				((String) ob).toUpperCase();
				System.out.println(ob);
			} else {
				System.out.println(ob);
			}
		}
	}
}
