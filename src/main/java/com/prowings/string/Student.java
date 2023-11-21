package com.prowings.string;

import javax.management.RuntimeErrorException;

public class Student implements Cloneable, Deletable {

	int roll;
	String name;
	String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	
	public void delete()
	{
		if(this instanceof Deletable)
			System.out.println("deleted successfully!!");
		else
			throw new RuntimeException("Delete not supported!!");
	}
	
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student(10, "Ram", "Pune");
		Student s2 = (Student) s1.clone();

		System.out.println("cloned successfully!!");

	}
}
