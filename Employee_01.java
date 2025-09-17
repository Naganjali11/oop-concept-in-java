package com.codegnan.oopexamples;

public class Employee_01 {
	 String name;
     double basicsalary;
     
     public void setDetails(String n,double salary) {
   	  this.name=n;
   	  this.basicsalary=salary;
   	  }
     
     public double calculateHRA() {
   	  return basicsalary * 0.20;
     }
     
     public double calculateDA() {
   	  return 0.10 * basicsalary;
     }
     
     public double calculateGrosssalary() {
    	    return basicsalary + calculateHRA() + calculateDA();
    	}

}