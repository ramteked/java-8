package com.dev.functionalInterface.examples;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<String> nameConcat = (firstName, lastName) -> firstName + " " + lastName;
		System.out.println(nameConcat.apply("Devendra", "Ramteke"));
		
	}
}
