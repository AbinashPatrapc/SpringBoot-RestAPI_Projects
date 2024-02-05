package com.numetry.List;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Object> st = new Stack<>();
		st.push(10);
		st.push("Hari");
		st.push(20);
		st.push(15);
		st.push("Ram");
		st.push(true);
		st.push(null);

		System.out.println(st.search(true));
		System.out.println(st);
		System.out.println(st.peek());// Returns last element(LIFO)
		System.out.println(st.pop());// Remove and return last element(top element)
		System.out.println(st);
		System.out.println(st.search(15));
	}
}
