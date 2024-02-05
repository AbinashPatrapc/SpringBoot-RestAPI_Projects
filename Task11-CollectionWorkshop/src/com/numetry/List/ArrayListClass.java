package com.numetry.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(51);
		al.add(88);
		al.add(17);
		al.add(2);
		al.add(11);
		System.out.println(al);
		Collections.sort(al, (i1, i2) -> i1 - i2);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ",");

		}

	}
}

class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
//	    Integer i1=(int)obj1;
//	    Integer i2=(int)obj2;
		return i1.compareTo(i2);

//	    if(i1==i2)
//	    	return 0;
//	    else if(i1>i2)
//	    return -1;
//	    else
//	    	return 1;

	}

}