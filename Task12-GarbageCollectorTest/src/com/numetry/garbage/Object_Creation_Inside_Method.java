package com.numetry.garbage;

public class Object_Creation_Inside_Method {
	public static void main(String[] args) {
		Student1 s1 = new Student1(102, "Ayush", "Andaman");
		s1.method2();
		System.gc();
	}
}
class Student1 {
	private int id;
	private String name;
	private String addrs;
	public Student1(int id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
	public void method1() {
		Student1 s1 = new Student1(101, "Abinash", "Odisha");
	}
	public void method2() {
		method1();
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