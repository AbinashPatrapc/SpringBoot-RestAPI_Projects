package com.numetry.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEvenOdd {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(19);
		al.add(17);
		al.add(14);
		al.add(16);
		al.add(11);
		al.add(10);
		System.out.println("Elements are:" + al);
		// STREAM API
		List even = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		al.stream().filter(x -> x % 2 != 0).forEach(System.out::print);

//		ArrayList odd = new ArrayList();
//
//		for (int i = 0; i < al.size(); i++) {
//			if (al.get(i) % 2 == 0) {
//				even.add(al.get(i));
//			} else {
//				odd.add(al.get(i));
//			}
//		}
//		System.out.println("Even Numbers::" + even);
//		System.out.println("Odd Numbers::" + odd);

	}

}
