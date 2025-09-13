package com.codegnan.oopexamples;

public class Coffee {
	
	    String coffeeType;
	    String size;
	    boolean sugar;
	    Coffee(String coffeeType, String size, boolean sugar) {
	        this.coffeeType = coffeeType;
	        this.size = size;
	        this.sugar = sugar;
	    }

	    void displayOrder() {
	        System.out.println("Coffee Type: " + coffeeType);
	        System.out.println("Size of Coffee: " + size);
	        System.out.println("Sugar in Coffee: " + (sugar ? "Yes" : "No"));
	        
	    }
	}

	


