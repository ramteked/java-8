package com.dev.functionalInterface.examples;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> isDivisibleOf2 = (no) -> no % 2 == 0;
	static Predicate<Integer> isDivisibleOf5 = (no) -> no % 5 == 0;

	public static void main(String[] args) {

		isDivisibleOf2();
		predicateAnd();
		predicateOR();
		predicateNeget();

	}

	public static void isDivisibleOf2() {
		System.out.println("Number divisible by 2: " + isDivisibleOf2.test(9));
	}

	public static void predicateAnd() {
		System.out.println("Number divisible by 2 and 5 : " + isDivisibleOf2.and(isDivisibleOf2).test(21));
	}
	
	public static void predicateOR() {
		System.out.println("Number divisible by 2 or 5 : " + isDivisibleOf2.or(isDivisibleOf2).test(16));
	}
	
	public static void predicateNeget() {
		System.out.println("Number divisible by 2 or 5 : " + isDivisibleOf2.or(isDivisibleOf2).negate().test(16));
	}


}
