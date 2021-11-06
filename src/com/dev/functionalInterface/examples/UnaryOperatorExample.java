package com.dev.functionalInterface.examples;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	public static void main(String[] args) {
		
		UnaryOperator<String> concatName = name -> name.concat(" Ramteke");
		System.out.println(concatName.apply("Devendra"));
		
		UnaryOperator<Integer> numberMultiply = no -> no *10;
		System.out.println(numberMultiply.apply(5));
	}

}
