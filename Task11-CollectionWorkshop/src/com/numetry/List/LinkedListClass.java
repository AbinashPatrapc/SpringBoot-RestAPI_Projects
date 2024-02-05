package com.numetry.List;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListClass implements Comparator {
        public static void main(String[] args) {
			LinkedList ll=new LinkedList();
			ll.add(56);
			ll.add(23);
			ll.add(29);
			ll.add(56);
			ll.add(12);
			ll.add(18);
			ll.add(12);
			ll.add(22);
			ll.add(23);
			System.out.println(ll);
			Collections.sort(ll);
			System.out.println(ll);
		}
        public int compare(Object obj1,Object obj2) {
        	Integer i1=(Integer)obj1;
        	Integer i2=(Integer)obj2;
        	if(i1==i2)
        		return 0;
        	else if(i1>i2)
        		return 1;
        	else
        		return -1;
        }
}
