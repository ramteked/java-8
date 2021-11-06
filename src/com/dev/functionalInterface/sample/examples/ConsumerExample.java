package com.dev.functionalInterface.sample.examples;

import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<String> printNameInUpperCase = name -> System.out.println("Name : " + name.toUpperCase());
	static Consumer<String> concatName = name -> System.out.println(name + " Ramteke");

	public static void main(String[] args) {
		printNameInUpperCase.accept("Devendra");
		concatName.accept("Devendra");
	}

}
