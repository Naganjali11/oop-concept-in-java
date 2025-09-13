package com.codegnan.oopexamples;

public class Employee {
	int id;
	String name;
	String department;
	public Employee() {
		this(0,"unknown");
		System.out.println("Default constructor");
	}
	public Employee(int id,String name) {
		this(id,name,"unassigned");
		System.out.println("2 parameter Constructor");
		
	}
	public Employee(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.department=department;
		System.out.println("3 parameter constructor");
		
	}
	public void displayInfo() {
		System.out.println("Employee Id:"+this.id);
		System.out.println("Employee Name:"+this.name);
		System.out.println("Employee Department:"+this.department);	
	}
	

}
