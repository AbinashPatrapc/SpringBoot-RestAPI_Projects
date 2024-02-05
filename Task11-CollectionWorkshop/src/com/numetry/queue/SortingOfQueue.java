package com.numetry.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortingOfQueue {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>(new MyComparator());
		q.offer("Abhilash");
		q.offer("Laxman");
		q.offer("Zampa");
		q.offer("Bikash");
		q.offer("Nirnay");
		q.offer("Sambit");
		q.offer("Anuradha");
		System.out.println(q);
	}
	
}

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}