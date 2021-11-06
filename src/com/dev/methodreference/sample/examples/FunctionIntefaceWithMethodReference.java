package com.dev.methodreference.sample.examples;

import java.util.function.Function;

public class FunctionIntefaceWithMethodReference {
	
	public static void main(String[] args) {
		
		Function<String, String> toUpperCase = name -> name.toUpperCase();
		System.out.println(toUpperCase.apply("java8"));
		
		Function<String, String> toUpperCaseUsingMethodReference = String::toUpperCase;
		System.out.println(toUpperCaseUsingMethodReference.apply("Devendra"));
	}

}
