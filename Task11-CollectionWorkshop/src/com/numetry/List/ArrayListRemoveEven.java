package com.numetry.List;

import java.util.ArrayList;

public class ArrayListRemoveEven {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(13);
		al.add(6);
		al.add(19);
		al.add(12);
		al.add(28);
		al.add(24);
//For Every remove method call after removing one object it will form a new arraylist obj
//so we have to do i-- to start from zero index everytime.
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				al.remove(i);

				i--;
			}
		}
		System.out.println(al);
	}
}
