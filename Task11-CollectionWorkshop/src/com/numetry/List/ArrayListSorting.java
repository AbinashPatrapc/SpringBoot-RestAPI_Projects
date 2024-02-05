package com.numetry.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(105, "Abinash", "Balasore"));
		al.add(new Employee(101, "Santosh", "Hyderabad"));
		al.add(new Employee(108, "Rizwan", "Cuttack"));
		al.add(new Employee(112, "Malay", "Deogarh"));
		al.add(new Employee(100, "Bhagia", "Aska"));

		// System.out.println(al);
		Collections.sort(al, new MyComparator1());
		// Collections.sort(al, new MyComparator2());
		// Collections.sort(al, new MyComparator3());
		for (Employee e : al) {
			System.out.println(e);
		}
	}
}

class Employee {
	int id;
	String ename;
	String addrs;

	public Employee(int id, String ename, String addrs) {
		this.id = id;
		this.ename = ename;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Ename=" + ename + ", Addrs=" + addrs + "]";
	}
}

class MyComparator1 implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.id == e2.id)
			return 0;
		else if (e1.id > e2.id)
			return 1;
		else
			return -1;
	}
}

class MyComparator2 implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.ename.compareTo(e2.ename);
	}
}

class MyComparator3 implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.addrs.compareTo(e2.addrs);
	}
}
