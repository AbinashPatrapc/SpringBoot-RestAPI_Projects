package com.numetry.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(14);
		set.add(2);
		set.add(4);
		set.add(8);
		set.add(17);
		set.add(21);
		set.add(12);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.comparator());
		System.out.println(set.headSet(14));
		System.out.println(set.tailSet(8));
		System.out.println(set.subSet(8, 21));

	}
}
