package com.numetry.garbage;

public class Re_assigning_Reference {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Abinash","Hyderabad");
		Employee e2=new Employee(102,"Ayush","Bangalore");
		System.out.println(e1);
		System.out.println(e2);
		e1=e2;
		System.gc();
	}
}
class Employee {
	private int id;
	private String name;
	private String addrs;
	
	public Employee(int id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee Object successfully garbage collected");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
}