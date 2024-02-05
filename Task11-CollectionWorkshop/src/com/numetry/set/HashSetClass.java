package com.numetry.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet();
		h.add(8);
		h.add(5);
		h.add(2);
		h.add(30);
		h.add(21);
		h.add(15);
		// h.add(null);
		h.add(20);
		System.out.println(h);
		// Sorting of HashSet: We can not sort HashSet Directly,We can sort converting
		// HashSet Object to ArrayList or TreeSet obj then We can able to sort HashSet
		ArrayList<Integer> al = new ArrayList<>(h);
		Collections.sort(al);
		System.out.println("Default Natural Sorting Order(Ascending)");
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse of Default Natural Sorting Order(Descending)");
		// TreeSet ts = new TreeSet(h);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
