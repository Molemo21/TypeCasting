package com.opps.demo;

public class Tpecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Widening  Typecasting Example
		//Widening occurs when smaller data type is converted to a larger data type.
		//Cup to bottle, the bottle can hold all the water coming from the cup.
		//Similar to how an int can be converted to a long in Java
		
		int cup = 250; //Let the cup be of integer 250 milliliters
		
		long bottle = cup; //Let the bottle equal the cup(250)
		
		//When the water from cup is poured in bottle each ounce will fit in the bottle
		//Implicit casting from int to long
		System.out.println("Cup to Bottle (int to long): "  +bottle+ " milliliters");
		
		//Narrowing Typecasting Example
	    //Narrowing requires explicit conversion and may result in data loss or reduced precision
		//In our example, if we pour water to a bottle from bucket.
		// If the bucket has more water, the bottle will over-flower water will be lost
		
		double largeBucket = 500.75; //Let the largeBucket be of decimal 500.75 milliliters
		
		int smallBottle = (int)largeBucket; //Let the smallBottle be a integer to the largeBucket
		//The smallBottle will not be of largeBucket exactly, because largeBucket has decimals.
//So in our example some contents will be lost because the water from Bucket to small bottle will overflow.
		//Explicit casting from double to int.
		System.out.println("Bucket to Bottle (double to int): " + smallBottle + " millilitres");
		
	
		
	}

}
