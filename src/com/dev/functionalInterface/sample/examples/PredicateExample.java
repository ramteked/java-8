package com.dev.functionalInterface.sample.examples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> totalMarks = no -> no >= 6;
		System.out.println("Pass: "+totalMarks.test(6));
		System.out.println("Pass: "+totalMarks.test(5));
		
		BiPredicate<Integer, Integer> compare = (no1, no2) -> no1 >= no2;
		System.out.println("Is no1 grater then no2 :"+ compare.test(10, 20));
		System.out.println("Is no1 grater then no2 :"+ compare.test(20,10));

	}

}
