package com.codegnan.oopexamples;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewBox originalBox=new NewBox(5.0,3.0,7.0);
		double volume;
		volume=originalBox.height*originalBox.depth*originalBox.width;
		System.out.println("Original Box Volume:"+volume);
		//create new box object using copy constructor
		NewBox copiedBox=new NewBox(originalBox);
		volume=copiedBox.height*copiedBox.width*copiedBox.depth;
		System.out.println("Copied box volume:"+volume);

	}

}
