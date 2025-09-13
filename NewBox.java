package com.codegnan.oopexamples;

public class NewBox {

	
		// TODO Auto-generated method stub
		double width;//instance variables
		double height;
		double depth;
		public NewBox(double width, double height, double depth) {
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		//copy constructor - copies dimensions from other box object
		public NewBox(NewBox obj) {
			width=obj.width;
			height=obj.height;
			depth=obj.depth;
		}
		
	}

	

	
	


