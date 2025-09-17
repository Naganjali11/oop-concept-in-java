package com.codegnan.oopexamples;

public class EmplyoeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_01 emp=new Employee_01();
		emp.setDetails("Naganjali", 30000);
		System.out.println("Employee name is : "+emp.name);
		System.out.println("Basic salary is : "+emp.basicsalary);
		System.out.println("HRA allowance is : "+emp.calculateHRA());
		System.out.println("DA allowance is : "+emp.calculateDA());
		System.out.println("Employee Gross salary is : "+emp.calculateGrosssalary());
	}


	}


