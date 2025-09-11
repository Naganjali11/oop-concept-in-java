package com.codegnan.oopexamples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box();
		mybox1.height=2.0;
		mybox1.depth=5.0;
		mybox1.width=3.0;
		
		double volume;
		volume=mybox1.height*mybox1.width*mybox1.depth;
		System.out.println("Box1 Volume"+volume);
		
		Box mybox2=new Box();
		mybox2.height=10.0;
		mybox2.depth=50.0;
		mybox2.width=5.0;
		volume=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println("Box2 Volume"+volume);


	}

}
