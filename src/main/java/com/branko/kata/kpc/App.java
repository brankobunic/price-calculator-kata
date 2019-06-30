package com.branko.kata.kpc;

import model.Product;

public class App {
    public static void main( String[] args ) {
    	
    	int flatRateTax = 20;
    	
    	Product book = new Product("The Little Princ", 12345, 20.25);
    	
    	System.out.println(book.toString());
    	
    	book.addPercent(flatRateTax);
    	
    	System.out.println(book.toString());
    	
    	book.addPercent(21);
    	
    	System.out.println(book.toString());
        	
    }
}
