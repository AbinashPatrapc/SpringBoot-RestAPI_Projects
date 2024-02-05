package com.numetry.List;

import java.util.Stack;

public class Stacktest {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		// Index Offset
		st.push("A"); // 0 5
		st.push("B");// 1 4
		st.push("C");// 2 3
		st.push("D");// 3 2
		st.push("E");// 4 1
		System.out.println(st.search("A"));// It returns offset of the element
		System.out.println(st.search("v"));// If the element is not present it returns -1
		System.out.println("===============");
		st.forEach(x -> System.out.println(x));
		System.out.println("===============");
		st.forEach(System.out::println);

	}

}
