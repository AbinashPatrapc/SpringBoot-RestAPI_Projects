package com.numetry.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<>();
		h.add(8);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(9);
		h.add(15);
		h.add(18);
		h.add(20);
		System.out.println(h);
		// Sorting of HashSet: We can not sort HashSet Directly,We can sort converting
		// HashSet Object to ArrayList or TreeSet object then We can able to sort
		// HashSet
		TreeSet set = new TreeSet(h);
		// By using treeSet we can only sort in default Natural Sorting order
		// to sort by customized way ArrayList is the best Choice
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

//useless
class MyComparator implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		Integer i1 = (Integer) ob1;
		Integer i2 = (Integer) ob2;
		if (i1 < i2)
			return 1;
		else
			return -1;
	}
}
