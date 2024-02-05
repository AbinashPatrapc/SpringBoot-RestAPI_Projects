package com.numetry.garbage;

public class Nullifyng_Object {
	public static void main(String[] args) {
		Student s1=new Student(101,"Abinash","Hyderabad");
		System.out.println(s1);
		s1=null;
		System.gc();
	}
}
class Student {
	private int id;
	private String name;
	private String addrs;
	
	public Student(int id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student Successfully garbage collected");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}
}