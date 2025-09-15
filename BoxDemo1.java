package com.codegnan.oopexamples;

public class BoxDemo1 {
	double height;
	double width;
	double depth;
	//method without parameters without return type
	public void volume() {
		System.out.println("Volume is:");
		System.out.println(width*height*depth);
		
	}
	//with parameter without return
	public double vol() {
		return height*depth*width;
	}
	//with parameter with return
	public double setDim(double width,double height,double depth) {
		return width*height*depth;
	}
	//without return with parameter
	public void setDimension(double width,double height,double depth) {
		double volume=height*depth*width;
		System.out.println("voulme is:"+volume);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo1 b1=new BoxDemo1();
		b1.height=2.0;
		b1.width=3.0;
		b1.depth=5.0;
		b1.volume();
		System.out.println("b1 volume:"+b1.vol());
		System.out.println("box1 volume:"+b1.setDim(4.0,6.0,2.0));
		b1.setDimension(-2.0,-3.0,4.0);
		
		BoxDemo1 b2=new BoxDemo1();
		b2.height=12.0;
		b2.width=3.0;
		b2.depth=2.0;
		b2.volume();
		System.out.println("b2 volume:"+b2.vol());
		System.out.println("box2 volume:"+b2.setDim(40.0,60.0,20.0));
		b2.setDimension(-4.0,-3.0,6.0);
		
		
		

	}

}
