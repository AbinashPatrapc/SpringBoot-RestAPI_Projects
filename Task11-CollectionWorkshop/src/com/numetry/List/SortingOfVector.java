package com.numetry.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class SortingOfVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(6);
		v.add(9);
		v.add(2);
		v.add(4);
		v.add(8);
		v.add(1);
		Collections.sort(v, Collections.reverseOrder());
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			int i = (Integer) e.nextElement();
			System.out.println("Vector Elements are:" + i);
		}
	}
}
