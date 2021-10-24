package com.dev.lambdas.examples;

import java.util.Comparator;

public class ComparatorLambdas {
	
	/**
	 * Prior to java 8
	 */
	
	public static void main(String[] args) {
	
		Comparator<Integer> compareNumbers = new Comparator<Integer>() {

			@Override
			public int compare(Integer number1, Integer number2) {
				return number1.compareTo(number2); // no1 == no2 : 0
				                                  // no1 > no2 : 1
				                                 // no1 < no2 : -1
			}
		};

		System.out.println("Compare numbers using prior java comparator :"+ compareNumbers.compare(2, 2));
		System.out.println("Compare numbers using prior java comparator :"+ compareNumbers.compare(3, 2));
		System.out.println("Compare numbers using prior java comparator :"+ compareNumbers.compare(2, 3));
		
		/**
		 * Using java 8 lambdas
		 */
		
		Comparator<Integer> compareNumbers1 = (Integer no1, Integer no2) -> no1.compareTo(no2); 
		
		System.out.println("Compare numbers using lambdas comparator :"+ compareNumbers1.compare(2, 2));
		System.out.println("Compare numbers using lambdas comparator :"+ compareNumbers1.compare(3, 2));
		System.out.println("Compare numbers using lambdas comparator :"+ compareNumbers1.compare(2, 3));
	
	}
	
	
}
