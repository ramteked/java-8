package com.dev.functionalInterface.sample.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, String> toUpperCase = name -> name.toUpperCase();
		System.out.println(toUpperCase.apply("Devendra"));
		
		BiFunction<Integer, Integer, Integer> sum = (no1, no2) -> no1+no2;
		System.out.println(sum.apply(10, 20));
		
	}
}
