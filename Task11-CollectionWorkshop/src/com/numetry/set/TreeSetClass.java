package com.numetry.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
     public static void main(String[] args) {
	   TreeSet<Integer> set=new TreeSet<Integer>(new MyComparator1());
	   set.add(12);
	   set.add(18);
	   set.add(15);
	   set.add(21);
	   set.add(36);
	   set.add(28);
	   set.add(90);
	   set.add(45);
	   set.add(21);
	   set.add(8);
	   System.out.println(set);
	   
//	   Iterator itr=set.descendingIterator();
//	   
//	   while(itr.hasNext()) {
//		   System.out.println(itr.next());
//	   }
		   
     }
}
class MyComparator1 implements Comparator{
	

	public int compare(Object ob1,Object ob2) {
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		 if(i1>i2)
		 return 1;
		 else
		 return -1;
}
  }
