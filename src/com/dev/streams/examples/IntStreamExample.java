package com.dev.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Sum of integer
 * @author Lenovo
 *
 */
public class IntStreamExample {

	static List<Integer> inputs = Arrays.asList(1,2,3,4,5,6);
	
	public static int sumOfNumbers() {
		 inputs.stream().reduce(0,(no1, no2) -> no1+no2);
		 
		return inputs.stream().mapToInt(Integer::valueOf).sum();
		
	}
	
	public static int sumOfNumbersUsingIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of numbers : "+ sumOfNumbers());
		System.out.println("Sum of numbers : "+ sumOfNumbersUsingIntStream());
	}
}
