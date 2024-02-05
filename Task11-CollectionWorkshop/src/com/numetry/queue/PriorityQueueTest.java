package com.numetry.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		// System.out.println(q.element()); //NoSuchElementFoundException
		// System.out.println(q.peek());//null

		for (int i = 1; i <= 10; i++) {
			q.add(i);
		}
		System.out.println(q);
		System.out.println(q.poll());// removes and return the first element
		System.out.println(q);
		System.out.println(q.peek());// only returns the first element
		q.offer(new Integer(20));// add new element
		System.out.println(q);
		System.out.println(q.remove());// It will remove and return the first element(If there is no element
		// in the queue then it arise exception NoSuchElementFoundException)
		System.out.println(q);
		System.out.println(q);
	}
}
