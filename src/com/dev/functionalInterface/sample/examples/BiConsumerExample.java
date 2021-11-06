package com.dev.functionalInterface.sample.examples;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String, String> concatName = (firstName, lastName) -> System.out.println(firstName + " " + lastName);
		concatName.accept("Devendra", "Ramteke");
		BiConsumer<Integer, Integer> addition = (no1, no2) -> System.out.println(no1 + no2);
		addition.accept(10, 20);
	}

}
