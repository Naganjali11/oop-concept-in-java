package com.codegnan.oopexamples;
import java.util.Date;
public class RunTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
		System.out.println("Total Memory of the Heap:"+runtime.totalMemory());
		System.out.println("Free Memory in heap:"+runtime.freeMemory());
		long occupiedMemory=runtime.totalMemory()-runtime.freeMemory();
		System.out.println("Occupied memory:"+occupiedMemory);
		for(int i=0;i<10;i++) {
			@SuppressWarnings("unused")
			Date d=new Date();
			d=null;
		}
		System.out.println("Free Memory of the Heap:"+runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory in heap:"+runtime.freeMemory());
		//long occupiedMemory1=runtime.totalMemory()-runtime.freeMemory();
		//System.out.println("Occupied memory:"+occupiedMemory1);

	}

}
