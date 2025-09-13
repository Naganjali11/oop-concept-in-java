package com.codegnan.oopexamples;

public class CoffeeMain {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee("Espresso", "Small", true);  // sugar added
        c1.displayOrder();

        Coffee c2 = new Coffee("Latte", "Medium", true);  // sugar added
        c2.displayOrder();

        Coffee c3 = new Coffee("Cappuccino", "Large", false); // no sugar
        c3.displayOrder();

	}

}
