package com.codegnan.oopexamples;

public class GarbageTest {
	public void finalize() {
		System.out.println("Garbage collector called finalize() method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageTest obj=new GarbageTest();
		obj=null;
	System.out.println("Requesting the garbage collector");
	System.gc();
	System.out.println("End of the Main Method");

	}

}


