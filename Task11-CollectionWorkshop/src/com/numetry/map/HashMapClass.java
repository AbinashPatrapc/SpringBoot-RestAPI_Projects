package com.numetry.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Abinash");
		hm.put(121, "Zeeshan");
		hm.put(111, "Yakub");
		hm.put(103, "Wasim");
		hm.put(108, "Priya");
		hm.put(118, "Surya");
		hm.put(107, "Virat");
		System.out.println(hm);
		// To get only keys
		Set<Integer> s1 = hm.keySet();
		System.out.println(s1);
		// To get only Values
		Collection c1 = hm.values();
		System.out.println(c1);
		// To get EntrySet
		Set s2 = hm.entrySet();
		System.out.println(s2);
		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "--------" + m1.getValue());
			// System.out.println(itr.next());
		}

	}
}
