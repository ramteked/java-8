package com.dev.functionalInterface.examples;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> nameInUpperCase = (name) -> name.toUpperCase();
	static Function<String, String> nameConcat = (name) -> name.toUpperCase() + " Ramteke";

	public static void main(String[] args) {
	 System.out.println("Name in upper case: "+nameInUpperCase.apply("Devendra"));	
	 System.out.println("Name in concat : "+nameConcat.apply("Devendra"));
	 System.out.println("Whole Name in upper case: "+nameConcat.andThen(nameInUpperCase).apply("Devendra"));
	 System.out.println("Whole Name in compose: "+nameConcat.compose(nameInUpperCase).apply("Devendra"));
		
	}

}
